package com.example.mavenproject5.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

/*    private List<Active> actives = new ArrayList<>(Arrays.asList(new Active(44, "first"),
            new Active(4, "last")));*/
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){

        List<User> users = new ArrayList<>();
        userRepository.findAll()
        .forEach(users::add);
        return users;
    }


    public User getUser(String userID){
        //return actives.stream().filter(t-> t.getName().equals(name)).findFirst().get();
        if (userRepository.findById(userID).isPresent()){
            return userRepository.findById(userID).get();
        }
        return null;
    }

    public void addUser(User user) {
        //actives.add(active);
        userRepository.save(user);
    }

    public void updateUser(User user, String userID) {
        /*for (int i = 0; i < actives.size(); i++){

            Active n = actives.get(i);
            if (n.getName().equals(name)){
                actives.set(i, active);
                return;
            }
        }
        if (activeRepository.findById(name).isPresent()){
            activeRepository.findById(name).
        }*/
        userRepository.save(user);
    }

    public void deleteUser(String userID) {

        //actives.removeIf(t-> t.getName().equals(name));
        /*for (int i = 0; i < actives.size(); i++){

            Active n = actives.get(i);
            if (n.getName().equals(name)){
                actives.remove(i);
                return;
            }
        }*/

        userRepository.deleteById(userID);
    }
}
