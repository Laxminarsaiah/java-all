/**
 * 
 */
package com.lnragi.java.rest.jaxrs.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lnragi.java.rest.jaxrs.entity.UserEntity;
import com.lnragi.java.rest.jaxrs.utils.HibrnateConfiguration;

/**
 * @author Laxminarsaiah Ragi
 *
 */
public class UserDAOImpl implements UserDao {

	private Session session = null;

	@Override
	public UserEntity addUser(UserEntity user) {
		try {
			session = HibrnateConfiguration.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.save(user);
			tx.commit();
		} catch (HibernateException | SQLException e) {
			e.printStackTrace();
		} finally {
			HibrnateConfiguration.closeSession(session);
		}
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserEntity> findAll() {
		List<UserEntity> listOfusers = new ArrayList<>();
		try {
			session = HibrnateConfiguration.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			listOfusers = session.createQuery("from UserEntity").list();
			tx.commit();
		} catch (HibernateException | SQLException e) {
			e.printStackTrace();
		} finally {
			HibrnateConfiguration.closeSession(session);
		}
		return listOfusers;
	}

	@Override
	public UserEntity findById(Integer id) {
		UserEntity user = null;
		try {
			session = HibrnateConfiguration.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			user = session.get(UserEntity.class, id);
			tx.commit();
		} catch (HibernateException | SQLException e) {
			e.printStackTrace();
		} finally {
			HibrnateConfiguration.closeSession(session);
		}
		return user;
	}

	@Override
	public UserEntity updateUser(UserEntity user) {
		try {
			session = HibrnateConfiguration.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			UserEntity updatableUsr = session.get(UserEntity.class, user.getId());
			System.out.println(updatableUsr);
			session.update(updatableUsr);
			tx.commit();
		} catch (HibernateException | SQLException e) {
			e.printStackTrace();
		} finally {
			HibrnateConfiguration.closeSession(session);
		}
		return user;
	}

	@Override
	public void deleteUser(Integer id) {
		try {
			session = HibrnateConfiguration.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			UserEntity deletableUsr = session.get(UserEntity.class, id);
			session.delete(deletableUsr);
			tx.commit();
		} catch (HibernateException | SQLException e) {
			e.printStackTrace();
		} finally {
			HibrnateConfiguration.closeSession(session);
		}
	}

}
