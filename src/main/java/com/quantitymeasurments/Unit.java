package com.quantitymeasurments;

public enum Unit {

    FEET(12.0), INCH(1), YARD(36), CENTIMETER(0.4),
    LITRE(1),GALLON(3.78),MILLILITRE(0.001),KILOGRAM(1),
    GRAM(0.001),TONNE(1000),FAHRENHEIT(1),CELSIUS(2.12);

    private double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public double getConvertedValue(double value) {
        return this.baseUnitConversion * value;
    }
}
