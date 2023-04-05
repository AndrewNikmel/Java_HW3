package homework;
import java.util.ArrayList;

public class hwsecond {
    
    public static ArrayList<Integer> getOddNumbersOf(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int number : array) {
            if (isOdd(number)) {
                result.add(number);
            }
        }
        return result;
    }

    private static boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        }
        else {
            return false;
        }
    }
}


// Пусть дан произвольный список целых чисел, удалить из него чётные числа
