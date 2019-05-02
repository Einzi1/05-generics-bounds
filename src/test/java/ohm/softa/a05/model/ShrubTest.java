package ohm.softa.a05.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ShrubTest {
    @Test
    void testGetColor() {
        assertEquals(PlantColor.GREEN, new Shrub(1.5, "Buxus", "Buxus sempervirens").getColor());
    }

    @Test
    void testCreateShrubWithEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> new Shrub(1.5, "Buxus", null));
    }

    @Test
    void testCreateShrubWithEmptyFamily() {
        assertThrows(IllegalArgumentException.class, () -> new Shrub(1.5, null, "Buxus sempervirens"));
    }

    @Test
    void testCreateShrubWithNegativeHeight() {
        assertThrows(IllegalArgumentException.class, () -> new Shrub(-1.5, "Buxus", "Buxus sempervirens"));
    }

    @Test
    void testGetCorrectHeight() {
        Shrub s = new Shrub(1.5, "Buxus", "Buxus sempervirens");
        assertEquals(1.5, s.getHeight(), 0.0000001);
    }

    @Test
    void testGetCorrectName() {
        Shrub s = new Shrub(1.5, "Buxus", "Buxus sempervirens");
        assertEquals("Buxus sempervirens", s.getName());
    }

    @Test
    void testGetCorrectFamily() {
        Shrub s = new Shrub(1.5, "Buxus", "Buxus sempervirens");
        assertEquals("Buxus", s.getFamily());
    }
}