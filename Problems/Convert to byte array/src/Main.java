// The method is OK, no need to change it
public void writeWords(String[] words) throws IOException {
    LetterPrinter printer = new LetterPrinter();

    char[] letters = convert(words);
    for (char letter : letters) {
        printer.write(letter);
    }
}

private char[] convert(String[] words) throws IOException {
    String temp = "";

    for (String string : words) {
       temp += string;
    }

    return temp.toCharArray();
}