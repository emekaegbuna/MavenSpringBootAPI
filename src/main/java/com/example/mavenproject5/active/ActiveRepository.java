package com.example.mavenproject5.active;

import org.springframework.data.repository.CrudRepository;import java.util.List;


public interface ActiveRepository extends CrudRepository<Active, String> {

    //getActives
    //getActive
    //updateActive
    //deleteActive

    public List<Active> findByUser_UserID(String userID);

}
