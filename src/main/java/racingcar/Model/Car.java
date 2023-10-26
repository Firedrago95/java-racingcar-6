package racingcar.Model;

public class Car {

    public static final int MAX_CAR_NAME_LENGTH = 5;
    public static final String LONG_CAR_NAME_MESSAGE = "차량의 이름은 5글자 이하여야 합니다.";
    public static final int MAX_NAME_LENGTH = 5;
    public static final String EXCEED_LENGTH_MESSAGE = "5글자 이하의 이름을 입력해주세요";
    private String carName;
    private int position;

    public Car(String carName) {
        validateCarName(carName);
        this.carName = carName;
        this.position = 0;
    }

    private void validateCarName(String carName) {
        if (carName.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(EXCEED_LENGTH_MESSAGE);
        }
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

}