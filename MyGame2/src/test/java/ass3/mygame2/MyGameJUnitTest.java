/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3.mygame2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author ANUSHA
 */
public class MyGameJUnitTest {

    Item item, item3;
    Room item2;

    private String strSP;
    private String strNM;
    private String name;
    private String des;
    private boolean lock;
    private String directionN;

    public MyGameJUnitTest() {

    }

    /**
     * Test getName method, of class Item
     */
    @Test
    public void testGetItemOne() {

        item = new Item("excaliburSword", "this is a excaliburSword", 0);
        String expected = "excaliburSword";

        String actual = item.getName();

        assertEquals(expected, actual);

    }

    /**
     * Test getLockedStatus method, of Room class
     */
    @Test
    public void testGetLockStatus() {

        boolean Locked = false;

        boolean obj = new Room(name, des, lock).getLockedStatus();

        assertEquals(Locked, obj);
    }

    /**
     * Test getAllItems method, of Room class
     */
    @Test
    public void testgetAllItems() {

        strSP = "excaliburSword";
        strNM = "key";

        String allItems = "You have some items:";
        String obj = new Room(name, des, lock).getAllItems();
        assertEquals(allItems, obj);

    }

    /**
     * Test getExit method,of Room class
     */
    @Test
    public void testgetExit() {

        //
        String exit = null;
        Room obj = new Room(name, des, lock).getExit( directionN);
        assertEquals(exit, obj);
    }

    /**
     * Test printAllInventory method,of Player class
     */
    @Test
    public void testprintAllInventory() {

        String r1 = "Items:";
        String objItem = new Player().printAllInventory();
        assertEquals(r1, objItem);
    }

}
