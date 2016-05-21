package io.jay;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static javafx.scene.input.KeyCode.T;
import static sun.jvm.hotspot.oops.CellTypeState.value;


/**
 * Created by jaymilnamow on 5/16/16.
 */
public class PhoneBook {


    private HashMap<String, Person> phoneDirectory = new HashMap<String, Person>();


    public HashMap<String, Person> getPhoneDirectory() {
        return phoneDirectory;
    }

    public void addPerson(String name, Person person) {
        phoneDirectory.put(name, person);
    }

    public Person lookUpByName(String name) {
        return phoneDirectory.get(name);
    }

    public void removePerson(String name) {
        phoneDirectory.remove(name);
    }

    public String listAllPerson() {
        String listString = "";
        for (String name : phoneDirectory.keySet()) {
            listString += name + " ";
        }
        return listString;
    }

    public String listAllEntries() {
        String listAll = "";
        for (String name : phoneDirectory.keySet()) {
            listAll += name + " " + phoneDirectory.get(name).getPhoneNums().get(0) + "\n";
        }
        return listAll;
    }

    public String lookupByPhoneNumber(String phoneNumber) {
        String result = "";
        for(Map.Entry<String, Person> entry : phoneDirectory.entrySet()){
            for (int i = 0; i < entry.getValue().getPhoneNums().size(); i++){
                if (entry.getValue().getPhoneNums().get(i).equals(phoneNumber)){
                    result= entry.getKey();
                }
            }
        }
        return result;
    }
}