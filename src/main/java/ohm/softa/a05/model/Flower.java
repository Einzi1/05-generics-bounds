package ohm.softa.a05.model;

import java.util.Objects;

public class Flower extends Plant {

    private final PlantColor plantColor;

    public Flower(double height, String family, String name, PlantColor plantColor) {
        super(height, family, name);
        if(plantColor.equals(PlantColor.GREEN)) {
            throw new IllegalArgumentException("Color of flower can't be green");
        }
        this.plantColor = plantColor;
    }

    @Override
    public PlantColor getColor() {
        return this.plantColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flower flower = (Flower) o;
        return plantColor == flower.plantColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plantColor);
    }

    @Override
    public String toString() {
        return super.toString() + "\nFlower{" +
                "plantColor=" + plantColor +
                '}';
    }
}
