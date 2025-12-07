package baseball.service;

import baseball.domain.AnswerBaseball;
import baseball.domain.GameResultDTO;
import java.util.List;

public class BaseballService {

    public GameResultDTO gameStart(List<Integer> baseballNumbers, String number) {
        List<Integer> inputNumbers = format(number);
        AnswerBaseball answerBaseball = new AnswerBaseball(baseballNumbers);
        return answerBaseball.compare(inputNumbers);
    }

    private List<Integer> format(String number) {
        return number.chars()
                .map(c -> c - '0')
                .boxed()
                .toList();
    }

}
