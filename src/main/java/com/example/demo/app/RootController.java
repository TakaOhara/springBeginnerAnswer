package com.example.demo.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//このコントローラはルートにアクセスした場合にリンクを表示するために用意されています。
//This controller is prepared to display links when you access the root address.
@Controller
@RequestMapping("/")
public class RootController {
	
	@GetMapping
	public String index() {
		return "index";
	}

}
