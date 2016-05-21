package io.jay;

import java.util.ArrayList;

import static com.sun.tools.internal.xjc.reader.Ring.add;

/**
 * Created by jaymilnamow on 5/16/16.
 */
public class Person {

    private String name;
    private ArrayList<String> phoneNums = new ArrayList<>();

    Person(String name, String phoneNum){
        this.name = name;
        this.phoneNums.add(phoneNum);
    }

    public String getName(){
        return name;
    }

    public void addPhoneNum(String num){
        this.phoneNums.add(num);
    }

    public ArrayList<String> getPhoneNums(){
        return phoneNums;
    }

    public String getPhoneNum(int index){
        return "";
    }
}

