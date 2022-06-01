package com.example;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void throwsExceptionWhenFoodWithOtherParameters() {
        try {
            Animal animal = new Animal();
            new ArrayList<>(animal.getFood("СвинПаук"));
        } catch (Exception actualResult) {
            String expectedResult = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
            assertEquals(expectedResult, actualResult.getMessage());
        }
    }

    @Test
    public void getFamily() {
        Animal animal = new Animal();
        String actualResult = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", actualResult);
    }
}