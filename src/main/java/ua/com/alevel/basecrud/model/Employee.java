package ua.com.alevel.basecrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Iehor Funtusov, created 06/11/2020 - 7:56 PM
 */

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee extends BaseClass {

    private String name;

    private String email;

    private Integer age;

    @ManyToOne
    private Department department;
}
