package HoldingObjectsLab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static javafx.scene.input.KeyCode.M;
import static javax.swing.UIManager.put;

/**
 * Created by jaymilnamow on 5/16/16.
 */
public class PhoneBook {


    private HashMap<String, String> phoneDirectory = new HashMap<String, String>();

    public HashMap<String, String> getPhoneDirectory() {
        return phoneDirectory;
    }

    public void addPerson(String name, String phoneNumber) {
        phoneDirectory.put(name, phoneNumber);
    }

    public String lookUpByName(String name) {
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
            listAll += name + " " + phoneDirectory.get(name) + "\n";
        }
        return listAll;
    }
}