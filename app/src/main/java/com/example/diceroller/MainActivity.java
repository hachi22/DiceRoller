package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button rollButton;
    ImageView dado1;
    ImageView dado2;
    Button reButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = findViewById(R.id.roll_button);
        dado1 = findViewById(R.id.dado1);
        dado2 = findViewById(R.id.dado2);
        reButton = findViewById(R.id.reButton);


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollButton.setText("Dice Rolled");
                int numRandom = (int) Math.floor(Math.random() * 6 + 1);
                switch (numRandom) {
                    case 1:
                        dado1.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                        break;
                    case 2:
                        dado1.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                        break;
                    case 3:
                        dado1.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                        break;
                    case 4:
                        dado1.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                        break;
                    case 5:
                        dado1.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                        break;
                    case 6:
                        dado1.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                        break;
                }
                int numRandom2 = (int) Math.floor(Math.random() * 6 + 1);
                switch (numRandom2) {
                    case 1:
                        dado2.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                        break;
                    case 2:
                        dado2.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                        break;
                    case 3:
                        dado2.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                        break;
                    case 4:
                        dado2.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                        break;
                    case 5:
                        dado2.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                        break;
                    case 6:
                        dado2.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                        break;
                }
                if (numRandom == 6 && numRandom2 == 6) {
                    Toast toast = Toast.makeText(MainActivity.this,
                            "JACKPOT!", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 5, 5);
                    toast.show();
                }

            }
        });

        reButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restart = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
                startActivity(restart);
            }
        });

        dado1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               numerosdado1();
            }
        });

        dado2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numerosdado2();
            }

        });
    }

    private void numerosdado1() {
        int numRandom = (int) Math.floor(Math.random() * 6 + 1);
        switch (numRandom) {
            case 1:
                dado1.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                break;
            case 2:
                dado1.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                break;
            case 3:
                dado1.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                break;
            case 4:
                dado1.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                break;
            case 5:
                dado1.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                break;
            case 6:
                dado1.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                break;
        }
    }
        private void numerosdado2(){
        int numRandom = (int) Math.floor(Math.random() * 6 + 1);
        switch (numRandom) {
            case 1:
                dado2.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                break;
            case 2:
                dado2.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                break;
            case 3:
                dado2.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                break;
            case 4:
                dado2.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                break;
            case 5:
                dado2.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                break;
            case 6:
                dado2.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                break;
        }
    }
}