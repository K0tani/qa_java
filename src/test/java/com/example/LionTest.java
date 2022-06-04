package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;
    @Test
    public void getFoodForLionType() throws Exception {
        Lion lion = new Lion("Самец",feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = lion.getFood();
        assertEquals(expectedResult,actualResult);
}
    @Test
    public void getKittensForLion() throws Exception {
        Lion lion = new Lion("Самец",feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualResult = lion.getKittens();
        assertEquals(1,actualResult);
    }

    @Test(expected = Exception.class)
    public void throwsExceptionWhenLionWithOtherParameters() throws Exception{
        Lion lion = new Lion(" ",feline);
        lion.doesHaveMane();
    }

}
