import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAddTest {

    @Test
    public void AddelemtoArray(){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        Collections.sort(cars);
        cars.add("New Car");
        assertEquals(cars.get(4),"New Car");
    }

}