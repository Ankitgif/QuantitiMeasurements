package com.quantitymeasurments;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Quantity zeroFeet1 = new Quantity(Unit.FEET, 0.0);
        Quantity zeroFeet2 = new Quantity(Unit.FEET, 0.0);
        Assert.assertEquals(zeroFeet1, zeroFeet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Quantity zeroFeet = new Quantity(Unit.FEET, 0.0);
        Quantity oneFeet = new Quantity(Unit.FEET, 1.0);
        Assert.assertNotEquals(zeroFeet, oneFeet);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Quantity zeroInch1 = new Quantity(Unit.INCH, 0.0);
        Quantity zeroInch2 = new Quantity(Unit.INCH, 0.0);
        Assert.assertEquals(zeroInch1, zeroInch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Quantity zeroInch = new Quantity(Unit.INCH, 0.0);
        Quantity oneInch = new Quantity(Unit.INCH, 1.0);
        Assert.assertNotEquals(zeroInch, oneInch);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Quantity zeroFeet = new Quantity(Unit.FEET, 0.0);
        Quantity zeroInch = new Quantity(Unit.INCH, 0.0);
        boolean areQuantityEqual = zeroFeet.equals(zeroInch);
        Assert.assertTrue(areQuantityEqual);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnEqualLength() {
        Quantity oneFeet = new Quantity(Unit.FEET, 1.0);
        Quantity oneInch = new Quantity(Unit.INCH, 1.0);
        boolean areQuantityEqual = oneFeet.equals(oneInch);
        Assert.assertFalse(areQuantityEqual);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualLength() {
        Quantity oneFeet1 = new Quantity(Unit.FEET, 1.0);
        Quantity oneFeet2 = new Quantity(Unit.FEET, 1.0);
        boolean areQuantityEqual = oneFeet1.equals(oneFeet2);
        Assert.assertTrue(areQuantityEqual);
    }

    @Test
    public void givenNullFeetAnd1Inch_ShouldReturnNotEqual() {
        Quantity nullFeet = null;
        Quantity oneInch = new Quantity(Unit.INCH, 1.0);
        Assert.assertNotEquals(nullFeet, oneInch);
    }

    @Test
    public void givenNullFeetAnd1Feet_ShouldReturnNotEqual() {
        Quantity oneFeet = new Quantity(Unit.FEET, 1.0);
        Quantity nullFeet = null;
        Assert.assertNotEquals(oneFeet, nullFeet);
    }

    @Test
    public void givenNullInchAnd1Feet_ShouldReturnNotEqual() {
        Quantity oneFeet = new Quantity(Unit.FEET, 1.0);
        Quantity nullInch = null;
        Assert.assertNotEquals(oneFeet, nullInch);
    }

    @Test
    public void givenNullInchAnd1Inch_ShouldReturnNotEqual() {
        Quantity oneInch = new Quantity(Unit.INCH, 1.0);
        Quantity nullInch = null;
        Assert.assertNotEquals(oneInch, nullInch);
    }

    @Test
    public void given1Feet1Feet_WhenTypeProper_ShouldReturnEqual() {
        Quantity oneFeet1 = new Quantity(Unit.FEET, 1.0);
        Quantity oneFeet2 = new Quantity(Unit.FEET, 1.0);
        Assert.assertEquals(oneFeet1.getClass(), oneFeet2.getClass());
    }

    @Test
    public void given1Feet1Inch_WhenTypeProper_ShouldReturnEqual() {
        Quantity oneFeet = new Quantity(Unit.FEET, 1.0);
        Quantity oneInch = new Quantity(Unit.INCH, 1.0);
        Assert.assertEquals(oneFeet.getClass(), oneInch.getClass());
    }

    @Test
    public void givenIntegerAndLength_WhenTypeProper_ShouldReturnNotEqual() {
        Integer value = 5;
        Quantity oneInch = new Quantity(Unit.INCH, 1.0);
        Assert.assertNotEquals(value.getClass(), oneInch.getClass());
    }

    @Test
    public void given1FeetAnd0Feet_WhenValueProper_ShouldReturnNotEqual() {
        Quantity oneFeet = new Quantity(Unit.FEET, 1.0);
        Quantity zeroFeet = new Quantity(Unit.FEET, 0.0);
        boolean isEqual = oneFeet.equals(zeroFeet);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenSameReferenceFeet_ShouldReturnEqualLength() {
        Quantity oneFeet = new Quantity(Unit.FEET, 1.0);
        boolean areQuantityEqual = oneFeet.equals(oneFeet);
        Assert.assertTrue(areQuantityEqual);
    }

    @Test
    public void givenSameReferenceInch_ShouldReturnEqualLength() {
        Quantity oneInch = new Quantity(Unit.INCH, 1.0);
        boolean areQuantityEqual = oneInch.equals(oneInch);
        Assert.assertTrue(areQuantityEqual);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnEqualLength() {
        Quantity threeFeet = new Quantity(Unit.FEET, 3.0);
        Quantity oneYard = new Quantity(Unit.YARD, 1.0);
        boolean areQuantityEqual = threeFeet.equals(oneYard);
        Assert.assertTrue(areQuantityEqual);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual() {
        Quantity oneFeet = new Quantity(Unit.FEET, 1.0);
        Quantity oneYard = new Quantity(Unit.YARD, 1.0);
        Assert.assertNotEquals(oneFeet, oneYard);
    }

    @Test
    public void given1InchAnd1Yard_ShouldReturnNotEqual() {
        Quantity oneInch = new Quantity(Unit.INCH, 1.0);
        Quantity oneYard = new Quantity(Unit.YARD, 1.0);
        Assert.assertNotEquals(oneInch, oneYard);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnEqualLength() {
        Quantity oneYard = new Quantity(Unit.YARD, 1.0);
        Quantity thirtySixInch = new Quantity(Unit.INCH, 36.0);
        boolean areQuantityEqual = oneYard.equals(thirtySixInch);
        Assert.assertTrue(areQuantityEqual);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnEqualLength() {
        Quantity thirtySixInch = new Quantity(Unit.INCH, 36.0);
        Quantity oneYard = new Quantity(Unit.YARD, 1.0);
        boolean areQuantityEqual = thirtySixInch.equals(oneYard);
        Assert.assertTrue(areQuantityEqual);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnEqualLength() {
        Quantity oneYard = new Quantity(Unit.YARD, 1.0);
        Quantity threeFeet = new Quantity(Unit.FEET, 3.0);
        boolean areQuantityEqual = oneYard.equals(threeFeet);
        Assert.assertTrue(areQuantityEqual);
    }

    @Test
    public void given1InchAnd1Inch_ShouldReturnEqualLength() {
        Quantity oneInch1 = new Quantity(Unit.INCH, 1.0);
        Quantity oneInch2 = new Quantity(Unit.INCH, 1.0);
        boolean areQuantityEqual = oneInch1.equals(oneInch2);
        Assert.assertTrue(areQuantityEqual);
    }

    @Test
    public void given2InchAnd5Centimeter_ShouldReturnEqualLength() {
        Quantity twoInch = new Quantity(Unit.INCH, 2.0);
        Quantity fiveCentimeter = new Quantity(Unit.CENTIMETER, 5.0);
        boolean areQuantityEqual = twoInch.equals(fiveCentimeter);
        Assert.assertTrue(areQuantityEqual);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdd_ShouldReturn4Inch() {
        Quantity twoInch1 = new Quantity(Unit.INCH, 2.0);
        Quantity twoInch2 = new Quantity(Unit.INCH, 2.0);
        Quantity fourInch = new Quantity(Unit.INCH, 4.0);
        Quantity addedQuantity = twoInch1.addQuantity(twoInch2);
        Assert.assertEquals(fourInch, addedQuantity);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdd_ShouldReturn14Inch() {
        Quantity oneFeet = new Quantity(Unit.FEET, 1.0);
        Quantity twoFeet = new Quantity(Unit.INCH, 2.0);
        Quantity fourteenInch = new Quantity(Unit.INCH, 14);
        Quantity addedQuantity = oneFeet.addQuantity(twoFeet);
        Assert.assertEquals(fourteenInch, addedQuantity);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdd_ShouldReturn24Inch() {
        Quantity oneFeet1 = new Quantity(Unit.FEET, 1.0);
        Quantity oneFeet2 = new Quantity(Unit.FEET, 1.0);
        Quantity twentyFourInch = new Quantity(Unit.INCH, 24);
        Quantity addedQuantity = oneFeet1.addQuantity(oneFeet2);
        Assert.assertEquals(twentyFourInch, addedQuantity);
    }

    @Test
    public void given2InchAnd2point5Centimeter_WhenAdd_ShouldReturn3Inch() {
        Quantity twoInch = new Quantity(Unit.INCH, 2.0);
        Quantity twoPoinFiveInch = new Quantity(Unit.CENTIMETER, 2.5);
        Quantity threeInch = new Quantity(Unit.INCH, 3);
        Quantity addedQuantity = twoInch.addQuantity(twoPoinFiveInch);
        Assert.assertEquals(threeInch, addedQuantity);

    }

    @Test
    public void given1GallonAnd3point78Litre_ShouldReturnEqualVolume() {
        Quantity oneGallon = new Quantity(Unit.GALLON, 1);
        Quantity threePointSevenEightLitre = new Quantity(Unit.LITRE, 3.78);
        boolean areQuantityEqual = oneGallon.equals(threePointSevenEightLitre);
        Assert.assertTrue(areQuantityEqual);
    }

    @Test
    public void given1LitreAnd1000Millilitre_ShouldReturnEqualVolume() {
        Quantity oneLitre = new Quantity(Unit.LITRE, 1);
        Quantity thousandMillilitre = new Quantity(Unit.MILLILITRE, 1000);
        boolean areQuantityEqual = oneLitre.equals(thousandMillilitre);
        Assert.assertTrue(areQuantityEqual);
    }

    @Test
    public void given1GallonAnd3point78Litre_WhenAdd_ShouldReturn7point56Litre() {
        Quantity oneGallon = new Quantity(Unit.GALLON, 1);
        Quantity threePointSevenEightLitre = new Quantity(Unit.LITRE, 3.78);
        Quantity litre = new Quantity(Unit.LITRE, 7.56);
        Quantity addedQuantity = oneGallon.addQuantity(threePointSevenEightLitre);
        Assert.assertEquals(litre, addedQuantity);
    }

    @Test
    public void given1LitreAnd1000Millilitre_WhenAdd_ShouldReturn2Litre() {
        Quantity oneLitre = new Quantity(Unit.LITRE, 1);
        Quantity thousandMillilitre = new Quantity(Unit.MILLILITRE, 1000);
        Quantity twoLitre = new Quantity(Unit.LITRE, 2);
        Quantity addedQuantity = oneLitre.addQuantity(thousandMillilitre);
        Assert.assertEquals(twoLitre, addedQuantity);
    }

    @Test
    public void given1KgAnd1000grams_ShouldReturnEqualWeight() {
        Quantity oneKilogram = new Quantity(Unit.KILOGRAM, 1);
        Quantity thousandGram = new Quantity(Unit.GRAM, 1000);
        boolean areQuantityEqual = oneKilogram.equals(thousandGram);
        Assert.assertTrue(areQuantityEqual);
    }

    @Test
    public void given1TonneAnd1000kgs_ShouldReturnEqualLength() {
        Quantity oneTonne = new Quantity(Unit.TONNE, 1);
        Quantity thousandKilogram = new Quantity(Unit.KILOGRAM, 1000);
        boolean areQuantityEqual = oneTonne.equals(thousandKilogram);
        Assert.assertTrue(areQuantityEqual);
    }

    @Test
    public void given1TonneAnd1000gram_WhenAdd_ShouldReturn1001Kg() {
        Quantity oneTonne = new Quantity(Unit.TONNE, 1);
        Quantity thousandGram = new Quantity(Unit.GRAM, 1000);
        Quantity oneThousandOneKilogram = new Quantity(Unit.KILOGRAM, 1001);
        Quantity addedQuantity = oneTonne.addQuantity(thousandGram);
        Assert.assertEquals(oneThousandOneKilogram, addedQuantity);
    }

    @Test
    public void given212FAnd100C_ShouldReturnEqualTemperature() {
        Quantity twoHundredTwelveFahrenheit = new Quantity(Unit.FAHRENHEIT, 212);
        Quantity hundredCelcius = new Quantity(Unit.CELSIUS, 100);
        boolean areQuantityEqual = twoHundredTwelveFahrenheit.equals(hundredCelcius);
        Assert.assertTrue(areQuantityEqual);
    }
}
