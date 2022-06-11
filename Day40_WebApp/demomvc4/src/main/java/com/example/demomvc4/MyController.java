package com.example.demomvc4;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class MyController {
@GetMapping("/")
public String home() {
	return "index";
}


@PostMapping("/createstudent")
public String createstudent(@ModelAttribute Student student) {
return "result";

}
}