package conm.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {
	
	@GetMapping
	public String calculate(
			@RequestParam double a,
			@RequestParam double b,
			@RequestParam String operation) {
		
		double result;
		
		switch(operation.toLowerCase()) {
			case "add":
				result = a + b;
				break;
				
			case "sub":
				result = a - b;
				break;
				
			case "mul":
				result = a * b;
				break;
				
			case "div":
				if(b != 0) {
					result = a / b;
				} else {
					return "Cannot divided by zero..!";
				}
				break;
				
			default:
				return "Invalid Operation.. Please use add / sub / mul / div";
		}
		
		return "Result: " + result;
		
	}
}
