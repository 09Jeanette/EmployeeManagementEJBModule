package za.ac.tut.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-06-05T20:06:58")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, byte[]> image;
    public static volatile ListAttribute<Employee, Double> temperatures;
    public static volatile SingularAttribute<Employee, String> gender;
    public static volatile SingularAttribute<Employee, String> surname;
    public static volatile SingularAttribute<Employee, String> name;
    public static volatile ListAttribute<Employee, String> temperatureStatuses;
    public static volatile SingularAttribute<Employee, Long> id;
    public static volatile SingularAttribute<Employee, Integer> age;

}