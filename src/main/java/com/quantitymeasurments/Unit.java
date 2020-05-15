package com.quantitymeasurments;

public enum Unit {

    FEET(12.0), INCH(1), YARD(36), CENTIMETER(0.4);

    private double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public double getConvertedValue(double value) {
        return this.baseUnitConversion * value;
    }
}
