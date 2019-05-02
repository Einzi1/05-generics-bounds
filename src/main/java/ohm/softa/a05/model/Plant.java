package ohm.softa.a05.model;

import java.util.Objects;

public abstract class Plant implements Comparable<Plant> {

    private double height;
    private String family;
    private String name;

    protected Plant(double height, String family, String name) {
        if(height <= 0.0) throw new IllegalArgumentException("Height must be greater than zero");
        if(family == null || family.length() == 0) throw new IllegalArgumentException("Family can't be null or empty");
        if(name == null || name.length() == 0) throw new IllegalArgumentException("Name can't be null or empty");
        this.height = height;
        this.family = family;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public abstract PlantColor getColor();

    @Override
    public int compareTo(Plant other) {
        return Double.compare(this.height, other.height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Double.compare(plant.height, height) == 0 &&
                family.equals(plant.family) &&
                name.equals(plant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, family, name);
    }

    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}