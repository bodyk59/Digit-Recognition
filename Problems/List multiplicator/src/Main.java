/**
    Class to modify
*/
class ListMultiplicator {

    /**
        Multiplies original list provided numper of times

        @param list list to multiply
        @param n times to multiply, should be zero or greater
    */
	public static void multiply(List<?> list, int n) {
		multiplyHelper(list, n);
	}

	private static <T> void multiplyHelper(List<T> list, int n) {
		List<T> copy = new ArrayList<>(list);

		if (n == 0) {
			list.clear();
			return;
		}

		for (int i = 0; i < n - 1; i++) {
			list.addAll(copy);
		}
	}
}
