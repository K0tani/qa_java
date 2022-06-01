package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline predator;

    @Test
    public void catMustSoundMeow() {
        Cat cat = new Cat(predator);
        String actualResult = cat.getSound();
        assertEquals("Мяу",actualResult);
    }

    @Test
    public void getFoodForCat() throws Exception {
        Cat cat = new Cat(predator);
        Mockito.when(predator.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actualResult = cat.getFood();
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult,actualResult);
    }
}
