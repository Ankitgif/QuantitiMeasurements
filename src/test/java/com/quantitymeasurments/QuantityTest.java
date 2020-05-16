package com.quantitymeasurments;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }
    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }
    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }
    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }
    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length inch1 = new Length(Unit.INCH,0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd1Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length inch1 = new Length(Unit.INCH,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualLength() {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void givenNullFeetAnd1Inch_ShouldReturnNotEqual(){
        Length feet1 = null;
        Length inch1 = new Length(Unit.INCH,1.0);
        Assert.assertNotEquals(feet1,inch1);
    }
    @Test
    public void givenNullFeetAnd1Feet_ShouldReturnNotEqual(){
        Length feet1 = new Length(Unit.FEET,1.0);
        Length feet2 = null;
        Assert.assertNotEquals(feet1,feet2);
    }
    @Test
    public void givenNullInchAnd1Feet_ShouldReturnNotEqual(){
        Length feet1 = new Length(Unit.FEET,1.0);
        Length inch1 = null;
        Assert.assertNotEquals(feet1,inch1);
    }
    @Test
    public void givenNullInchAnd1Inch_ShouldReturnNotEqual(){
        Length inch1 = new Length(Unit.INCH,1.0);
        Length inch2 = null;
        Assert.assertNotEquals(inch1,inch2);
    }
    @Test
    public void given1Feet1Feet_WhenTypeProper_ShouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length feet2 = new Length(Unit.FEET, 1.0);
        Assert.assertEquals(feet1.getClass(), feet2.getClass());
    }
    @Test
    public void given1Feet1Inch_WhenTypeProper_ShouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length inch1 = new Length(Unit.INCH, 1.0);
        Assert.assertEquals(feet1.getClass(), inch1.getClass());
    }
    @Test
    public void givenIntegerAndLength_WhenTypeProper_ShouldReturnNotEqual() {
        Integer value = 5;
        Length inch1 = new Length(Unit.INCH, 1.0);
        Assert.assertNotEquals(value.getClass(), inch1.getClass());
    }
    @Test
    public void given1FeetAnd0Feet_WhenValueProper_ShouldReturnNotEqual(){
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length feet2 = new Length(Unit.FEET, 0.0);
        boolean valueCheck = feet1.equals(feet2);
        Assert.assertFalse(valueCheck);
    }
    @Test
    public void givenSameReferenceFeet_ShouldReturnEqualLength() {
        Length feet1 = new Length(Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void givenSameReferenceInch_ShouldReturnEqualLength() {
        Length inch1 = new Length(Unit.INCH,1.0);
        boolean compareCheck = inch1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given3FeetAnd1Yard_ShouldReturnEqualLength(){
        Length feet1 = new Length(Unit.FEET,3.0);
        Length yard1 = new Length(Unit.YARD,1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual(){
        Length feet1 = new Length(Unit.FEET,1.0);
        Length yard1 = new Length(Unit.YARD,1.0);
        Assert.assertNotEquals(feet1,yard1);
    }
    @Test
    public void given1InchAnd1Yard_ShouldReturnNotEqual(){
        Length inch1 = new Length(Unit.INCH,1.0);
        Length yard1 = new Length(Unit.YARD,1.0);
        Assert.assertNotEquals(inch1,yard1);
    }
    @Test
    public void given1YardAnd36Inch_ShouldReturnEqualLength(){
        Length yard1 = new Length(Unit.YARD,1.0);
        Length inch1 = new Length(Unit.INCH,36.0);
        boolean compareCheck = yard1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given36InchAnd1Yard_ShouldReturnEqualLength(){
        Length inch1 = new Length(Unit.INCH,36.0);
        Length yard1 = new Length(Unit.YARD,1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1YardAnd3Feet_ShouldReturnEqualLength(){
        Length yard1 = new Length(Unit.YARD,1.0);
        Length feet1 = new Length(Unit.FEET,3.0);
        boolean compareCheck = yard1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1InchAnd1Inch_ShouldReturnEqualLength() {
        Length inch1 = new Length(Unit.INCH,1.0);
        Length inch2 = new Length(Unit.INCH,1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given2InchAnd5Centimeter_ShouldReturnEqualLength(){
        Length inch1 = new Length(Unit.INCH,2.0);
        Length centi1 = new Length(Unit.CENTIMETER,5.0);
        boolean compareCheck = inch1.compare(centi1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given2InchAnd2Inch_WhenAdd_ShouldReturn4Inch(){
        Length inch1 = new Length(Unit.INCH,2.0);
        Length inch2 = new Length(Unit.INCH,2.0);
        double add = Length.addLength(inch1,inch2);
        Assert.assertEquals(4,add,0.0);
    }
    @Test
    public void given1FeetAnd2Inch_WhenAdd_ShouldReturn14Inch(){
        Length feet1 = new Length(Unit.FEET,1.0);
        Length inch1 = new Length(Unit.INCH,2.0);
        double add = Length.addLength(feet1,inch1);
        Assert.assertEquals(14,add,0.0);
    }
    @Test
    public void given1FeetAnd1Feet_WhenAdd_ShouldReturn24Inch(){
        Length feet1 = new Length(Unit.FEET,1.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        double add = Length.addLength(feet1,feet2);
        Assert.assertEquals(24,add,0.0);
    }
    @Test
    public void given2InchAnd2point5Centimeter_WhenAdd_ShouldReturn3Inch(){
        Length inch1 = new Length(Unit.INCH,2.0);
        Length centimeter1 = new Length(Unit.CENTIMETER,2.5);
        double add = Length.addLength(inch1,centimeter1);
        Assert.assertEquals(3,add,0.0);

    }
    @Test
    public void given1GallonAnd3point78Litre_ShouldReturnEqualVolume(){
        Volume gallon1 = new Volume(Unit.GALLON, 1);
        Volume litre1 = new Volume(Unit.LITRE, 3.78);
        boolean compareCheck = gallon1.compare(litre1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1LitreAnd1000Millilitre_ShouldReturnEqualVolume(){
        Volume litre1 = new Volume(Unit.LITRE, 1);
        Volume millilitre1 = new Volume(Unit.MILLILITRE, 1000);
        boolean compareCheck = litre1.compare(millilitre1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1GallonAnd3point78Litre_WhenAdd_ShouldReturn7point56Litre(){
        Volume gallon1 = new Volume(Unit.GALLON, 1);
        Volume litre1 = new Volume(Unit.LITRE, 3.78);
        double add = Volume.addVolume(gallon1,litre1);
        Assert.assertEquals(7.56,add,0.0);
    }
    @Test
    public void given1LitreAnd1000Millilitre_WhenAdd_ShouldReturn2Litre(){
        Volume litre1 = new Volume(Unit.LITRE, 1);
        Volume millilitre1 = new Volume(Unit.MILLILITRE, 1000);
        double add = Volume.addVolume(litre1,millilitre1);
        Assert.assertEquals(2,add,0.0);
    }
    @Test
    public void given1KgAnd1000grams_ShouldReturnEqualWeight(){
        Weight kg1 = new Weight(Unit.KILOGRAM,1);
        Weight gram1 = new Weight(Unit.GRAM,1000);
        boolean compareCheck = kg1.compare(gram1);
        Assert.assertTrue(compareCheck);
    }

}
