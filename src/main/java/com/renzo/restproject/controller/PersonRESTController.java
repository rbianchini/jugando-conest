package com.renzo.restproject.controller;

import com.renzo.restproject.model.Person;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonRESTController {

  private final Map<Integer, Person> people = new HashMap<>();

  public PersonRESTController() {
    people.put(0, new Person(0, "Ren", "Perez"));
    people.put(1, new Person(1, "Xavi", "Gonzalez"));
    people.put(2, new Person(2, "Jona", "Rodriguez"));
    people.put(3, new Person(3, "Gaby", "Garcia"));
    people.put(4, new Person(4, "Pao", "Gomez"));

  }

  @GetMapping
  @RequestMapping("/all")
  public List<Person> list() {
    List<Person> peopleList = new LinkedList<>();

    people.forEach((k,v) -> peopleList.add(people.get(k)));

    return peopleList;
  }

  @GetMapping(value = "/get/{id}")
  //@RequestMapping("/get")
  public Person get(@PathVariable("id") Integer id) {
    return people.get(id);
  }

  @PostMapping
  @RequestMapping("/ins")
  public void insert(@RequestBody Person person) {
    people.put(person.getId(), person);
  }

  @PutMapping
  @RequestMapping("/upd")
  public void update(@RequestBody Person person) {
    people.replace(person.getId(), person);
  }

  @DeleteMapping(value = "/del/{id}")
  //@RequestMapping("/del")
  public void delete(@PathVariable("id") Integer id) {
    people.remove(id);
  }
}
