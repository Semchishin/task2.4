package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "Cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;
    public void setModel(String model) {
        this.model = model;
    }
    public Car() {
    }

    public Car(String model, int series){
        this.model = model;
        this.series = series;
    }
    public void setSeries(int series) {
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    @Override
    public String toString() {
        return "Car{"+
                "model='" + model + '\'' +
                ", series=" + series +
                '}';
    }

}
