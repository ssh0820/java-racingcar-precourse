package racingcar.domain;

import racingcar.common.CarMessage;
import racingcar.common.ExcMessage;

public class Car {

    private final CarName carName;

    private final Position position;

    private final Round round;

    public Car(CarName carName,Position position, Round round){
        this.carName = carName;
        this.position = position;
        this.round = round;
    }

}
