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
    Lion lion;

    @Test
    public void getFoodForLionType() throws Exception {
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = lion.getFood();
        assertEquals(expectedResult,actualResult);
}
    @Test
    public void getKittensForLion() {
        Mockito.when(lion.getKittens()).thenReturn(1);
        int actualResult = lion.getKittens();
        assertEquals(1,actualResult);
    }

    @Test(expected = Exception.class)
    public void throwsExceptionWhenLionWithOtherParameters() throws Exception{
        Lion lion = new Lion(" ");
        lion.doesHaveMane();
    }

}
