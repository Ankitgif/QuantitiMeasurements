package com.quantitymeasurments;

public enum Unit {

    FEET(12.0),INCH(1),YARD(36);

    double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public boolean compare(Length l1, Length l2){
        return Double.compare(l1.value*l1.unit.baseUnitConversion,
                l2.value*l2.unit.baseUnitConversion) == 0;

    }
}
