package com.example.OneToMany.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OneToMany.Entity.Cart;
import com.example.OneToMany.Repositery.CartRepository;

@RestController
public class CartController {
	
	@Autowired
	private CartRepository cartRepo;
	
	
	@PostMapping("/saveCart")
	public Cart savecart(@RequestBody Cart cr)
	{
		return cartRepo.save(cr);
		
	}
	
	@GetMapping("/getAllCart")
	public List<Cart> getAllCart()
	{
		return cartRepo.findAll();
		
	}

}
