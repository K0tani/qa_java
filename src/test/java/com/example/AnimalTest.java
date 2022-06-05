package com.example;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class AnimalTest {
    Animal animal = new Animal();
    @Test
    public void throwsExceptionWhenFoodWithOtherParameters() {
        try {
            animal.getFood("СвинПаук");
            fail("Expected exception was not thrown");
        } catch (Exception actualResult) {
            String expectedResult = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
            assertEquals(expectedResult, actualResult.getMessage());
        }
    }

    @Test
    public void getFamily() {
        String actualResult = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", actualResult);
    }
}