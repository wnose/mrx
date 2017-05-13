package space.mrx.basic.web.screen;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {

	@RequestMapping("/welcome/{param}")
	public String wlecome(HttpServletRequest request, HttpServletResponse response, @PathVariable String param){
		
		System.out.println("传递进来的参数是：" + param);
		// 这儿返回的东西，会自动加上前缀和后缀进行匹配 会自动进行跳转
		return "index";
	}
}