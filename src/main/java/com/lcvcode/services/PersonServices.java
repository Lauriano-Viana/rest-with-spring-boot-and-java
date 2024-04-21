package com.lcvcode.services;

import com.lcvcode.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll() {
        logger.info("Finding all peoples");
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }


    public Person findById(String id) {
        logger.info("Finding one person!");
        var person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Leandro");
        person.setLastName("Costa");
        person.setAdress("Uberlânda - Minas Gerais - Brasil");
        person.setGender("Male");
        return person;
    }

    public Person create(Person person) {
        logger.info("Creating one person!");
        return person;
    }

    public Person update(Person person) {
        logger.info("update one person!");
        return person;
    }

    public void delete(String id) {
        logger.info("delete one person!");

    }

    private Person mockPerson(int i) {

        var person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("person name " + i);
        person.setLastName("Las name " + i);
        person.setAdress("Some adress in Brasil" + i);
        person.setGender("Male");
        return person;
    }

}
