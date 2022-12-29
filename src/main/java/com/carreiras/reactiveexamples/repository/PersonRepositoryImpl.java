package com.carreiras.reactiveexamples.repository;

import com.carreiras.reactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by Ewerton on 29-12-22
 */
public class PersonRepositoryImpl implements PersonRepository {
    Person michael = new Person(1, "Michael", "Weston");
    Person fiona = new Person(2, "Fiona", "Glenanne");
    Person sam = new Person(3, "Sam", "Axe");
    Person jesse = new Person(4, "Jesse", "Potter");

    @Override
    public Mono<Person> getById(Integer id) {
        return Mono.just(michael);
    }

    @Override
    public Flux<Person> getAll() {
        return Flux.just(michael, fiona, sam, jesse);
    }
}