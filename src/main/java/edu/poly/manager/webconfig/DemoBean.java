package edu.poly.manager.webconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import edu.poly.manager.entity.Person;

public class DemoBean {

	@Bean(name = "person", initMethod = "init", destroyMethod = "destroy")
	@Scope(value = "prototype")
	public Person person() {
		Person person = new Person();
		person.setName("Ngo Huu Duan");
		person.setAge(19);
		return person;
	}
}
