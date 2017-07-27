package org.ssm.dufy.service;

import org.ssm.dufy.entity.User;

public interface IUserService {

	User getUserById(int id);
	void insert(User user);

}

