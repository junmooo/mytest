package cn.itcast.core.service;

import java.util.List;

import cn.itcast.core.pojo.User;

public interface UserService {

	public List<User> findUserList();

	public void saveUser(User user);

}
