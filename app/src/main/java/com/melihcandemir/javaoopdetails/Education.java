package com.melihcandemir.javaoopdetails;

public interface Education {
    public boolean getEducation();

    public default boolean getEducationBody() {
        System.out.println("We don't get education");
        return false;
    }
}