package com.melihcandemir.javaoopdetails;

public class Dog extends Animal implements Education {
    public Dog() {}

    public Dog(String name, String eyesColor, String featherColor) {
        super(name, eyesColor, featherColor);
    }

    @Override
    public boolean getEducation() {
        System.out.println("Dogs get education");
        return true;
    }

    @Override
    public boolean getEducationBody() {
        System.out.println("Dogs are well education");
        return true;
    }
}