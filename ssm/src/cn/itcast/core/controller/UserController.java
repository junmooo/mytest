package cn.itcast.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.core.pojo.QueryVo;
import cn.itcast.core.pojo.User;
import cn.itcast.core.service.UserService;


/**
 * 用户管理
 */
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user/list.action")
	public String list(Model model){
		
		List<User> userList = userService.findUserList();
		model.addAttribute("userList",userList);
		return "list";
	}
	
	@RequestMapping(value = "/user/add.action")
	public String add(){

		return "insert";
	}
	@RequestMapping(value = "/user/insert.action")
	public String save(QueryVo vo){
		System.out.println(vo.getUser().getName());
		System.out.println(vo.getUser().getBirthday());
		userService.saveUser(vo.getUser());
		return "redirect:/user/list.action";
	}
	
	
}
