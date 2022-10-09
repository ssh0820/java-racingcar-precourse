package racingcar.domain;

import racingcar.common.CarMessage;
import racingcar.common.ExcMessage;

import java.util.List;

public class CarName {
    private String name;

    public String getName(){
        return name;
    }

    /** 자동차 이름 길이 체크 5자 이하*/
    private void carNameCheck(String name){
        if(name.length() > CarMessage.NAME_LENGTH) throw new IllegalArgumentException(ExcMessage.ERROR_LENGTH);
    }

    /** 빈값 체크*/
    private void isCheck(String name){
        if(name.length() < CarMessage.MIN_NUMBER) throw new IllegalArgumentException(ExcMessage.ERROR_EMPTY);
    }

    /** 중복 체크*/
    private void duplicateCheck(List<String> nameList, String name, Integer index){
        if(nameList.contains(name) && !nameList.get(index).equals(name)) throw new IllegalArgumentException(ExcMessage.ERROR_DUPLICATE);
    }
}
