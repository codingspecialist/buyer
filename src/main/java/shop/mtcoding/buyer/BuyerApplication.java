package shop.mtcoding.buyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import shop.mtcoding.buyer.controller.ProductController;

@SpringBootApplication
public class BuyerApplication {

	public static void main(String[] args) {

		SpringApplication.run(BuyerApplication.class, args);
	}

}
