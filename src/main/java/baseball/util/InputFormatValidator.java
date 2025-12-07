package baseball.util;

public class InputFormatValidator {
    private static final String INPUT_REGEX = "^[1-9]{3}$";
    private static final String SELECT_REGEX = "^[1-2]$";

    public static void validateInputFormat(String input) {
        if(!input.matches(INPUT_REGEX)) {
            throw new IllegalArgumentException("올바르지 않은 입력");
        }
    }

    public static void validateReStartSelect(String number) {
        if(!number.matches(SELECT_REGEX)) {
            throw new IllegalArgumentException("1과 2만 입력");
        }
    }
}
