package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "Leon";
        Integer expectedAge = 5;

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHairColor() {
        // Given
        Person person = new Person();
        String expected = "Brown";

        // When
        person.setHairColor(expected);

        // Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        // Given
        Person person = new Person();
        String expected = "Hazel";

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLevelEducation() {
        // Given
        Person person = new Person();
        String expected = "Highschool Diploma";

        // When
        person.setLevelEducation(expected);

        // Then
        String actual = person.getLevelEducation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetIsEmployed() {
        // Given
        Person person = new Person();
        boolean expected = true;

        // When
        person.setIsEmployed(expected);

        // Then
        boolean actual = person.getIsEmployed();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHasPets() {
        // Given
        Person person = new Person();
        boolean expected = true;

        // When
        person.setHasPets(expected);

        // Then
        boolean actual = person.getHasPets();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorPerson() {
        Person person = new Person();
        String expectedName = "Leon";
        int expectedAge = 5;
        String expectedHairColor = "Brown";
        String expectedEyeColor = "Hazel";
        String expectedLevelEducation = "Highschool Diploma";
        boolean expectedIsEmployed = true;
        boolean expectedHasPets = true;

        person.setName(expectedName);
        person.setAge(expectedAge);
        person.setHairColor(expectedHairColor);
        person.setEyeColor(expectedEyeColor);
        person.setLevelEducation(expectedLevelEducation);
        person.setIsEmployed(expectedIsEmployed);
        person.setHasPets(expectedHasPets);

        String actualName = person.getName();
        int actualAge = person.getAge();
        String actualHairColor = person.getHairColor();
        String actualEyeColor = person.getEyeColor();
        String actualEducation = person.getLevelEducation();
        boolean actualEmployment = person.getIsEmployed();
        boolean actualHasPets = person.getHasPets();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedLevelEducation, actualEducation);
        Assert.assertEquals(expectedIsEmployed, actualEmployment);
        Assert.assertEquals(expectedHasPets, actualHasPets);
    }
}
