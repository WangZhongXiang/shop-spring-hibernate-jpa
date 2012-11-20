
package com.huawei.shop.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huawei.shop.model.AdminModel;
import com.huawei.shop.model.ConfigModel;
import com.huawei.shop.service.AdminService;
//import com.huawei.shop.service.ConfigService;


@Controller
public class LoginController
{
	private static final Logger logger = Logger.getLogger("DEBUG");
	
	@Autowired
	private AdminService adminService;
	
//	@Autowired
//	private ConfigService configService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String name, String password, Model model)
	{
		logger.error("name = "+name);
		AdminModel admin = adminService.getUserPassword(name);
//		List<ConfigModel> configs = configService.getAllConfig();
        String passwd = admin.getPassword();
        model.addAttribute("admin", admin);
        model.addAttribute("name", name);
        model.addAttribute("password", password);
//        model.addAttribute("configs", configs);

		if (passwd.equals(password))
		{
			return "home";
		}
		return "error";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(String name, String password)
	{
		return "redirect:/index.jsp";
	}

}
