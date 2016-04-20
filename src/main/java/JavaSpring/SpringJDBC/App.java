package JavaSpring.SpringJDBC;

import learn.java.spring.jdbc.Customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.java.spring.jdbc.dao.CustomerDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	
    	CustomerDAO customerDAO = (CustomerDAO) appContext.getBean("customerDAO");
    	
    	Customer customer = new Customer (600, "Chalapathi", 33);
    	
    	customerDAO.insertCustomer(customer);
    	
    	
    	
    	
    }
}
