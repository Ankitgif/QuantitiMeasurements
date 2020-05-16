package com.quantitymeasurments;

import java.util.Objects;

public class Volume {

    private final Unit unit;
    private final double value;

    public Volume(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static double addVolume(Volume volume1, Volume volume2) {
        double addResult = volume1.unit.getConvertedValue(volume1.value) + volume2.unit.getConvertedValue(volume2.value);
        return addResult;
    }

    public boolean compare(Volume that) {
        return Double.compare(that.unit.getConvertedValue(that.value),
                this.unit.getConvertedValue(this.value)) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 &&
                unit == volume.unit;
    }

}
