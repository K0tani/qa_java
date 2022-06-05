package com.example;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline;

    @Before
    public void initialize() {
        this.feline = new Feline();
    }

    @Test
    public void predatorShouldEatMeat() throws Exception {
        List<String> actualResult = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualResult);
    }

    @Test
    public void getFamily() {
        String actualResult = feline.getFamily();
        assertEquals("Кошачьи",actualResult);
    }

    @Test
    public void getKittens() {
        int actualResult = feline.getKittens();
        assertEquals(1,actualResult);
    }
}
