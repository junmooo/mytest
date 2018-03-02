package cn.itcast.core.mapper;

import java.util.List;

import cn.itcast.core.pojo.User;

public interface UserMapper {

	// 查询结果集
	public List<User> findUserList();

	public void saveUser(User user);
}
