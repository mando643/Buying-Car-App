package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CarSelection_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_selection_);

        TextView descLbl = (TextView) findViewById(R.id.descriptionLabel);
        TextView speedLbl = (TextView) findViewById(R.id.speedLabel);
        TextView rangeLbl = (TextView) findViewById(R.id.rangeLabel);
        TextView priceLbl = (TextView) findViewById(R.id.priceLabel);
        descLbl.setVisibility(View.INVISIBLE);
        speedLbl.setVisibility(View.INVISIBLE);
        rangeLbl.setVisibility(View.INVISIBLE);
        priceLbl.setVisibility(View.INVISIBLE);
    }

    public void infoBtn (View c)
    {
        TextView descLbl = (TextView) findViewById(R.id.descriptionLabel);
        TextView speedLbl = (TextView) findViewById(R.id.speedLabel);
        TextView rangeLbl = (TextView) findViewById(R.id.rangeLabel);
        TextView priceLbl = (TextView) findViewById(R.id.priceLabel);

        TextView description = (TextView) findViewById(R.id.description);
        TextView speed = (TextView) findViewById(R.id.speed);
        TextView range = (TextView) findViewById(R.id.range);
        TextView price = (TextView) findViewById(R.id.price);

        TextView silverD = (TextView) findViewById(R.id.silver);
        TextView whiteD = (TextView) findViewById(R.id.white);
        TextView redD = (TextView) findViewById(R.id.red);


        RadioGroup modelGroup = (RadioGroup) findViewById(R.id.carModels);
        String modelChecked = ((RadioButton)findViewById(modelGroup.getCheckedRadioButtonId())).getText().toString();

        RadioGroup colorGroup = (RadioGroup) findViewById(R.id.carColors);
        String colorChecked = ((RadioButton)findViewById(colorGroup.getCheckedRadioButtonId())).getText().toString();

        if (modelChecked.equals("Model S"))
        {
            description.setText("Five Seat Premium Sedan");
            speed.setText("2.3s");
            range.setText("391 mi");
            price.setText("$79,990");
        }
        if (modelChecked.equals("Model 3"))
        {
            description.setText("Five Seat Commercial Sedan");
            speed.setText("3.2s");
            range.setText("322 mi");
            price.setText("$39,990");
        }
        if (modelChecked.equals("Model X"))
        {
            description.setText("Seven Seat SUV");
            speed.setText("4.4s");
            range.setText("351 mi");
            price.setText("$84,990");
        }
        if (modelChecked.equals("Model Y"))
        {
            description.setText("Seven Seat CUV");
            speed.setText("4.8s");
            range.setText("316 mi");
            price.setText("$52,990");
        }

        descLbl.setVisibility(View.VISIBLE);
        speedLbl.setVisibility(View.VISIBLE);
        rangeLbl.setVisibility(View.VISIBLE);
        priceLbl.setVisibility(View.VISIBLE);
    }

    public void purchaseBtn(View a)
    {
        double totalPrice = 0;
        double carPrice = 0;
        double colorPrice = 0;

        RadioGroup modelGroup = (RadioGroup) findViewById(R.id.carModels);
        String modelChecked = ((RadioButton)findViewById(modelGroup.getCheckedRadioButtonId())).getText().toString();

        RadioGroup colorGroup = (RadioGroup) findViewById(R.id.carColors);
        String colorChecked = ((RadioButton)findViewById(colorGroup.getCheckedRadioButtonId())).getText().toString();

        if (modelChecked.equals("Model S"))
        {
            carPrice = 79990;
        }
        if (modelChecked.equals("Model 3"))
        {
            carPrice = 39990;
        }
        if (modelChecked.equals("Model X"))
        {
            carPrice = 84990;
        }
        if (modelChecked.equals("Model Y"))
        {
            carPrice = 52990;
        }

        if (colorChecked.equals("Silver"))
        {
            colorPrice = 1000;
        }
        if (colorChecked.equals("White"))
        {
            colorPrice = 2000;
        }
        if (colorChecked.equals("Red"))
        {
            colorPrice = 3000;
        }

        totalPrice = carPrice + colorPrice;

        Intent lastActivity = new Intent(this,ExitScreen.class);

        lastActivity.putExtra("selectedModel", modelChecked);
        lastActivity.putExtra("selectedColor", colorChecked);
        lastActivity.putExtra("priceColor", colorPrice);
        lastActivity.putExtra("priceCar", carPrice);
        lastActivity.putExtra("fullPrice", totalPrice);

        startActivity(lastActivity);
    }
}
