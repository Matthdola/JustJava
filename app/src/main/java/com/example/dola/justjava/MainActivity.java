package com.example.dola.justjava;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/**
 *  This app displays an order from to order coffee.
 * */

public class MainActivity extends AppCompatActivity {

    int quantity = 2;
    int coffeePrice = 25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the oder button is clicked.
     */
    public void submitOrder(View view){
        display(quantity);
        displayPrice(quantity * coffeePrice);
    }

    /**
     * This method is called when the oder button is clicked.
     */
    public void increment(View view){
        quantity += 1;
        display(quantity);
    }

    /**
     * This method is called when the oder button is clicked.
     */
    public void decrement(View view){
        quantity -= quantity > 0 ? 1 : 0;
        display(quantity);
    }


    /**
     * This method display the given quantity value on the screen.
     * @param i
     */
    void display(int i){
        TextView qteTextView = (TextView) findViewById(R.id.quantity);

        qteTextView.setText(""+i);
    }

    /**
     * This method display the given quantity value on the screen.
     * @param i
     */
    void displayPrice(int i){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        //https://gist.github.com/anonymous/fa134c55a4a43e8d6004

        priceTextView.setText(NumberFormat.getCurrencyInstance().format(i));
    }
}
