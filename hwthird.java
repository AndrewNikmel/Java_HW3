package homework;

import java.util.ArrayList;

public class hwthird {
    public static void minMaxAverage(ArrayList<Integer> arr) {
        arr = new ArrayList<>();
        int min = arr.get(0);
        int max = arr.get(0);
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);
    }
}


// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.