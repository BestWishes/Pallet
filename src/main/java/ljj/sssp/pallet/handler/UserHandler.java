package ljj.sssp.pallet.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ljj.sssp.pallet.service.UserService;

@RequestMapping("/user")
@Controller
public class UserHandler {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login/{age}",method=RequestMethod.POST,params={"name","password"},headers={})
	public String login(String name,String password,@PathVariable(value="age") String age ){
		System.out.println("有用户登录:"+name+":"+password+"age:"+age);
		return "user/information";
	}
}
