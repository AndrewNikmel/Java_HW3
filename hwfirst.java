package homework;
import java.util.Arrays;

public class hwfirst {
    
    public static int[] sorting(int[] array) {
        int[] arrayeA = Arrays.copyOf(array, array.length);
        int[] arrayeB = new int[array.length];
        int[] result = sortInside(arrayeA, arrayeB, 0, array.length);
        return result;
    }

    public static int[] sortInside(int[] arrayeA, int[] arrayeB, int startIndex, int endIndex) {
        if (startIndex >= endIndex -1 ) {
            return arrayeA;
        }
        int middle = startIndex + (endIndex - startIndex);
        int[] sorted1 = sortInside(arrayeA, arrayeB, startIndex, middle);
        int[] sorted2 = sortInside(arrayeA, arrayeB, middle, endIndex);
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == arrayeA ? arrayeB : arrayeA;
        while (index1 < middle && index2 < endIndex){
            result[destIndex++] = sorted1[index1] < sorted2[index2] ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1< middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex){
            result[destIndex++] = sorted2[index2++];
        }
        return result;

    }

    
}
// Реализовать алгоритм сортировки слиянием

