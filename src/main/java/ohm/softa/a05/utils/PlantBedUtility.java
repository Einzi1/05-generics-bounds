package ohm.softa.a05.utils;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantBed;
import ohm.softa.a05.model.PlantColor;

import java.util.HashMap;
import java.util.Map;

public abstract class PlantBedUtility {

    private PlantBedUtility() {
    }

    public static <T extends Plant> Map<PlantColor, SimpleList<T>> splitBedByColor(PlantBed<T> plantBed) {
        Map<PlantColor, SimpleList<T>> result = new HashMap<>();

        for (T plant : plantBed.getPlants()) {
            if (!result.containsKey((plant.getColor()))) {
                result.put(plant.getColor(), new SimpleListImpl<>());
            }
            result.get(plant.getColor()).add(plant);
        }
        return result;
    }
}