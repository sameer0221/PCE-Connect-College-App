package com.example.pceconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionsActivity extends AppCompatActivity {
    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;
    private TextView questionnumber;

    String questions[] = {

            // aptitude

            /*"developer name",*/
            "The ratio of A and B is in the ratio 5: 8. After 6 years, the ratio of ages of A and B will be in the ratio 17: 26. Find the present age of B.",
            " What is the difference between the selling price of an article costing 1000 rupees when a discount of 20% is given in the article and when two successive discounts of 10% are given in the article?",
            "If an article is sold for 270 at a loss of 10% then, to make a profit of 15%, at what price article should be sold.",
            "The marked price of an article is 20% above the cost price. When the selling price of an article is increased by 30% the profit doubles. If the market price of an article is 480, the original selling price is.",
            "A shopkeeper purchased some goods for Rs.900 and sold one-third of the goods at a loss of what 12%, then at gain % should the remainder goods, he sold to gain 18% profit on the whole transaction?",
            "A man went shopping to buy a mobile for Rs.3500, the rate of sales tax is 8%. He tells the shopkeeper to reduce the price of mobile to such an extent that has to pay Rs.3500, inclusive of all taxes. Find the reduced price.",
            "Two trains starting at the same time from 2 stations 200 km apart and going in the opposite direction cross each other at a distance of 110 km from one of the stations. What is the ratio of their speeds?",
            "Excluding stoppages, the speed of a bus is 54 kmph and including stoppages, it is 45 kmph. For how many minutes does the bus stop per hour?",
            "Three pipes of same capacity can fill a tank in 8 hours. If there are only two pipes of the same capacity, the tank can be filled in?",
            " In an examination, there are 3 subjects Physics, Biology, and Sanskrit of 100 marks each. Jayasri scores 60% and 80% in Physics and Biology. She scored 70% in aggregate. Her Percentage of mark in Sanskrit is?",


            // Technical


            "Which of the following is a universal gate ?",
            "The default back end of the VB is",
            "Directions 12 to 20: For the following questions find the odd man out",
            "If Ax + By = 1F16; Cx + Dy = 2510 .Find the value of x and y Semaphore is used for",
            "Which of the following remains in memory temporarily",
            "Pick the odd one out",
            "OS/2 IS a",
            "The entry of starting cluster of a file is present in",
            "Let ax2 + bx + c = 0.If the sum of the equal roots is equal to the product of the same roots.Then which of the\n" +
                    "following hold true",
            "Bootstrap loader program is a program belonging to"
    };
    String answers[] = {"72","10","345","571.4","33","Rs.260","11:9","10","12hours","70","NOR","Sybase","CMOS","synchronisation","Transient portion of COMMAND.COM","ROM-BIOS","Multitasking OS","FAT","a+b=0","ROM startup software"};
    String opt[] = {




            //  Aptitude

            "65","70","60","72",
            "10","20","30","40",
            "315","325","335","345",
            "531.15","537.14"," 571.4","582.12",
            "18","26","31","33",
            "Rs.140","Rs.210","Rs.260","Rs.320",
            "7:3","7:5","11:9","18:4",
            "9","10","12","20",
            "12hours","16hours","17hours","24hours",
            "50","60","70","80",


            // Technical

            "OR","AND","XOR","NOR",
            "Oracle","Sybase","Informic","none",
            "Unix","OS/2","CMOS","MSDOS",
            "synchronisation","dead-lock avoidance","box","none",
            "Resident portion of COMMAND.COM","Transient portion of COMMAND.COM","API","Disk BIOS",
            "IO.SYS","MSDOS.SYS","ROM-BIOS","COMMAND.COM",
            "Single user OS","Multi user OS","Multi tasking OS","None of theseMulti tasking OS",
            "Boot parameters","Directory","FAT","Partition table and master boot program",
            " a + b = 0","a = 0","c = 0","a+c = 0",
            " ROM startup software"," ROM extension software","ROM BIOS software"," ROM Basic software"

    };
    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        final TextView score = (TextView)findViewById(R.id.textView4);
        TextView textView=(TextView)findViewById(R.id.DispName);
        Intent intent = getIntent();



        questionnumber=findViewById(R.id.DispName);
        submitbutton=(Button)findViewById(R.id.button3);
        quitbutton=(Button)findViewById(R.id.buttonquit);
        tv=(TextView) findViewById(R.id.tvque);

        radio_g=(RadioGroup)findViewById(R.id.answersgrp);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        rb4=(RadioButton)findViewById(R.id.radioButton4);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int color = mBackgroundColor.getColor();
                //mLayout.setBackgroundColor(color);

                if(radio_g.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(getApplicationContext(), "Please select one choice", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
//                Toast.makeText(getApplicationContext(), ansText, Toast.LENGTH_SHORT).show();
                if(ansText.equals(answers[flag])) {
                    correct++;
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    wrong++;
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }

                flag++;

                if (score != null)
                    score.setText(""+correct);

                if(flag<questions.length)
                {
                    tv.setText(questions[flag]);
                    rb1.setText(opt[flag*4]);
                    rb2.setText(opt[flag*4 +1]);
                    rb3.setText(opt[flag*4 +2]);
                    rb4.setText(opt[flag*4 +3]);
                    questionnumber.setText(flag+"/"+questions.length+" Question");



                }
                else
                {
                    marks=correct;
                    Intent in = new Intent(getApplicationContext(), com.example.pceconnect.ResultActivity.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), com.example.pceconnect.ResultActivity.class);
                startActivity(intent);
            }
        });
    }

}