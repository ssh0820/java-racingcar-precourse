package racingcar.domain;

import racingcar.common.CarMessage;
import racingcar.common.ExcMessage;

public class Winner {

    private final String carName;

    public Winner(String carName){
        this.carName = carName;
    }

    public String getCarName(String name){
       return ExcMessage.WINNER+name;
    }

    public String getCarName(String[] names){
        String carName = "";

        for (String name: names
             ) {
            carName += name+ CarMessage.SEPARATOR+" ";
        }
        return ExcMessage.WINNER+ carName.substring(0,carName.length()-2);
    }
}
