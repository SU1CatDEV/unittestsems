import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ListAnalyserTest {

    @Test
    void testCalculateAverage_ValidInput() {
        assertEquals(3.0, ListAnalyser.calculateAverage(Arrays.asList(1, 2, 3, 4, 5)), 0.001);
    }

    @Test
    void testCalculateAverage_EmptyList() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> ListAnalyser.calculateAverage(Collections.emptyList()));
        assertEquals("Список не должен быть пустым или null", exception.getMessage());
    }

    @Test
    void testCalculateAverage_NullList() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> ListAnalyser.calculateAverage(null));
        assertEquals("Список не должен быть пустым или null", exception.getMessage());
    }

    @Test
    void testCompareAverages_FirstListGreater() {
        assertEquals("Первый список имеет большее среднее значение",
                ListAnalyser.compareAverages(Arrays.asList(5, 6, 7), Arrays.asList(1, 2, 3)));
    }

    @Test
    void testCompareAverages_SecondListGreater() {
        assertEquals("Второй список имеет большее среднее значение",
                ListAnalyser.compareAverages(Arrays.asList(1, 2, 3), Arrays.asList(5, 6, 7)));
    }

    @Test
    void testCompareAverages_AveragesEqual() {
        assertEquals("Средние значения равны",
                ListAnalyser.compareAverages(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3)));
    }
}
