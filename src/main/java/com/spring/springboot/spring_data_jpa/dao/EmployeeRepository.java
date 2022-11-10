package com.spring.springboot.spring_data_jpa.dao;

import com.spring.springboot.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {

    // тут хранятся методы JPA, но их не видно
    //дополнительный метод, который нужен лично нам

    public List<Employee> findAllByName(String name);

}
