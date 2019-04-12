package com.sajan.bodymassindex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BodyMassIndexCalc{
    private double height, weight, bmi;

    public BodyMassIndexCalc(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double Bmi(){
        bmi = weight/(height/100 * height/100);
        bmi = Math.round(bmi*100)/100.0D;
        return bmi;

    }
    public String Category(){
        if (bmi<18.5){
            return "Underweight";
        }
        else if(bmi>18.5 && bmi<24.9){
            return "Normal Weight";

        }
        else if(bmi>25 && bmi<29.9){
            return "Overweight";

        }
        else{
            return "Obesity";

        }
    }
}
