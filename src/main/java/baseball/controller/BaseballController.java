package baseball.controller;

import baseball.domain.GameResultDTO;
import baseball.service.BaseballService;
import baseball.util.AnswerGenerator;
import baseball.util.InputFormatValidator;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class BaseballController {
    private final InputView inputView;
    private final OutputView outputView;
    private final BaseballService baseballService;

    public BaseballController(OutputView outputView, InputView inputView, BaseballService baseballService) {
        this.outputView = outputView;
        this.inputView = inputView;
        this.baseballService = baseballService;
    }

    public void run() {
        List<Integer> baseballNumbers = AnswerGenerator.generateAnswer();
        inputView.startMessage();
        while(true) {
            String input = inputView.baseballStartInput();
            InputFormatValidator.validateInputFormat(input);
            GameResultDTO gameResultDTO = baseballService.gameStart(baseballNumbers, input);
            outputView.printResult(gameResultDTO);
            if(threeStrike(gameResultDTO)) {
                if(!reStart()) {
                    break;
                }
                baseballNumbers = AnswerGenerator.generateAnswer();
            }
        }
    }

    private boolean threeStrike(GameResultDTO gameResultDTO) {
        return gameResultDTO.strike() == 3;
    }

    private boolean reStart() {
        String selectReStart = inputView.end();
        InputFormatValidator.validateReStartSelect(selectReStart);
        return selectReStart.equals("1");
    }
}
