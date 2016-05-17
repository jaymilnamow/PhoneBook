package HoldingObjectsLabSpec;

import HoldingObjectsLab.Person;
import HoldingObjectsLab.PhoneBook;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jaymilnamow on 5/16/16.
 */
public class PhoneBookSpec {

    PhoneBook testPhoneBook;
    @Before
    public void initialize(){
        testPhoneBook = new PhoneBook();
        testPhoneBook.addPerson("Luigi", "555-5555");
    }
    @Test
    public void lookupByNameTest(){
        String expectedValue = "555-5555";
        String actualValue = testPhoneBook.lookUpByName("Luigi");
        assertEquals("Expected to return 555-5555", expectedValue,actualValue);
    }
    @Test
    public void addPersonTest(){
        testPhoneBook.addPerson("Peach","555-9999");
        String expectedValue = "555-9999";
        String actualValue = testPhoneBook.getPhoneDirectory().get("Peach");
        assertEquals("Expected to return 555-9999",expectedValue,actualValue);
    }
    @Test
    public void removePersonTest(){
        testPhoneBook.removePerson("Luigi");
        String actualValue = testPhoneBook.lookUpByName("Luigi");
        assertNull(actualValue);
    }
    @Test
    public void listAllPersonTest(){
        testPhoneBook.addPerson("Mario","555-8888");
        String expectedValue = "Luigi" + " " + "Mario" + " ";
        String actualValue = testPhoneBook.listAllPerson();
        assertEquals("Expected to return all Person values",expectedValue,actualValue);
    }
    @Test
    public void listAllEntriesTest(){
        testPhoneBook.addPerson("Yoshi","555-2222");
        String expectedValue = "Yoshi 555-2222" + "\n" + "Luigi 555-5555\n";
        String actualValue = testPhoneBook.listAllEntries();
        assertEquals("Expected to return all entries",expectedValue,actualValue);
    }



}
