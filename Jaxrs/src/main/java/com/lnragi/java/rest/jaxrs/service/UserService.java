package com.lnragi.java.rest.jaxrs.service;

/**
 * @author Laxminarsaiah Ragi
 *
 */
import java.util.List;

import com.lnragi.java.rest.jaxrs.entity.UserEntity;

public interface UserService {

	public UserEntity addUser(UserEntity user);

	public List<UserEntity> findAll();

	public UserEntity findById(Integer id);
}
