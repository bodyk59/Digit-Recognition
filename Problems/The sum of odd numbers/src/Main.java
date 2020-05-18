/**
 * The method calculates the sum of odd numbers in the given range
 *
 * @param start of a range, start >= 0
 * @param end of a range (inclusive), end >= start
 *
 * @return sum of odd numbers
 */
public static long sumOfOddNumbersInRange(long start, long end) {
    return LongStream.rangeClosed(start, end)
        .filter(number -> number % 2 != 0)
        .sum();
}