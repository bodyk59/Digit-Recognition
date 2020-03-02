import org.hyperskill.hstest.v6.stage.BaseStageTest;
import org.hyperskill.hstest.v6.testcase.CheckResult;
import org.hyperskill.hstest.v6.testcase.TestCase;
import recognition.Main;

import java.util.List;


class Clue {
    String answer;
    String opposite;
    String input;
    Clue(int ans) {
        answer = Integer.toString(ans);
        if (ans == 1) {
            opposite = "0";
        }
        else {
            opposite = "1";
        }
    }
}

public class DigitRecognitionTest extends BaseStageTest<Clue> {
    public DigitRecognitionTest() throws Exception {
        super(Main.class);
    }

    @Override
    public List<TestCase<Clue>> generate() {
        List<TestCase<Clue>> tests = List.of(
            new TestCase<Clue>()
                .setAttach(new Clue(1))
                .setInput(
                    "_X_\n" +
                    "_X_\n" +
                    "XX_\n"),

            new TestCase<Clue>()
                .setAttach(new Clue(0))
                .setInput(
                    "_XX\n" +
                    "X_X\n" +
                    "XXX\n"),

            new TestCase<Clue>()
                .setAttach(new Clue(1))
                .setInput(
                    "_X_\n" +
                    "_X_\n" +
                    "X__\n"),

            new TestCase<Clue>()
                .setAttach(new Clue(0))
                .setInput(
                    "_X_\n" +
                    "X_X\n" +
                    "_X_\n"),

            new TestCase<Clue>()
                .setAttach(new Clue(1))
                .setInput(
                    "_X_\n" +
                    "_X_\n" +
                    "_X_\n"),

            new TestCase<Clue>()
                .setAttach(new Clue(0))
                .setInput(
                    "XXX\n" +
                    "X_X\n" +
                    "XXX\n"),

            new TestCase<Clue>()
                .setAttach(new Clue(0))
                .setInput(
                    "_XX\n" +
                    "X_X\n" +
                    "XX_\n"),

            new TestCase<Clue>()
                .setAttach(new Clue(1))
                .setInput(
                    "_XX\n" +
                    "_X_\n" +
                    "_X_\n")
            );

        for (TestCase<Clue> test : tests) {
            test.getAttach().input = test.getInput();
        }

        return tests;
    }

    @Override
    public CheckResult check(String reply, Clue clue) {
        boolean result =
            reply.contains(clue.answer)
            && !reply.contains(clue.opposite);

        String feedback = "The input is:\n"
            + clue.input + "\nYour output is:\n"
            + reply;

        return new CheckResult(result, feedback);
    }
}
