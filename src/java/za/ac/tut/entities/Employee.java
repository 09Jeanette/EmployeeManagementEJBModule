/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 *
 * @author Jeanette
 */
@Entity
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
   
    private Long id;

    @Lob
    private byte[] image;
    
    private String name;
    
    private String surname;
    
    private Integer age;
    
    @ElementCollection
    @CollectionTable(name = "Temperatures")
    private List<Double> temperatures;

    @ElementCollection
    @CollectionTable(name = "TemperatureStatuses")
    private List<String> temperatureStatuses;
    
    private String gender;
     
    public Employee() {
    }

    public Employee(Long id, byte[] image, String name, String surname, Integer age, List<Double> temperatures, List<String> temperatureStatuses, String gender) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.temperatures = temperatures;
        this.temperatureStatuses = temperatureStatuses;
        this.gender = gender;
    }

    public List<String> getTemperatureStatuses() {
        return temperatureStatuses;
    }

    public void setTemperatureStatuses(List<String> temperatureStatuses) {
        this.temperatureStatuses = temperatureStatuses;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

  

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Double> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(List<Double> temperatures) {
        this.temperatures = temperatures;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.Employee[ id=" + id + " ]";
    }
    
}
