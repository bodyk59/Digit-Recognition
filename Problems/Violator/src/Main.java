/**
 * Class to work with
 */
class Violator {
	public static List<Box<? extends Bakery>> defraud() {
		Box<Paper> paperBox = new Box<>();
		paperBox.put(new Paper());

		List objectList = new ArrayList<>();
		objectList.add(paperBox);

		return objectList;
	}
}