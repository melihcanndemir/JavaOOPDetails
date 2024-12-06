package com.melihcandemir.javaoopdetails;

public class Cat implements Education{
    String name;
    String eyesColor;
    String featherColor;

    public static final String typeName = "Felis Catus";

    public Cat() {}

    public Cat(String name, String eyesColor, String featherColor) {
        this.name = name;
        this.eyesColor = eyesColor;
        this.featherColor = featherColor;
    }

    public static void speakCatStatic() {
        System.out.println("My type is: " + typeName);
    }

    public void speakCat() {
        System.out.println("My name is: " + this.name + " My type is: " + typeName);
    }

    @Override
    public boolean getEducation() {
        System.out.println("Cats don't education");
        return false;
    }
}