package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParametrizationTest {

    private final String typeOfAnimal;
    private final List<String> expectedResult;

    public AnimalParametrizationTest(String typeOfAnimal, List<String> expectedResult){
        this.typeOfAnimal = typeOfAnimal;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Травоядное", Arrays.asList("Трава", "Различные растения")},
                {"Хищник", Arrays.asList("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFoodTest() throws Exception {
        Animal animal = new Animal();
        List<String> actualResult = animal.getFood(typeOfAnimal);
        assertEquals(expectedResult, actualResult);
    }

}
