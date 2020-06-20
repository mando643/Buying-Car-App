package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ExitScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit_screen);
        Intent intentobj = getIntent();
        String title = "";
        String outPut = "";

        ImageView imageDisplayed = (ImageView) findViewById(R.id.carImage);

        if (intentobj != null)
        {
            String modelName = intentobj.getStringExtra("selectedModel");
            String colorName = intentobj.getStringExtra("selectedColor");
            double colorPrice = intentobj.getDoubleExtra("priceColor", 0);
            double carPrice = intentobj.getDoubleExtra("priceCar", 0);
            double totalPrice = intentobj.getDoubleExtra("fullPrice", 0);

            DecimalFormat df = new DecimalFormat("0.00");

            title = "Your " + modelName + " purchase has been finalized.";
            outPut = "You have purchased a brand new " + modelName + " color " + colorName + ". Price of car $" + df.format(carPrice)
                    + ". Paint job price $" + df.format(colorPrice) + ". For a total of $" + df.format(totalPrice);

            if (modelName.equals("Model S"))
            {
               if (colorName.equals("Silver"))
               {
                    imageDisplayed.setImageResource(R.drawable.silvermodels);
               }
               if (colorName.equals("White"))
                {
                    imageDisplayed.setImageResource(R.drawable.whitemodels);
                }
               if (colorName.equals("Red"))
                {
                    imageDisplayed.setImageResource(R.drawable.redmodels);
                }
            }

            if (modelName.equals("Model 3"))
            {
                if (colorName.equals("Silver"))
                {
                    imageDisplayed.setImageResource(R.drawable.silvermodel3);
                }
                if (colorName.equals("White"))
                {
                    imageDisplayed.setImageResource(R.drawable.whitemodel3);
                }
                if (colorName.equals("Red"))
                {
                    imageDisplayed.setImageResource(R.drawable.redmodel3);
                }
            }
            if (modelName.equals("Model X"))
            {
                if (colorName.equals("Silver"))
                {
                    imageDisplayed.setImageResource(R.drawable.silvermodelx);
                }
                if (colorName.equals("White"))
                {
                    imageDisplayed.setImageResource(R.drawable.whitemodelx);
                }
                if (colorName.equals("Red"))
                {
                    imageDisplayed.setImageResource(R.drawable.redmodelx);
                }
            }
            if (modelName.equals("Model Y"))
            {
                if (colorName.equals("Silver"))
                {
                    imageDisplayed.setImageResource(R.drawable.silvermodely);
                }
                if (colorName.equals("White"))
                {
                    imageDisplayed.setImageResource(R.drawable.whitemodely);
                }
                if (colorName.equals("Red"))
                {
                    imageDisplayed.setImageResource(R.drawable.redmodely);
                }
            }
        }

        TextView titleHeading = (TextView) findViewById(R.id.congratsTitle);
        titleHeading.setText(title);

        TextView details = (TextView) findViewById(R.id.results);
        details.setText(outPut);
    }
}
