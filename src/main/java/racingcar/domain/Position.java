package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.common.CarMessage;
import racingcar.common.ExcMessage;

import java.util.regex.Pattern;

public class Position {
    private int position = 0;

    public int addPosition() {
        int randomNumber = 0;

        randomNumber = Randoms.pickNumberInRange(CarMessage.MIN_NUMBER,CarMessage.MAX_NUMBER);

        if(randomNumber >= CarMessage.MOVE_STANDARD){
            return this.position += 1;
        }
        return this.position;
    }


    public String getPosition() {
        StringBuilder road = new StringBuilder();
        for (int i = 1; i <= position; i++) {
            road.append(CarMessage.HYPHEN);
        }
        return road.toString();
    }

}
