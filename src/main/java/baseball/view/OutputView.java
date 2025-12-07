package baseball.view;

import baseball.domain.GameResultDTO;

public class OutputView {

    public void printResult(GameResultDTO gameResultDTO) {
        System.out.println(Formatter.resultFormatter(gameResultDTO));
    }

}
