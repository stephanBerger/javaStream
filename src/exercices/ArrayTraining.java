import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayTraining {

	/**
	 * @param n size of the array, eg: 3
	 * @return an empty int array of size n, eg: {0, 0, 0}
	 */
	public int[] emptyIntArray(int n) {

		return new int[n];
	}

	/**
	 * @param n size of the array, eg: 2
	 * @return an empty String array of size n, eg: {null, null}
	 */
	public String[] emptyStringArray(int n) {

		return new String[n];
	}

	/**
	 * @param a first value, eg: 3
	 * @param b second value, eg: 2
	 * @param c third value, eg: 1
	 * @return an int array with a, b and c values, eg: {3, 2, 1}
	 */
	public int[] intArray(int a, int b, int c) {

		return new int[] { a, b, c };
	}

	/**
	 * @param a first value, eg: "test"
	 * @param b second value, eg: "sample"
	 * @param c third value, eg: "value"
	 * @return a String array with a, b and c values, eg: {"test", sample", "value"}
	 */
	public String[] stringArray(String a, String b, String c) {

		return new String[] { a, b, c };
	}

	/**
	 * @param array, eg: {1, 2, 3}
	 * @return length of the array, eg: 1
	 */
	public int length(int[] array) {

		return array.length;
	}

	/**
	 * @param array, eg: {3, 2, 1}
	 * @return first value of the array, eg: 3
	 */
	public int firstValue(int[] array) {

		return array[0];
	}

	/**
	 * @param array, eg: {3, 2, 1}
	 * @return last value of the array, eg: 1
	 */
	public int lastValue(int[] array) {

		return array[array.length - 1];
	}

	/**
	 * @param array,    eg: {3, 2, 1}
	 * @param position, eg: 1
	 * @return value of the array at position, eg: 2
	 */
	public int valueAtPosition(int[] array, int position) {

		return array[position];
	}

	/**
	 * @param array,    eg: {3, 8, 5}
	 * @param value,    eg: 4
	 * @param position, eg: 1
	 * @return the array with the value replaced at position, eg: {3, 4, 5}
	 */
	public int[] replace(int[] array, int value, int position) {
		array[position] = value;
		return array;
	}

	/**
	 * @param array, eg: {1, 2, 3}
	 * @return sum of values of the array, eg: 6
	 */
	public int sum(int[] array) {

		return IntStream.of(array).sum();
	}

	/**
	 * @param array,  eg: {1, 2, 3}
	 * @param search, eg: 2
	 * @return if array contains searched value, eg: true
	 */
	public boolean contains(int[] array, int search) {
		boolean isContains = false;
		for (int i : array) {
			if (i == search) {
				isContains = true;
			}
		}
		return isContains;
	}

	/**
	 * @param array, eg: {"sample", "value"}
	 * @return array where all words are capitalized, eg: {"Sample", "Value"}
	 */
	public String[] capitalize(String[] array) {
		List<String> collect = Arrays.asList(array).stream()
				.map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
				.collect(Collectors.toList());

		return collect.stream().toArray(String[]::new);
	}

	/**
	 * @param first,  eg: {1, 2, 3}
	 * @param second, eg: {3, 2, 1}
	 * @return if values in first and second arrays, in the same position, are
	 *         equals, eg: false
	 */
	public boolean equals(int[] first, int[] second) {

		boolean isEquals = true;
		int length = this.length(first);
		int i = 0;

		while (isEquals && i < length) {
			if (first[i] != second[i]) {

				return false;
			}
			i++;
		}

		return isEquals;
	}

	/**
	 * @param array, eg: {1, 2, 3}
	 * @return array with reversed values, eg: {3, 2, 1}
	 */
	public int[] reverse(int[] array) {

		return IntStream.rangeClosed(1, array.length)
				.map(i -> array[array.length - i])
				.toArray();
	}

	/**
	 * @param first,  eg: {1, 2, 3}
	 * @param second, eg: {4, 5}
	 * @return concatenates first and second values in one array, eg: {1, 2, 3, 4,
	 *         5}
	 */
	public int[] concat(int[] first, int[] second) {

		return IntStream.concat(IntStream.of(first), IntStream.of(second)).toArray();
	}
}
