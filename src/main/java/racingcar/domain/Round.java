package racingcar.domain;

import racingcar.common.CarMessage;
import racingcar.common.ExcMessage;

import java.util.regex.Pattern;

public class Round {
    public int round = 0;

    public Round(int round){
        this.round = round;
    }

    public int getRound() {
        return round;
    }

    public void isCheck(String input){
        if(input.length() < CarMessage.MIN_NUMBER) throw new IllegalArgumentException(ExcMessage.ERROR_EMPTY);
    }

    public void inputRegex(String input){
        if(!Pattern.matches(ExcMessage.NUMBER_REGEX, input)) throw new IllegalArgumentException(ExcMessage.ERROR_NUMBER);
    }
}
