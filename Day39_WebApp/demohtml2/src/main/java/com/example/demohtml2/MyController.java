package com.example.demohtml2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller

public class MyController {
@GetMapping("/sayhello")
public String greeting(@RequestParam(name="uname",required=false,defaultValue="DIEMS")String uname,@RequestParam(name="pass",required=false,defaultValue="DIEMS") String pass,Model model) {
model.addAttribute("username",uname);
model.addAttribute("password",pass);
return "hello";

}

}

