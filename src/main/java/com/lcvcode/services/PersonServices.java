package com.lcvcode.services;

import com.lcvcode.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

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
}
