package com.quantitymeasurments;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Quantity feet1 = new Quantity(Unit.FEET,0.0);
        Quantity feet2 = new Quantity(Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }
    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Unit.FEET,0.0);
        Quantity feet2 = new Quantity(Unit.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }
    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH,0.0);
        Quantity inch2 = new Quantity(Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }
    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Quantity inch1 = new Quantity(Unit.INCH,0.0);
        Quantity inch2 = new Quantity(Unit.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }
    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Quantity feet1 = new Quantity(Unit.FEET,0.0);
        Quantity inch1 = new Quantity(Unit.INCH,0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd1Inch_ShouldReturnEqualLength() {
        Quantity feet1 = new Quantity(Unit.FEET,1.0);
        Quantity inch1 = new Quantity(Unit.INCH,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualLength() {
        Quantity feet1 = new Quantity(Unit.FEET,1.0);
        Quantity feet2 = new Quantity(Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void givenNullFeetAnd1Inch_ShouldReturnNotEqual(){
        Quantity feet1 = null;
        Quantity inch1 = new Quantity(Unit.INCH,1.0);
        Assert.assertNotEquals(feet1,inch1);
    }
    @Test
    public void givenNullFeetAnd1Feet_ShouldReturnNotEqual(){
        Quantity feet1 = new Quantity(Unit.FEET,1.0);
        Quantity feet2 = null;
        Assert.assertNotEquals(feet1,feet2);
    }
    @Test
    public void givenNullInchAnd1Feet_ShouldReturnNotEqual(){
        Quantity feet1 = new Quantity(Unit.FEET,1.0);
        Quantity inch1 = null;
        Assert.assertNotEquals(feet1,inch1);
    }
    @Test
    public void givenNullInchAnd1Inch_ShouldReturnNotEqual(){
        Quantity inch1 = new Quantity(Unit.INCH,1.0);
        Quantity inch2 = null;
        Assert.assertNotEquals(inch1,inch2);
    }
    @Test
    public void given1Feet1Feet_WhenTypeProper_ShouldReturnEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        Assert.assertEquals(feet1.getClass(), feet2.getClass());
    }
    @Test
    public void given1Feet1Inch_WhenTypeProper_ShouldReturnEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Assert.assertEquals(feet1.getClass(), inch1.getClass());
    }
    @Test
    public void givenIntegerAndLength_WhenTypeProper_ShouldReturnNotEqual() {
        Integer value = 5;
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Assert.assertNotEquals(value.getClass(), inch1.getClass());
    }
    @Test
    public void given1FeetAnd0Feet_WhenValueProper_ShouldReturnNotEqual(){
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Unit.FEET, 0.0);
        boolean valueCheck = feet1.equals(feet2);
        Assert.assertFalse(valueCheck);
    }
    @Test
    public void givenSameReferenceFeet_ShouldReturnEqualLength() {
        Quantity feet1 = new Quantity(Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void givenSameReferenceInch_ShouldReturnEqualLength() {
        Quantity inch1 = new Quantity(Unit.INCH,1.0);
        boolean compareCheck = inch1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given3FeetAnd1Yard_ShouldReturnEqualLength(){
        Quantity feet1 = new Quantity(Unit.FEET,3.0);
        Quantity yard1 = new Quantity(Unit.YARD,1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual(){
        Quantity feet1 = new Quantity(Unit.FEET,1.0);
        Quantity yard1 = new Quantity(Unit.YARD,1.0);
        Assert.assertNotEquals(feet1,yard1);
    }
    @Test
    public void given1InchAnd1Yard_ShouldReturnNotEqual(){
        Quantity inch1 = new Quantity(Unit.INCH,1.0);
        Quantity yard1 = new Quantity(Unit.YARD,1.0);
        Assert.assertNotEquals(inch1,yard1);
    }
    @Test
    public void given1YardAnd36Inch_ShouldReturnEqualLength(){
        Quantity yard1 = new Quantity(Unit.YARD,1.0);
        Quantity inch1 = new Quantity(Unit.INCH,36.0);
        boolean compareCheck = yard1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given36InchAnd1Yard_ShouldReturnEqualLength(){
        Quantity inch1 = new Quantity(Unit.INCH,36.0);
        Quantity yard1 = new Quantity(Unit.YARD,1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1YardAnd3Feet_ShouldReturnEqualLength(){
        Quantity yard1 = new Quantity(Unit.YARD,1.0);
        Quantity feet1 = new Quantity(Unit.FEET,3.0);
        boolean compareCheck = yard1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1InchAnd1Inch_ShouldReturnEqualLength() {
        Quantity inch1 = new Quantity(Unit.INCH,1.0);
        Quantity inch2 = new Quantity(Unit.INCH,1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given2InchAnd5Centimeter_ShouldReturnEqualLength(){
        Quantity inch1 = new Quantity(Unit.INCH,2.0);
        Quantity centi1 = new Quantity(Unit.CENTIMETER,5.0);
        boolean compareCheck = inch1.compare(centi1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given2InchAnd2Inch_WhenAdd_ShouldReturn4Inch(){
        Quantity inch1 = new Quantity(Unit.INCH,2.0);
        Quantity inch2 = new Quantity(Unit.INCH,2.0);
        double add = Quantity.addQuantity(inch1,inch2);
        Assert.assertEquals(4,add,0.0);
    }
    @Test
    public void given1FeetAnd2Inch_WhenAdd_ShouldReturn14Inch(){
        Quantity feet1 = new Quantity(Unit.FEET,1.0);
        Quantity inch1 = new Quantity(Unit.INCH,2.0);
        double add = Quantity.addQuantity(feet1,inch1);
        Assert.assertEquals(14,add,0.0);
    }
    @Test
    public void given1FeetAnd1Feet_WhenAdd_ShouldReturn24Inch(){
        Quantity feet1 = new Quantity(Unit.FEET,1.0);
        Quantity feet2 = new Quantity(Unit.FEET,1.0);
        double add = Quantity.addQuantity(feet1,feet2);
        Assert.assertEquals(24,add,0.0);
    }
    @Test
    public void given2InchAnd2point5Centimeter_WhenAdd_ShouldReturn3Inch(){
        Quantity inch1 = new Quantity(Unit.INCH,2.0);
        Quantity centimeter1 = new Quantity(Unit.CENTIMETER,2.5);
        double add = Quantity.addQuantity(inch1,centimeter1);
        Assert.assertEquals(3,add,0.0);

    }
    @Test
    public void given1GallonAnd3point78Litre_ShouldReturnEqualVolume(){
        Quantity gallon1 = new Quantity(Unit.GALLON, 1);
        Quantity litre1 = new Quantity(Unit.LITRE, 3.78);
        boolean compareCheck = gallon1.compare(litre1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1LitreAnd1000Millilitre_ShouldReturnEqualVolume(){
        Quantity litre1 = new Quantity(Unit.LITRE, 1);
        Quantity millilitre1 = new Quantity(Unit.MILLILITRE, 1000);
        boolean compareCheck = litre1.compare(millilitre1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1GallonAnd3point78Litre_WhenAdd_ShouldReturn7point56Litre(){
        Quantity gallon1 = new Quantity(Unit.GALLON, 1);
        Quantity litre1 = new Quantity(Unit.LITRE, 3.78);
        double add = Quantity.addQuantity(gallon1,litre1);
        Assert.assertEquals(7.56,add,0.0);
    }
    @Test
    public void given1LitreAnd1000Millilitre_WhenAdd_ShouldReturn2Litre(){
        Quantity litre1 = new Quantity(Unit.LITRE, 1);
        Quantity millilitre1 = new Quantity(Unit.MILLILITRE, 1000);
        double add = Quantity.addQuantity(litre1,millilitre1);
        Assert.assertEquals(2,add,0.0);
    }
    @Test
    public void given1KgAnd1000grams_ShouldReturnEqualWeight(){
        Quantity kg1 = new Quantity(Unit.KILOGRAM,1);
        Quantity gram1 = new Quantity(Unit.GRAM,1000);
        boolean compareCheck = kg1.compare(gram1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1TonneAnd1000kgs_ShouldReturnEqualLength(){
        Quantity tonne1 = new Quantity(Unit.TONNE,1);
        Quantity kg1 = new Quantity(Unit.KILOGRAM,1000);
        boolean compareCheck = tonne1.compare(kg1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1TonneAnd1000gram_WhenAdd_ShouldReturn1001Kg(){
        Quantity tonne1 = new Quantity(Unit.TONNE,1);
        Quantity gram1 = new Quantity(Unit.GRAM,1000);
        double add = Quantity.addQuantity(tonne1,gram1);
        Assert.assertEquals(1001,add,0.0);
    }
    @Test
    public void given212FAnd100C_ShouldReturnEqualTemperature(){
        Quantity fahrenheit1 = new Quantity(Unit.FAHRENHEIT, 212);
        Quantity celsius1 = new Quantity(Unit.CELSIUS, 100);
        boolean compareCheck = fahrenheit1.compare(celsius1);
        Assert.assertTrue(compareCheck);
    }
}
