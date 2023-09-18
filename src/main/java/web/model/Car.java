package web.model;

import java.util.Objects;

public class Car {

    private String model;

    private int yearOfIssue;

    private int enginePower;

    public Car() {
    }

    public Car(String model, int yearOfIssue, int enginePower) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.enginePower = enginePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfIssue == car.yearOfIssue && enginePower == car.enginePower && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, yearOfIssue, enginePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", enginePower=" + enginePower +
                '}';
    }
}
