package homework;

import java.util.ArrayList;
import java.util.Arrays;

// import java.util.ArrayList;
// import java.util.Arrays;

public class homework3 {

    public static void main(String[] args) {
        
        int[] array = new int [] {92, 17, 65, 39, 45, 78, 14, 10, 2, 5};
        homework.hwfirst.sorting(array);


        int[] arrayeList = new int[] {15, 17, 24, 35, 64, 58, 91, 85, 86, 91};
        homework.hwsecond.getOddNumbersOf(arrayeList);

        ArrayList<Integer> arrayy = new ArrayList<>(Arrays.asList(92, 17, 65, 39, 45, 78, 14, 10, 2, 5, 15, 17, 24, 35, 64, 58, 91, 85, 86, 91));
        homework.hwthird.minMaxAverage(arrayy);

    }
}