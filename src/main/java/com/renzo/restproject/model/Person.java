package com.renzo.restproject.model;

import javax.annotation.Resource;

@Resource
public class Person {

  private Integer id;
  private String nombre;
  private String apellido;

  public Person() {
  }

  public Person(Integer id, String nombre, String apellido) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public Integer getId() {
    return id;
  }
}
