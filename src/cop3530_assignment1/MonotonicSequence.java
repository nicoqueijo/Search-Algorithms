package cop3530_assignment1;

/**
 * *******************************************************************
 * Purpose/Description: Tester for the elementInArray algorithm. (See method
 * javadoc for more info). Author’s Panther ID: 5152398. Certification: I hereby
 * certify that this work is my own and none of it is the work of any other
 * person. ******************************************************************
 */
public class MonotonicSequence {

    // PART A
    /**
     * Tests the algorithm with a given array.
     *
     * @param args Command-line arguments are not used.
     */
    public static void main(String[] args) {
        int[] array = {-7, -5, -2, 0, 2, 3, 5, 9, 12, 13, 14, 18, 15, 11, 6, 1, -3};
        int n = array.length;
        System.out.println(elementInArray(array, n, 18));
    }

    /**
     * Determines if an array with the following property contains a certain
     * element. The first k elements (0 < k < n-1) are in strictly increasing
     * sequence followed by the strictly decreasing sequence.
     *
     * @param array Array to be tested.
     * @param n Size of the array.
     * @param k Element to be found.
     * @return Flag indicating if the array contains the element.
     */
    public static boolean elementInArray(int[] array, int n, int k) {
        boolean found = false;
        int peakIndex = 0;
        int low = 0;
        int mid;
        int high = n - 1;

        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] > array[mid - 1] && array[mid] < array[mid + 1]) {
                low = mid + 1;
            } else if (array[mid] > array[mid + 1] && array[mid] < array[mid - 1]) {
                high = mid - 1;
            } else {
                peakIndex = mid;
                break;
            }
        }

        low = 0;
        high = peakIndex;
        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] > k) {
                high = mid - 1;
            } else if (array[mid] < k) {
                low = mid + 1;
            } else {
                found = (array[mid] == k);
                return found;
            }
        }

        low = peakIndex + 1;
        high = n - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] < k) {
                high = mid - 1;
            } else if (array[mid] > k) {
                low = mid + 1;
            } else {
                found = (array[mid] == k);
                return found;
            }
        }

        return found;
    }

}

/**
 * *****************************************************************************
 * PART B
 *
 * Running time complexity of this algorithm is O(log n) also known as
 * logarithmic. This is because the algorithm includes three separate binary
 * searches. Each binary search is in O(log n). The three binary searches would
 * equal to O(3 log n) but since 3 is a constant it is ignored.
 *
 *******************************************************************************
 */
