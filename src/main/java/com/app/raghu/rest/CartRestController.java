package com.app.raghu.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.raghu.entity.Cart;

@RestController
@RequestMapping("/cart")
public class CartRestController 
{
	@Value("${server.port}")
	private String port;

	@GetMapping("/info")
	public ResponseEntity<String> showMessage() {
		return ResponseEntity.ok("WELCOME TO CART SERVICE =>" + port);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Cart> getCartById(@PathVariable("id")Integer id)
	{
		Cart cart = new Cart();
		cart.setCartId(1);
		cart.setCartCode("TEST");
		cart.setCartCost(23000.00);
		return ResponseEntity.ok(cart);
	}
}
