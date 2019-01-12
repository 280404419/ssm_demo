package org.ssm.dufy.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.ssm.dufy.entity.User;
import org.ssm.dufy.service.IUserService;

import java.util.Map;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping(value="/showname",method=RequestMethod.GET)
	public String showUserName(@RequestParam("uid") int uid,HttpServletRequest request,Model model){
		User user = userService.getUserById(uid);
		if(user != null){
			request.setAttribute("name", user.getUserName());
			model.addAttribute("name", user.getUserName());
			return "showName";
		}
		request.setAttribute("error", "没有找到该用户！");
		return "error";
	}
	@RequestMapping(value="/adduser",method=RequestMethod.POST)
	public String adduser(User user){
		userService.insert(user);
		return "showName";
	}

	/*
	 * @RequestMapping(value="/adduser",method=RequestMethod.POST) public String
	 * adduser(HttpServletRequest request){ // System.out.println(user);
	 * Map<String,String[]> mm = request.getParameterMap(); for
	 * (Map.Entry<String,String[]> entry: mm.entrySet()) {
	 * System.out.println(entry.getKey());
	 * System.out.println(entry.getValue()[0].toString()); }
	 * System.out.print(request.getParameterMap().size());
	 * System.out.println(request.getAttributeNames());
	 * 
	 * String s = request.getParameter("userName"); String s1 =
	 * request.getParameter("password"); System.out.println(s);
	 * System.out.println(s1); System.out.println(request.getParameterNames());
	 * return "showName"; }
	 */

}
