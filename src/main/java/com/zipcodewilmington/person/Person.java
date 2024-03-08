package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private String hairColor;   //1
    private String eyeColor;    //5
    private String levelEducation;  //4
    private int age;
    private boolean employed;   //2
    private boolean hasPets;    //3


    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String hairColor, String eyeColor, String levelEducation, int age, boolean employed, boolean hasPets) {
        this.name = name;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.levelEducation = levelEducation;
        this.age = age;
        this.employed = employed;
        this.hasPets = hasPets;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setLevelEducation(String levelEducation) {
        this.levelEducation = levelEducation;
    }

    public void setIsEmployed(boolean employed) {
        this.employed = employed;
    }

    public void setHasPets(boolean hasPets) {
        this.hasPets = hasPets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHairColor() {
        return hairColor = "Brown";
    }

    public String getEyeColor() {
        return eyeColor = "Hazel";
    }

    public String getLevelEducation() {
        return levelEducation = "Highschool Diploma";
    }

    public boolean getIsEmployed() {
        return employed = true;
    }

    public boolean getHasPets() {
        return hasPets = true;
    }

    public String getName() {
        return name ="Leon";
    }

    public Integer getAge() {

        return age = 5;
    }

}
