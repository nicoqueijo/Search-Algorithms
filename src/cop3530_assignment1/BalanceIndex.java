package cop3530_assignment1;

/**
 * *******************************************************************
 * Purpose/Description: Tester for the balanceIndex algorithm. (See method
 * javadoc for more info). Author’s Panther ID: 5152398. Certification: I hereby
 * certify that this work is my own and none of it is the work of any other
 * person. ******************************************************************
 */
public class BalanceIndex {

    // PART A
    /**
     * Tests the algorithm with a given array.
     *
     * @param args Command-line arguments are not used.
     */
    public static void main(String[] args) {
        int[] array = {-5, 3, 7, -8, -2, 5, 2};
        int n = array.length;
        System.out.println(balanceIndex(array, n));
    }

    /**
     * Determines whether there exists an element in which the addition of all
     * the elements that come before it is equal to the addition of all the
     * elements that come after it.
     *
     * @param array Array to be tested.
     * @param n Size of the array.
     * @return Balance index if any or -1.
     */
    public static int balanceIndex(int[] array, int n) {
        int leftTotaliser = 0;
        int rightTotaliser = 0;
        for (int i = 0; i < n; i++) {
            rightTotaliser += array[i];
        }
        for (int i = 0; i < n; i++) {
            rightTotaliser -= array[i];
            if (rightTotaliser == leftTotaliser) {
                return i;
            } else {
                leftTotaliser += array[i];
            }
        }

        return -1;
    }

}

/**
 * ********************************************************************************************************************************
 * PART B
 *
 * Running time complexity of this algorithm is O(n) also known as linear. This
 * is because the algorithm traverses through the entire array element by
 * element in two different non-nested loops. It would then be O(2n) but since 2
 * is a constant it is ignored.
 *
 **********************************************************************************************************************************
 */
