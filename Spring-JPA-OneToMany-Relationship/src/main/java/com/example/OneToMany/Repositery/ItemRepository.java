package com.example.OneToMany.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OneToMany.Entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {

}
