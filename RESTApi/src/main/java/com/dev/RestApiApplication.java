package com.dev;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.Product.Address;
import com.dev.Product.Product;
import com.dev.Product.Products;

@SpringBootApplication
@RestController
public class RestApiApplication {
	private static final Logger logger = Logger.getLogger(RestApiApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
//		try {
//			jsonXML();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			constructXML();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		User user = new User();
		user.setId("1");
		user.setUname("dev");
		user.setUage("20");
		user.setUtech("Java");
		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
	}
	@RequestMapping("/employee")
	public Employe getEmployeeDetails(){
		Employe emp = new Employe(1,"dev","6","60k","Developer");
		
		return emp;
	}
	
	public  static String jsonXML() throws JsonGenerationException, JsonMappingException, IOException{
		List<Employe> empList = new ArrayList<>();
		empList.add(new Employe(1,"dev1","6","60k","Developer"));
		empList.add(new Employe(2,"dev2","6","60k","Tester"));
		empList.add(new Employe(3,"dev3","6","60k","Business"));
		empList.add(new Employe(4,"dev4","6","60k","UI Developer"));
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonArray = mapper.writeValueAsString(empList);
		String xmlString = ServiceHelper.convertjsonToXMl(jsonArray);
		//System.out.println("Hiiiii>>>"+service.convertjsonToXMl(jsonArray));
		return xmlString;
		
	}
	
	@RequestMapping(value="/saveEmployee",method=RequestMethod.POST)
	public String saveEmployeeDetails(@RequestBody Employe emp){
		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		return "Employee Details Saved successfully";
	}
	
	public static void constructXML() throws JAXBException{
		JAXBContext context = JAXBContext.newInstance(Products.class);

	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		List<Product> productList = new ArrayList<>();
		//Product product = new Product(1111,"shirt","blue","30",new Address("rnr","kar","581115"));
		productList.add(new Product(1111,"shirt","blue","30",new Address("rnr","kar","581115")));
		productList.add(new Product(2222,"pant","blue","30",new Address("rnr","kar","581115")));
		productList.add(new Product(3333,"shirt","blue","30",new Address("rnr","kar","581115")));
		productList.add(new Product(4444,"shirt","blue","30",new Address("rnr","kar","581115")));
		Products products = new Products();
		products.setProducts(productList);
		m.marshal(products, System.out);
		//logger.log(, message);
	}
}
