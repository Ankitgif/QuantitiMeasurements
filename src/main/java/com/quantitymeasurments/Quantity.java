package com.quantitymeasurments;

public class Quantity {

    private final Unit unit;
    private final double value;

    public Quantity(Unit unit, double value) {
        this.unit = unit;
        this.value = value;

    }

    public static double addQuantity(Quantity quantity1, Quantity quantity2) {
         double addResult = quantity1.unit.getConvertedValue(quantity1.value) + quantity2.unit.getConvertedValue(quantity2.value);
         return addResult;
    }

    public boolean compare(Quantity that) {
        return Double.compare(that.unit.getConvertedValue(that.value),
                this.unit.getConvertedValue(this.value)) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, value) == 0 &&
                unit == quantity.unit;
    }

}
