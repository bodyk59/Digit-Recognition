public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
    int counter = 0;

    for (int number : list1) {
        if (number == elem) {
            counter++;
        }
    }

    for (int number : list2) {
        if (number == elem) {
            counter--;
        }
    }

    return counter == 0;
}
