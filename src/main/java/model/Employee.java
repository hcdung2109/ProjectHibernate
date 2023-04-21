package model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "id")
    private Integer id;
    private String name;
    @Id // KHÓA CHÍNH
    @GeneratedValue // Tự động tăng giá trị
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }
}
