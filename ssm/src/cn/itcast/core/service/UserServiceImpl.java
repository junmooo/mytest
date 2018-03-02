package cn.itcast.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.core.mapper.UserMapper;
import cn.itcast.core.pojo.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findUserList() {
		return 	userMapper.findUserList();
	}
	@Override
	public void saveUser(User user){
		userMapper.saveUser(user);
	}
}
