/**
 * Class to work with
 */
class Multiplicator {
	public static <T extends Copy<T>> Folder<T>[] multiply(Folder<T> folder, int arraySize) {
		Folder<T>[] result = new Folder[arraySize];
		for (int i = 0; i < result.length; i++) {
			result[i] = new Folder<>();
			result[i].put(folder.get().copy());
		}
		return result;
	}
}
