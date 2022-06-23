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

public class QuestionsActivity4 extends AppCompatActivity {
    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;
    private TextView questionnumber;



    String questions[] = {

            // aptitude

            "Express a speed of 36 kmph in meters per second?",
            "The speed of a train is 90 kmph. What is the distance covered by it in 10 \n" +
                    "minutes?",
            "What number has a 5:1 ratio to the number 10?",
            "In how many years does a sum of Rs. 5000 yield a simple interest of Rs. 16500 \n" +
                    "at 15% p.a.?",
            "The radius of a circle is increased by 1%. Find how much % does its area \n" +
                    "increases?",
            "A and B complete a work in 6 days. A alone can do it in 10 days. If both together \n" +
                    "can do the work in how many days?",
            "Some persons can do a piece of work in 12 days. Two times the number of \n" +
                    "these people will do half of that work in?",
            "Express 25 mps in kmph?",
            "Two same glasses are respectively 1/4th 1/5th full of milk. They are then filled \n" +
                    "with water and the contents mixed in a tumbler. The ratio of milk and water in \n" +
                    "the tumbler is?",
            "A car covers a distance of 624 km in 6 ½ hours. Find its speed?",



            // Technical


            "A quiz has one multiple choice question with answer choices A, B, and C, and two true/false\n" +
                    "questions. What is the probability of answering all three questions correctly by guessing?",
            "The LCM AND HCF of two numbers are 2970 and 30 respectively. Prime factors of the\n" +
                    "product of",
            "In a poultry farm, 50 hens give 200 eggs in 2 days. In how many days will 20 hens give 400 eggs?",
            "Which number should be multiplied by 43 so that it will have 3 prime factors?",
            "Choose the correct option.\n" +
                    "What is the unit digit of the following sum: 1+ 22 + 33 + 44 + 55 + 66?",
            "Find the missing term in the series.\n" +
                    "2,3,7,8,13,14……",
            "From the given choices select the odd one out?",
            "Find the next number in the series 1,4,8,48.....",
            "A bag contains 4 strawberries and 8 grapes. What is the probability that both the fruits drawn from strawberries?",
            "What is the value of (a,y) in (13-20 – a x 13y\n" +
                    ") = 168 x 13-22?"

    };
    String answers[] = {"10 mps","15kmph","50","23","2.01%","3.75 days","3 days","90kmph","9:31","104 kmph","1/12","2,3,5,11","10","6","9","20","STE","100","1/11","(1, -22)"};
    String opt[] = {




            //  Aptitude

            "10 mps","12 mps","14 mps","17 mps",
            "15 kmph","12 kmph","10 kmph","5kmph",
            "42","50","55","62",
            "22","24","25","23",
            "1.01%","5.01%","3.01%","2.01%",
            "3.75 days","4 days","5 days","6 days",
            "3 days","4 days","6 days","12 days",
            "15 kmph","99kmph","90kmph","none",
            "3:8","9:31","8:21","10:27",
            "104 kmph","140 kmph","104 kmph","10.4 kmph",


            // Technical

            "1/5","1/3","1/12","1/4",
            "2,3,5,11","2,3,7,11","2,4,5,11","2,3,7,13",
            "15","10","5","8",
            "2","3","6","8",
            "0","4","7","9",
            "24","21","18","20",
            "ADP","QTX","HKR","STE",
            "120","64","100","96",
            "1/3","1/11","3/11","1/6",
            "(1, 2)"," (0, 1)","(-1, 22)","(1, -22)"

    };


    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions4);

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
                    Intent in = new Intent(getApplicationContext(), com.example.pceconnect.ResultActivity4.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), com.example.pceconnect.ResultActivity4.class);
                startActivity(intent);
            }
        });
    }

}