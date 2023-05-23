package com.gnaneswar.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		ProductService service = context.getBean(ProductService.class);
		List<Product> products = service.getAllProducts();
		for (Product p : products) {
			System.out.println(p);
		}
		System.out.println("---------------------------------------------------------------");
		System.out.println("enter the required product name");
		Product p = service.getProduct("Type C");
		System.out.println(p);
		System.out.println("---------------------------------------------------------------");
		System.out.println("enter the required place");
		List<Product> prods = service.getProductWithPlace("White Table");
		for (Product pk : prods) {
			System.out.println(pk);


		}
	}
}
