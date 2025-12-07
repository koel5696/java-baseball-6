package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class AnswerGenerator {

    private AnswerGenerator() {
    }

    public static List<Integer> generateAnswer() {
        List<Integer> baseballNumbers = new ArrayList<>();
        while (baseballNumbers.size() < 3) {
            int n = Randoms.pickNumberInRange(1, 9);
            if (!baseballNumbers.contains(n)) {
                baseballNumbers.add(n);
            }
        }
        return baseballNumbers;
    }

}
