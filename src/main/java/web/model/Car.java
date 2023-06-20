package web.model;

public class Car {

    private int series;
    private String model;
    private String user;

    public Car(int series, String model, String user) {
        this.series = series;
        this.model = model;
        this.user = user;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", model='" + model + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
