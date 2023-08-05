package JavaProgram.TUC_Arrays;
/*
 Given two first names of two persons, please calculate name_proximity_score. Name proximity score is calculated as follows:
 ~ If a letter occurs in the same position in both names, the score increments by two.
 ~ If a letter occurs in both names, but in different positions, the score is incremented by 1.
 ~ Once a letter in a particular position is used by any of the names, it cannot be considered again. However, if the same letter occurs -
   in another position, it can be used.
   INPUT:  The first line contains the first name & the second line contains second name
   OUTPUT: Only an integer value, showing name_proximity_score.
*/
import java.util.HashSet;
import java.util.Set;

public class NameProximityScore {
    public static int nameProximityScore(String firstName1, String firstName2) {
        int score = 0;
        Set<Integer> usedIndexes = new HashSet<>();

//        A usedIndexes set is created to keep track of the indexes that have been already considered during the scoring process.

        for (int i = 0; i < Math.min(firstName1.length(), firstName2.length()); i++) {
            if (firstName1.charAt(i) == firstName2.charAt(i)) {
                score += 2;
                usedIndexes.add(i);
            }
        }

        for (int i = 0; i < Math.min(firstName1.length(), firstName2.length()); i++) {
            if (!usedIndexes.contains(i) && firstName2.contains(String.valueOf(firstName1.charAt(i)))) {
                score += 1;
                usedIndexes.add(i);
            }
        }

        return score;
    }

    public static void main(String[] args) {
        String firstName1 = "Ryaan";
        String firstName2 = "Nagesh";
        int proximityScore = nameProximityScore(firstName1, firstName2);
        System.out.println("Proximity Score: " + proximityScore);
    }
}


//We can also write this program without using  Set data type and save our space complexity
//but using set it is more readable and understandable. Both of the case using O(n^2) Time complexity.

/*
public class NameProximityScore {
    public static int nameProximityScore(String firstName1, String firstName2) {
        int score = 0;

        for (int i = 0; i < Math.min(firstName1.length(), firstName2.length()); i++) {
            if (firstName1.charAt(i) == firstName2.charAt(i)) {
                score += 2;
            }
        }

        for (int i = 0; i < Math.min(firstName1.length(), firstName2.length()); i++) {
            if (firstName1.charAt(i) != firstName2.charAt(i)) {
                if (firstName2.contains(String.valueOf(firstName1.charAt(i)))) {
                    score += 1;
                }
            }
        }

        return score;
    }

    public static void main(String[] args) {
        String firstName1 = "John";
        String firstName2 = "Jane";
        int proximityScore = nameProximityScore(firstName1, firstName2);
        System.out.println("Proximity Score: " + proximityScore);
    }
}
*/
