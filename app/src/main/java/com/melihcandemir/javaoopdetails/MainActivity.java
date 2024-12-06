package com.melihcandemir.javaoopdetails;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Cat cat = new Cat("Whiskers", "yellow", "brown");
        Cat cat2 = new Cat();
        cat2.name = "Luna";
        System.out.println(cat2.name);
        // System.out.println(typeName);
        System.out.println(Cat.typeName);

        cat.speakCat();
        Cat.speakCatStatic();

        Dog dog = new Dog();
        Dog dog2 = new Dog("Barley", "Yellow", "Yellow");
        System.out.println(dog2.featherColor);
        Animal animal = new Animal();

        dog.getEducationBody();
    }
}