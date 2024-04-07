package com.example.OneToMany.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OneToMany.Entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {

}
