package HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age,Address address) {};
record Address(String firstLine
		,String city) {};

@Configuration
public class HelloWorldConfiguration {
	//we will use to create bin which called spring in
	
	@Bean
	public String name()
	{
		return "Smita";
	}
	
	@Bean
	public int age()
	{
		return 20;
	}
	
	@Bean
	public Person person1()
	{
		return new Person("Smita",12,new Address("Marathalli","Bangalore"));
	}
	
	//call beans as method
	@Bean
	public Person personMethod()
	{
		return new Person(name(),age(),address());
	}
	
	//use it as parameter instead of calling
	@Bean
	public Person personParameter(String name, int age,@Qualifier("address3") Address address1)
	{
		return new Person(name,age, address1);
	}
	
	@Primary
	@Bean(name="address2")
	public Address address()
	{
		return new Address("Marathalli","Bangalore");
	}
	
	@Qualifier("address3")
	@Bean
	public Address address1()
	{
		return new Address("Yogeshwari","Kolhapur");
	}
	
}
