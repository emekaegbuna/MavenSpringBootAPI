package com.example.mavenproject5.active;

import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActiveService {

/*    private List<Active> actives = new ArrayList<>(Arrays.asList(new Active(44, "first"),
            new Active(4, "last")));*/
    @Autowired
    private ActiveRepository activeRepository;

    public List<Active> getActives(String userID){

        return new ArrayList<>(activeRepository.findByUser_UserID(userID));
    }

    public Active getActive(String activeID){
        //return actives.stream().filter(t-> t.getName().equals(name)).findFirst().get();
        if (activeRepository.findById(activeID).isPresent()){
            return activeRepository.findById(activeID).get();
        }

        return new Active("", "", "");
    }

    public void addActive(Active active) {
        //actives.add(active);
        activeRepository.save(active);
    }

    public void updateActive(Active active) {
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
        activeRepository.save(active);
    }

    public void deleteActive(String activeID) {

        //actives.removeIf(t-> t.getName().equals(name));
        /*for (int i = 0; i < actives.size(); i++){

            Active n = actives.get(i);
            if (n.getName().equals(name)){
                actives.remove(i);
                return;
            }
        }*/

        activeRepository.deleteById(activeID);
    }
}
