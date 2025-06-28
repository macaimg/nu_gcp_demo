package com.neo.nu_gcp_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class NuGcpDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NuGcpDemoApplication.class, args);
	}

}

@RestController
class HelloWorldController {

	@GetMapping("/hello")
	public String hello(@RequestParam(defaultValue = "GCP User") String name) {
		return "Hello " + name + "!";
	}
}
