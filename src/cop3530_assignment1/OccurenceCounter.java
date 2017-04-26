package cop3530_assignment1;

/**
 * *******************************************************************
 * Purpose/Description: Tester for the numberOfOccurences algorithm. (See method
 * javadoc for more info). Author’s Panther ID: 5152398. Certification: I hereby
 * certify that this work is my own and none of it is the work of any other
 * person. ******************************************************************
 */
public class OccurenceCounter {

    // PART A
    /**
     * Tests the algorithm with a given array.
     *
     * @param args Command-line arguments are not used.
     */
    public static void main(String[] args) {
        int[] array = {-5, -2, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 11, 23, 24, 26, 28};
        int n = array.length;
        System.out.println(numberOfOccurences(array, n, 1));
    }

    /**
     * Determines the number of times a certain element appears in an array
     * given a sorted array with possible duplicate elements.
     *
     * @param array Array to be tested.
     * @param n Size of the array.
     * @param k Element to be found.
     * @return Number of times k appears in array.
     */
    public static int numberOfOccurences(int[] array, int n, int k) {
        int occurences = 0;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == k) {
                found = true;
                occurences++;
            } else if (found) {
                break;
            }
        }

        return occurences;
    }
}

/**
 * ********************************************************************************************************************************
 * PART B
 * 
 * Running time complexity of this algorithm is O(n) also known as linear. This
 * is because it uses one for loop to traverse through the entire array element
 * by element.
 *
 **********************************************************************************************************************************
 */
