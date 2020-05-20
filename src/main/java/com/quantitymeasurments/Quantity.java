package com.quantitymeasurments;

public class Quantity {

    private final Unit unit;
    private final double value;

    public Quantity(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public Quantity addQuantity(Quantity other) {
        return new Quantity(Unit.KILOGRAM, this.unit.getConvertedValue(this.value) + other.unit.getConvertedValue(other.value));
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Quantity that = (Quantity) other;
        return Double.compare(that.unit.getConvertedValue(that.value),
                this.unit.getConvertedValue(this.value)) == 0;
    }
}
