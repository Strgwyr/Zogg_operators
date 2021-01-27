package com.example.zogg_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.displayTxt);

        //Arithmetic operators
        //Assignment operators
        //Logical operators
        //Comparison operators

        //Addition
        //Subtraction
        //Multiplication
        //Division
        //Modulo

        int birthYear =2002;
        int birthMonth=8;
        int birthday=25;

        int currentYear= 2021;
        int currentMonth= 1;
        int currentDay= 27;

        int ageInYears,ageInMonths,ageInDays;


        if(birthMonth>currentMonth) {
            currentMonth += 12;
            currentYear -= 1;
        }
        if(birthMonth>currentMonth) {
            currentDay += 30;
            currentMonth -= 1;
        }


        ageInYears = currentYear - birthYear;
        ageInMonths = currentMonth - birthMonth;
        ageInDays = currentDay - birthday;

        display.setText(String.valueOf("My precise age is \n"+ String.valueOf(ageInYears)+ " Years, \n"+ String.valueOf(ageInMonths)+ " Months, \n"+String.valueOf(ageInDays)+ " Days."));










        }



        //+=
        //-=
        //*=
        ///=
        //%=




    }
