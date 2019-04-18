package com.example.dola.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/**
 *  This app displays an order from to order coffee.
 * */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the oder button is clicked.
     */
    public void submitOrder(View view){
        display(1);
    }


    /**
     * This method display the given quantity value on the screen.
     * @param i
     */
    void display(int i){
        TextView qteTextView = (TextView) findViewById(R.id.quantity);

        qteTextView.setText(""+i);
    }
}
