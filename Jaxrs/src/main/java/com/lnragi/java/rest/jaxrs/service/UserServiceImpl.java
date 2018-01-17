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
		return new UserDAOImpl().addUser(user);
	}

	@Override
	public List<UserEntity> findAll() {
		return new UserDAOImpl().findAll();
	}

	@Override
	public UserEntity findById(Integer id) {
		return Optional.ofNullable(new UserDAOImpl().findById(id)).orElseThrow(
				() -> new UserNotFoundException(id));
	}

	@Override
	public UserEntity updateUser(UserEntity usr) {
		return new UserDAOImpl().updateUser(usr);
	}

	@Override
	public void deleteUser(Integer id) {
		new UserDAOImpl().deleteUser(id);
	}

}
