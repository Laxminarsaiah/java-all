package com.lnragi.java.rest.jaxrs.dao;

import java.util.List;

import com.lnragi.java.rest.jaxrs.entity.UserEntity;

/**
 * @author Laxminarsaiah Ragi
 *
 */
public interface UserDao {

	public UserEntity addUser(UserEntity user);

	public List<UserEntity> findAll();

	public UserEntity findById(Integer id);

	public UserEntity updateUser(UserEntity usr);

	public void deleteUser(Integer id);

}
