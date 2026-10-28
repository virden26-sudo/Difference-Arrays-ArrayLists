import java.util.ArrayList;
import java.util.Arrays;

/**
 * Demonstrates the practical and conceptual differences between Java arrays
 * and ArrayLists.
 */
public class DifferenceArraysArrayLists {
    public static void main(String[] args) {
        // An array has a fixed length after creation. Its component type is int,
        // so it stores primitive int values directly.
        int[] scores = {82, 91, 76};
        scores[1] = 94; // Replace an existing value by index.
        System.out.println("Array values: " + Arrays.toString(scores));
        System.out.println("Array length: " + scores.length);

        // To add an array element, create a larger array and copy the old data;
        // the original array itself cannot grow.
        int[] expandedScores = Arrays.copyOf(scores, scores.length + 1);
        expandedScores[3] = 88;
        System.out.println("Expanded array: " + Arrays.toString(expandedScores));

        // ArrayList is a resizable List. It uses a reference type (Integer here)
        // and provides methods such as add, get, set, remove, and size.
        ArrayList<Integer> scoreList = new ArrayList<>();
        scoreList.add(82);
        scoreList.add(91);
        scoreList.add(76);
        scoreList.set(1, 94); // Replace an existing value by index.
        scoreList.add(88);    // The list grows without manually copying it.
        System.out.println("ArrayList values: " + scoreList);
        System.out.println("ArrayList size: " + scoreList.size());

        scoreList.remove(Integer.valueOf(76));
        System.out.println("After removing 76: " + scoreList);
    }
}

