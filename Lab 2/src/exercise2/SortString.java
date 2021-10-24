// This pgm is not completed.

package exercise2;

/*
 * Create a method that can accept an array of String objects and sort in alphabetical order.
 * The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case.
 * Return the resulting array.
 */
import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {

		String[] stringArray = { "ab", "Ba", "c", "Sub", "2", "1Ad", "a10" };

		// Invoking the method
		sortString(stringArray);

	}

	// method to sort the string in alphabetical order.
	public static void sortString(String[] sArr) {
		Arrays.sort(sArr);
		System.out.println(Arrays.toString(sArr));
	}
}
