/**
 * 
 */
package com.lnragi.java.rest.jaxrs.service;

import java.util.List;
import java.util.Optional;

import com.lnragi.java.rest.jaxrs.dao.UserDAOImpl;
import com.lnragi.java.rest.jaxrs.dao.UserDao;
import com.lnragi.java.rest.jaxrs.entity.UserEntity;
import com.lnragi.java.rest.jaxrs.exceptions.UserNotFoundException;

/**
 * @author Laxminarsaiah Ragi
 *
 */
public class UserServiceImpl implements UserService {

	@Override
	public UserEntity addUser(UserEntity user) {
		UserDao userDao = new UserDAOImpl();
		return userDao.addUser(user);
	}

	@Override
	public List<UserEntity> findAll() {
		UserDao userDao = new UserDAOImpl();
		return userDao.findAll();
	}

	@Override
	public UserEntity findById(Integer id) {
		UserDao userDao = new UserDAOImpl();
		return Optional.ofNullable(userDao.findById(id)).orElseThrow(
				() -> new UserNotFoundException(id));
	}

	@Override
	public UserEntity updateUser(UserEntity usr) {
		UserDao userDao = new UserDAOImpl();
		return userDao.updateUser(usr);
	}

	@Override
	public void deleteUser(Integer id) {
		UserDao userDao = new UserDAOImpl();
		userDao.deleteUser(id);
	}

}
