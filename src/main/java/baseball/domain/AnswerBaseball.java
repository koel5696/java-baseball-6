package baseball.domain;

import java.util.List;

public class AnswerBaseball {
    private final List<Integer> answerBaseballNumber; // 일시적인 상태는 인스턴스로 두지 않는다.

    public AnswerBaseball(List<Integer> answerBaseballNumber) {
        this.answerBaseballNumber = answerBaseballNumber;
    }

    public GameResultDTO compare(List<Integer> inputNumbers) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < inputNumbers.size(); i++) {
            int number = inputNumbers.get(i);

            if (answerBaseballNumber.contains(number)) {
                if (isStrike(number, i)) {
                    strike++;
                } else {
                    ball++;
                }
            }
        }
        return new GameResultDTO(strike, ball);
    }

    private boolean isStrike(int number, int index) {
        return answerBaseballNumber.get(index) == number;
    }
}