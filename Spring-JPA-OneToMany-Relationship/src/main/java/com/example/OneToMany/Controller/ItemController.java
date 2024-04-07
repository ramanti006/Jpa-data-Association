package com.example.OneToMany.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OneToMany.Entity.Cart;
import com.example.OneToMany.Entity.Item;
import com.example.OneToMany.Repositery.ItemRepository;

@RestController
public class ItemController {
	
	@Autowired
	private ItemRepository itemRepo;
	
	@PostMapping("/saveIteam")
	public Item savecart(@RequestBody Item it)
	{
		return itemRepo.save(it);
		
	}
	
	@GetMapping("/getAllItem")
	public List<Item> getAllCart()
	{
		return itemRepo.findAll();
		
	}

}
