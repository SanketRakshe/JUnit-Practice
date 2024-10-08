package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
	
	@Autowired
	public CalculatorService calculatorService;
	
	@GetMapping("/add")
	public int add(@RequestParam int a, @RequestParam int b) {
		return calculatorService.add(a, b);
	}
	
	@GetMapping("/sub")
	public int sub(@RequestParam int a, @RequestParam int b) {
		return calculatorService.sub(a, b);
	}
	
	@GetMapping("/mul")
	public int mul(@RequestParam int a, @RequestParam int b) {
		return calculatorService.mul(a, b);
	}
	
	@GetMapping("/div") 
	public int div(@RequestParam int a, @RequestParam int b) {
		return calculatorService.divide(a, b);
	}
}
