package com.quantitymeasurments;

import java.util.Objects;

public class Weight {

    private Unit unit;
    private double value;

    public Weight(Unit unit,double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Weight that) {
        return Double.compare(that.unit.getConvertedValue(that.value),
                this.unit.getConvertedValue(this.value)) == 0;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Double.compare(weight.value, value) == 0 &&
                unit == weight.unit;
    }

}
