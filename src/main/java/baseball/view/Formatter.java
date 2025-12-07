package baseball.view;

import baseball.domain.GameResultDTO;

public class Formatter {

    public static StringBuilder resultFormatter(GameResultDTO gameResultDTO) {
        StringBuilder sb = new StringBuilder();

        if(gameResultDTO.ball() == 0 && gameResultDTO.strike() == 0) {
            sb.append("낫싱");
        } else if(gameResultDTO.ball() == 0) {
            sb.append(gameResultDTO.strike() + "스트라이크");
        } else if(gameResultDTO.strike() == 0) {
            sb.append(gameResultDTO.ball() + "볼");
        } else
            sb.append(gameResultDTO.ball() + "볼 " + gameResultDTO.strike() + "스트라이크");
        return sb;
    }
}
