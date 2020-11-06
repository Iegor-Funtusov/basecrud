package ua.com.alevel.basecrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Iehor Funtusov, created 06/11/2020 - 8:00 PM
 */

@Getter
@Setter
@Entity
@Table(name = "departments")
public class Department extends BaseClass {

    private String name;
}
