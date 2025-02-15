package com.quantitymeasurments;

public class Length {

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;

    }

    public static double addLength(Length length1, Length length2) {
         double addResult = length1.unit.getConvertedValue(length1.value) + length2.unit.getConvertedValue(length2.value);
         return addResult;
    }

    public boolean compare(Length that) {
        return Double.compare(that.unit.getConvertedValue(that.value),
                this.unit.getConvertedValue(this.value)) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

}
