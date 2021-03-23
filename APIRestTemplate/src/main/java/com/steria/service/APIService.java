package com.steria.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import com.steria.entity.Product;
import com.steria.entity.ProductEntity;

@Service
public class APIService {
	
	@Autowired RestTemplate restTemplate;
	
	 
	   public String getProductList() {
	      HttpHeaders headers = new HttpHeaders(); //data structure representing request and response headers
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON)); //set the acceptable media types
	      HttpEntity <String> entity = new HttpEntity<String>(headers);  //represents http response/request entity (has headers,body)
	      
	      return restTemplate.exchange("http://localhost:8083/getproducts", HttpMethod.GET, entity, String.class).getBody();
	   }
	   
	   public String getId(int id) {
		   HttpHeaders headers=new HttpHeaders();
		   headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		   HttpEntity<String> entity=new HttpEntity<String>(headers);
		   return restTemplate.exchange("http://localhost:8083/getById/"+id, HttpMethod.GET,entity,String.class).getBody();
	   }
	  
	  public String create(Product product) {
		
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Product> entity=new HttpEntity<Product>(product, headers);
		//ResponseEntity resp_entity= restTemplate.exchange("http://localhost:8083/create", HttpMethod.POST,entity,String.class); 
		//response entity is the extension of httpentity to get status code
		
		return restTemplate.exchange("http://localhost:8083/create", HttpMethod.POST,entity,String.class).getBody();
	}
	  public String update(Product product,int id) {
		  
		   HttpHeaders headers=new HttpHeaders();
		   headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		   HttpEntity<Product> entity=new HttpEntity<Product>(product,headers);
		   return restTemplate.exchange("http://localhost:8083/update/"+id, HttpMethod.PUT,entity,String.class).getBody();
	  }
	  
	  public String delete(int id) {
		  HttpHeaders headers=new HttpHeaders();
		   headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		   HttpEntity<Product> entity=new HttpEntity<Product>(headers);
		   
		   return restTemplate.exchange("http://localhost:8083/delete/"+id, HttpMethod.DELETE,entity,String.class).getBody();
	  }
}
