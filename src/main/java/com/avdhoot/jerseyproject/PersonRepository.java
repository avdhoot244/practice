package com.avdhoot.jerseyproject;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
	List<Person> persons;

	public PersonRepository() {
		persons = new ArrayList<Person>();
		Person p1 = new Person();
		p1.setpId(101);
		p1.setFirstName("John");
		p1.setLastName("Crawley");
		p1.setDob("1991-07-31");
		p1.setCity("London");
		p1.setState("England");
		Person p2 = new Person();
		p2.setpId(102);
		p2.setFirstName("mac");
		p2.setLastName("Crawley");
		p2.setDob("1995-08-21");
		p2.setCity("wales");
		p2.setState("England");
		persons.add(p1);
		persons.add(p2);
	}

	public List<Person> getPersons() {
		return persons;
	}
	
	public Person getPerson(int id) {
		for(Person p : persons)
		{
			if(p.getpId()==id)
			{
				return p;
			}
		}
		return null;
	}

}
