package com.kapil.oneToMany.onetomanyexample;

import java.math.BigDecimal;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.kapil.oneToMany.onetomanyexample.domain.Cart;
import com.kapil.oneToMany.onetomanyexample.domain.Item;
import com.kapil.oneToMany.onetomanyexample.service.CartService;

@SpringBootApplication
public class OnetomanyExampleApplication {

	
	private static CartService cartService;
	
	public OnetomanyExampleApplication(CartService cartService)
	{
		this.cartService = cartService;
	}
		
	public static void main(String[] args) {
		SpringApplication.run(OnetomanyExampleApplication.class, args);
		
		Cart cart = new Cart();
		cart.setName("Kapil Cart 2");
		
		Item item = new Item();
		item.setName("Soap2");
		item.setPrice(new BigDecimal(100));
		
		Item item1 = new Item();
		item1.setName("Powder2");
		item1.setPrice(new BigDecimal(50));
		
		cart.setItem(Arrays.asList(item,item1));
		cartService.saveCart(cart);
	}
	
}
