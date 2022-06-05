package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizationTest {
    Feline feline = new Feline();
    private final String typeOfGender;
    private final boolean expectedResult;

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }
    public LionParametrizationTest(String typeOfGender, boolean expectedResult){
        this.typeOfGender = typeOfGender;
        this.expectedResult = expectedResult;
    }

    @Test
    public void createGenderTest() throws Exception {
        Lion lion = new Lion(typeOfGender, feline);
        assertEquals(expectedResult, lion.doesHaveMane());
    }

}
