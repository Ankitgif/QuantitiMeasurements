package com.quantitymeasurments;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }
    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }
    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }
    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }
    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd1Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void givenNullFeetAnd1Inch_ShouldReturnNotEqual(){
        Length feet1 = null;
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(feet1,inch1);
    }
    @Test
    public void givenNullFeetAnd1Feet_ShouldReturnNotEqual(){
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = null;
        Assert.assertNotEquals(feet1,feet2);
    }
    @Test
    public void givenNullInchAnd1Feet_ShouldReturnNotEqual(){
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = null;
        Assert.assertNotEquals(feet1,inch1);
    }
    @Test
    public void givenNullInchAnd1Inch_ShouldReturnNotEqual(){
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length inch2 = null;
        Assert.assertNotEquals(inch1,inch2);
    }
    @Test
    public void given1Feet1Feet_WhenTypeProper_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assert.assertEquals(feet1.getClass(), feet2.getClass());
    }
    @Test
    public void given1Feet1Inch_WhenTypeProper_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertEquals(feet1.getClass(), inch1.getClass());
    }
    @Test
    public void givenIntegerAndLength_WhenTypeProper_ShouldReturnNotEqual() {
        Integer value = 5;
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(value.getClass(), inch1.getClass());
    }
    @Test
    public void given1FeetAnd0Feet_WhenValueProper_ShouldReturnNotEqual(){
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        boolean valueCheck = feet1.equals(feet2);
        Assert.assertFalse(valueCheck);
    }
    @Test
    public void givenSameReferenceFeet_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void givenSameReferenceInch_ShouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        boolean compareCheck = inch1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given3FeetAnd1Yard_ShouldReturnEqualLength(){
        Length feet1 = new Length(Length.Unit.FEET,3.0);
        Length yard1 = new Length(Length.Unit.YARD,1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assert.assertTrue(compareCheck);

    }
}
