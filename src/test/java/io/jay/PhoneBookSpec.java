package io.jay;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by jaymilnamow on 5/16/16.
 */
public class PhoneBookSpec {

    PhoneBook testPhoneBook;
    Person person;
    @Before
    public void initialize(){
        testPhoneBook = new PhoneBook();
        person = new Person("luigi","555-5555");
        testPhoneBook.addPerson("Luigi", person);

    }
    @Test
    public void lookupByNameTest(){
        String expectedValue = "555-5555";
        String actualValue = testPhoneBook.lookUpByName("Luigi").getPhoneNums().get(0);
        assertEquals("Expected to return 555-5555", expectedValue,actualValue);
    }
    @Test
    public void addPersonTest(){

        testPhoneBook.addPerson("Peach",new Person("Peach","555-9999"));
        String expectedValue = "555-9999";
        String actualValue = testPhoneBook.getPhoneDirectory().get("Peach").getPhoneNums().get(0);
        assertEquals("Expected to return 555-9999",expectedValue,actualValue);
    }
    @Test
    public void removePersonTest(){
        testPhoneBook.removePerson("Luigi");
        Person actualValue = testPhoneBook.lookUpByName("Luigi");
        assertNull(actualValue);
    }
    @Test
    public void listAllPersonTest(){
        testPhoneBook.addPerson("Mario",new Person("Mario","555-8888"));
        String expectedValue = "Luigi" + " " + "Mario" + " ";
        String actualValue = testPhoneBook.listAllPerson();
        assertEquals("Expected to return all Person values",expectedValue,actualValue);
    }
    @Test
    public void listAllEntriesTest(){
        testPhoneBook.addPerson("Yoshi",new Person("Yoshi","555-2222"));
        String expectedValue = "Yoshi 555-2222" + "\n" + "Luigi 555-5555\n";
        String actualValue = testPhoneBook.listAllEntries();
        assertEquals("Expected to return all entries",expectedValue,actualValue);
    }

    @Test
    public void lookupByPhoneNumberTest(){
        testPhoneBook.addPerson("Toad",new Person("Toad","555-2288"));
        String expectedValue = "Toad";
        String actualValue = testPhoneBook.lookupByPhoneNumber("555-2288");
        assertEquals("Expected to return all entries",expectedValue,actualValue);
    }



}
