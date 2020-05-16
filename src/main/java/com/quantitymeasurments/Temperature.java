package com.quantitymeasurments;

import java.util.Objects;

public class Temperature {
    private final Unit unit;
    private final double value;

    public Temperature(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }
    public boolean compare(Temperature that) {
        return Double.compare(that.unit.getConvertedValue(that.value),
                this.unit.getConvertedValue(this.value)) == 0;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.value, value) == 0 &&
                unit == that.unit;
    }

}
