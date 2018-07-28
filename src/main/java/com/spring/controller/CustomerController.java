package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Customer;
@RestController
public class CustomerController {
	  @RequestMapping("/hi")
	  public String  sayHello(){
		return "Customer Details";
		
	}

	
	@GetMapping("/cust")
	public Customer getCustomer()
	{
		Customer cc=new Customer();
		cc.setId(1001);
		cc.setName("Pallavi");
		cc.setCcemails("ravindrabhai@gmail.com");
		cc.setEmail("pallavi@gmail.com");
		cc.setCustomer_since("1984");
		cc.setOrganization("AB company");
		cc.setPhone("4564758358375");
		cc.setReference_id("DFG121231434");
		cc.setShipping_addresses("Raniramachandrapur,Jajpur town,Jajpur");
		cc.setSubscription("sjhjdka");
		cc.setCheck_payment(2000.00);
		return cc;
	}
	
}
