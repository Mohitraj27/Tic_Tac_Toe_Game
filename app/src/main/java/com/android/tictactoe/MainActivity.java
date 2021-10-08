package com.android.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private ImageView image1,image2,image3,image4,image5,image6,image7,image8,image9;
  private Button playAgain;
int container = 0;
// 0 for star
    // 1 for smile
 int [] box = new int[9];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1= findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3= findViewById(R.id.image3);
        image4= findViewById(R.id.image4);
        image5= findViewById(R.id.image5);
        image6=findViewById(R.id.image6);
        image7=findViewById(R.id.image7);
        image8= findViewById(R.id.image8);
        image9= findViewById(R.id.image9);
        playAgain=findViewById(R.id.play_again);
int star = R.drawable.circle;
int smile = R.drawable.cross;

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(box[0] == 1)
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
                else {
                if(container == 0) {
                    image1.setImageResource(star);
                    container = 1;
                }
                else {
                    image1.setImageResource(smile);
                    container = 0;

                } box[0] = 1;
                }}
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(box[1] == 2)
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
                else {


                    if(container == 0) {
                        image2.setImageResource(star);
                        container = 1;
                    }
                    else
                    {image2.setImageResource(smile);
                        container = 0;

                    }
                    box[1] = 2;
            }}
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (box[2] == 3) {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                } else {
                    if (container == 0) {
                        image3.setImageResource(star);
                        container = 1;
                    } else {
                        image3.setImageResource(smile);
                        container = 0;

                    }
                    box[2] = 3;
                }
            }

        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(box[3] == 4)
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                } else {
                if(container == 0) {
                    image4.setImageResource(star);
                    container = 1;
                }
                else
                {image4.setImageResource(smile);
                    container = 0;

                }  box[3]=4;

            }}
        });
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(box[4] == 5)
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                } else {
                    if (container == 0) {
                        image5.setImageResource(star);
                        container = 1;
                    } else {
                        image5.setImageResource(smile);
                        container = 0;

                    }
                    box[4] = 5;
                }

            }
        });
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(box[5] == 6)
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                } else {
                    if (container == 0) {
                        image6.setImageResource(star);
                        container = 1;
                    } else {
                        image6.setImageResource(smile);
                        container = 0;

                    }
                    box[5] = 6;
                }

            }
        });
        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(box[6] == 7)
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                } else {
                    if (container == 0) {
                        image7.setImageResource(star);
                        container = 1;
                    } else {
                        image7.setImageResource(smile);
                        container = 0;

                    }
                    box[6] = 7;
                }

            }
        });
        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(box[7] == 8)
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                } else {
                if(container == 0) {
                    image8.setImageResource(star);
                    container = 1;
                }
                else
                {image8.setImageResource(smile);
                    container = 0;

                }
box[7]=8;}
            }
        });
        image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(box[8] == 9)
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                } else {
                if(container == 0) {
                    image9.setImageResource(star);
                    container = 1;
                }
                else
                {image9.setImageResource(smile);
                    container = 0;

                }
                box[8]=9;

            }}
        });


        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                image1.setImageResource(R.drawable.box_image);
                image2.setImageResource(R.drawable.box_image);
                image3.setImageResource(R.drawable.box_image);
                image4.setImageResource(R.drawable.box_image);
                image5.setImageResource(R.drawable.box_image);
                image6.setImageResource(R.drawable.box_image);
                image7.setImageResource(R.drawable.box_image);
                image8.setImageResource(R.drawable.box_image);
                image9.setImageResource(R.drawable.box_image);

                container =0;
             box = new int[9];
            }
        });
    }


    }
