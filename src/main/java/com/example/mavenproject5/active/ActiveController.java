package com.example.mavenproject5.active;


import com.example.mavenproject5.user.User;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActiveController {


    @Autowired
    private ActiveService activeService;

    @RequestMapping("users/{userID}/actives")
    public List<Active> getActives(@PathVariable("userID") String userID){
        return activeService.getActives(userID);
    }

    @RequestMapping("users/actives/{activeID}")
    public Active getActive(@PathVariable("activeID") String activeID){
        return activeService.getActive(activeID);
    }

    @RequestMapping(method= RequestMethod.POST, value="users/{userID}/actives")
    public void addActive(@RequestBody Active active, @PathVariable("userID") String userID){
        active.setUser(new User(userID, "", ""));
        activeService.addActive(active);
    }

    @RequestMapping(method= RequestMethod.PUT, value="users/{userID}/actives/{activeID}")
    public void updateActive(@RequestBody Active active,@PathVariable("userID") String userID, @PathVariable("activeID") String activeID){
        active.setUser(new User(userID, "", ""));
        activeService.updateActive(active);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="users/{userID}/actives/{activeID}")
    public void deleteActive(@PathVariable("activeID") String activeID){
        activeService.deleteActive(activeID);
    }
}
