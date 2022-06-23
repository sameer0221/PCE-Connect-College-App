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

public class QuestionsActivity7 extends AppCompatActivity {
    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;
    private TextView questionnumber;




    String questions[] = {

            // aptitude

            "The smallest number which when diminished by 7, is divisible 12, 16, 18, 21 and 28 is?",
            "The ratio of two numbers is 3 : 4 and their H.C.F. is 4. Their L.C.M. is?\n",
            "If a and b are positive integers and (a-b)/3.5 = 4/7, then",
            "walking at 3/4 of his usual speed ,a man is late by 2 1/2 hr. the usual time is ?\n",
            "2 trains starting at the same time from 2 stations 200 km apart and going in opposite direction cross each other at a distance of 110 km from one of the stations.what is the ratio of their speeds?",
            "In a group of cows and hens, the number of legs are 14 more than twice the number of heads. The number of cows is\n",
            "A sum of money amounts to Rs. 9800 after 5 years and Rs. 12005 after 8 years at the same rate of simple interest. The rate of interest per annum is?",
            "A man can row 4.5 km/hr in still water. It takes him twice as long to row upstream as to row downstream. What is the rate of the current?\n",
            "If 9 men working 6 hours a day can do a work in 88 days. Then 6 men working 8 hours a day can do it in how many days?\n",
            "If 5 women or 8 girls can do a work in 84 days. In how many days can 10 women and 5 girls can do the same work?\n",



            // Technical

            "Which of the following is the function of the database administration?",
            "Pushing an element into stack already having five elements and stack size of 5, then stack becomes",
            "Which of the following applications may use a stack?",
            "With what data structure can a priority queue be implemented?",
            "Express 15 as a 6-bit signed binary number.",
            "What is meant by physical size in a dynamic array?",
            "Which is the predefined method available in Java to convert decimal to binary numbers?",
            "What is the function of application programs in the DBMS approach?",
            "Consider that m elements are to be sorted. What is the worst case time complexity of bubble sort?",
            "What of the following sorting procedure is the slowest?"

    };
    String answers[] = {"1015","48","b < a","7 1/2","11:9","7","12","1.5 km/hr","99","32 days","Database access planning","Overflow","All of the mentioned","All of the mentioned","101111","The size of the underlying array at the back-end","Binary String","Processing Functions","O(n^2)","Bubble sort"};
    String opt[] = {




            //  Aptitude

            "1008","1032","1022","1015",
            "16","48","24","12",
            "b = a","b < a","b > a","b >= a",
            "7 1/2","7","8 1/2","8",
            "11:8","10:9","10:90","11:9",
            "5","10","7","12",
            "12%","5%","8%","18%",
            "4.5 km/hr","2.5 km/hr","3.5 km/hr","1.5 km/hr",
            "89","86","99","76",
            "31 days","33 days","32 days","30 days",


            // Technical

            "Application checking","Database access planning","Computer applications management","All of these",
            "Underflow","User flow","Overflow","Crash",
            "Parentheses balancing program","Compiler syntax analyzer","Tracking of local variables at run time","All of the mentioned",
            "Array","List","Heap","All of the mentioned",
            "101111","001111","001110","101110",
            "The size allocated to elements","The size of the underlying array at the back-end","The size extended to add new elements","The size visible to users",
            "Binary Integer","Binary Value","Binary Number","Binary String",
            "Storage Functions","Access Control","Processing Functions","None of These",
            "n^2","1","log n","n",
            "Quick sort","Heap sort","Bubble sort","Shell sort"

    };

    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions7);

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
                    Intent in = new Intent(getApplicationContext(), com.example.pceconnect.ResultActivity7.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), com.example.pceconnect.ResultActivity7.class);
                startActivity(intent);
            }
        });
    }

}