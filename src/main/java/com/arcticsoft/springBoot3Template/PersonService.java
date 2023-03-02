package com.arcticsoft.springBoot3Template;

import org.springframework.stereotype.Service;

@Service
class PersonService {
    private final PersonRepository personRepository;

    PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    Person create(String name) {
        return personRepository.save(new Person(name));
    }

    Person read(Long personId) {
        return personRepository.findById(personId).orElseThrow();
    }
}
