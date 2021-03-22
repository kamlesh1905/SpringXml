package com.kamleshit.Converter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import com.kamleshit.Entity.Customer;

public class Marshalling {
	
	public static void main(String[] args) throws Exception {
		
		
		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerAge(27);
		customer.setCustomerEmail("K@mail.com");
		customer.setCustomerName("Karan");
		
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(customer, System.out);
	}

}
