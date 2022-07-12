package com.example.apiproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "maestros")

public class maestro{
    
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int Id;
private String nombre;
private String apepaterno;
private String apematerno;
@Column(unique = true, length = 13)
private String telefono;
private String email;
private int edad;




public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApepaterno() {
    return apepaterno;
}
public void setApepaterno(String apepaterno) {
    this.apepaterno = apepaterno;
}
public String getApematerno() {
    return apematerno;
}
public void setApematerno(String apematerno) {
    this.apematerno = apematerno;
}
public String getTelefono() {
    return telefono;
}
public void setTelefono(String telefono) {
    this.telefono = telefono;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public int getEdad() {
    return edad;
}
public void setEdad(int edad) {
    this.edad = edad;
}
public int getId() {
    return Id;
}
public void setId(int id) {
    Id = id;
}

}









































