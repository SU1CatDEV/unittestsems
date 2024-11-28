import java.util.List;

public class ListAnalyser {
    public static double calculateAverage(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Список не должен быть пустым или null");
        }
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public static String compareAverages(List<Integer> list1, List<Integer> list2) {
        double avg1 = calculateAverage(list1);
        double avg2 = calculateAverage(list2);

        if (avg1 > avg2) {
            return "Первый список имеет большее среднее значение";
        } else if (avg1 < avg2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
