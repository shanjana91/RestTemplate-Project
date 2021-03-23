package com.steria.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steria.entity.Product;
import com.steria.service.APIService;




@RestController
	public class ConsumeWebService {
	   @Autowired
	   APIService service;

	   @RequestMapping(value = "/template/products")
	   public String getproducts() {
		   return service.getProductList();
	   }
	   
	   @RequestMapping(value="/template/getid/{id}")
	   public String getById(@PathVariable int id) {
		   return service.getId(id);
	   }
	   
	   @PostMapping("/template/create")
	   public String createP(@RequestBody Product product) {
		   return service.create(product);
	   }
	   
	   @PutMapping("/template/update/{id}")
	   public String updatep(@RequestBody Product product,@PathVariable int id) {
		   return service.update(product,id);
	   }
	   
	   @DeleteMapping("/template/delete/{id}")
	   public String deletep(@PathVariable int id) {
		   return service.delete(id);
	   }
	}

