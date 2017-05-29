import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Zver on 29.05.2017.
 */
public class CollectionUtilsTest {
    @Test
    public void getMaxElement() throws Exception {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        //prepare data
        int actualMaxElement = CollectionUtils.getMaxElement(list);
        //execute code
        int expectedMaxElement = 40;
        assertEquals(expectedMaxElement,actualMaxElement);
        //check the result
    }

    @Test
    public void getMinElement() throws Exception {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(14);
        list.add(141);
        list.add(148);
        list.add(146);
        list.add(1560);
        int actualMinElement = CollectionUtils.getMinElement(list);
        int expectedMinElement = 14;
        assertEquals(expectedMinElement,actualMinElement);
    }

    @Test
    public void getAverage() throws Exception {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        double actualAverage = CollectionUtils.getAverage(list);
        double expectedAverage = 25;
        assertEquals(expectedAverage,actualAverage,0.01);
    }

}