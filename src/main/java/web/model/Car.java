package web.model;

public class Car {

    private String model;
    private String type;
    private int series;

    public Car(String model, String type, int series) {
        this.model = model;
        this.type = type;
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", series=" + series +
                '}';
    }
}
