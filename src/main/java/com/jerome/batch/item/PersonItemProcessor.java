package com.jerome.batch.item;

import com.jerome.batch.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import java.util.Locale;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);
    @Override
    public Person process(Person item) throws Exception {
        final Person transformPerson = Person.builder()
                .firstName(item.getFirstName().toUpperCase())
                .lastName(item.getLastName().toUpperCase())
                .build();

        log.info(transformPerson.toString());

        return transformPerson;
    }
}
