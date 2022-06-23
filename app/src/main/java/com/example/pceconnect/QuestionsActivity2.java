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

public class QuestionsActivity2 extends AppCompatActivity {
    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;
    private TextView questionnumber;



    String questions[] = {

            // aptitude

            "What is the greatest possible positive integer n if 16^n divides (44)^44 without\n" +
                    "leaving a remainder.",
            "A, B, and C can together do some work in 72 days. A and B can together do\n" +
                    "two times as much work as C alone, and A and C together can do four times as\n" +
                    "much work as B alone. Find the time taken by C alone to do the whole work.",
            "In a test with 26 questions, five points were deducted for each wrong answer\n" +
                    "and eight points were added for every correct answer. How many were answered\n" +
                    "correctly if the score was zero?",
            "How many number plates can be made if the number plates have two letters of\n" +
                    "the English alphabets (A-Z) followed by two digits (0-9) if the repetition of digits or alphabets is not allowed?",
            "In this question, x^y stands for x raised to the power y. For example, 2^3=8\n" +
                    "and 4^1.5=8. If a,b are real numbers such that a+b=3, a^2+b^2=7, the value of\n" +
                    "a^4+b^4 is?",
            "The air-conditioned bus service from Siruseri industry park runs at regular\n" +
                    "intervals throughout the day. It is now 3:12 pm and it has arrived 1 minute ago but it was 2 minutes late. The next bus is due at 3:18 pm. When is the next bus due?",
            "The set A (0) is (1,2,3,4). For n > 0, A(n+1) contains all possible sums that can be\n" +
                    "obtained by adding two different numbers from what is the number of integers in A(10).",
            "Considering a hash table with 100 slots. Collisions are resolved usingchaining.\n" +
                    "Assuming simple uniform hashing, what is the probability that the first 3 slots are unfilled\n" +
                    "after the first 3 insertions?",
            "A man jogs at 6 mph over a certain journey and walks over the same route at 4 mph. What is his average speed for the journey?",
            "What is the fourth proportional of 0.006, 1.2 & 6/25?",



            // Technical


            "The C code ‘for(;;)'represents an infinite loop. It can be terminated by",
            "What are the advantages of passing arguments by reference?",
            "While evaluating a prefix expression, the string is read from?",
            "Which is used to describe the function using placeholder types?",
            "Thread priority in Java is?",
            "what is a percent of b divided by b percent of a?",
            "Which among the following doesn’t form a group?",
            "A, B and C can complete a work in 18 days, 24 days and 36 days respectively. Find the number of days taken by all of them together to complete 75% of the work together.",
            "A person sells an article at 12% loss. If he had purchased the article for 20% \n" +
                    "less and sold it for Rs. 24 more, then he would have gained 12%. Find the \n" +
                    "original cost price of the article.",
            "If 3889y8916x is divisible by 45, then find the value of (5x – 2y)."

    };
    String answers[] = {"29","216days","10","58500","47","3:27 pm","67","(97*97*97)/100^3","4.8mph","48","break","All of these","right to left","template type parameters","Integer","a","S7, S1","6 days","Rs. 1500","13"};
    String opt[] = {




            //  Aptitude

            "14","15","28","29",
            "144days","360days","216days","180days",
            "11","10","13","12",
            "56800","56500","52500","58500",
            "49","45","51","47",
            "3:27 pm","3:29 pm","3:24 pm","3:25 pm",
            "27","37","57","67",
            "(97*96*95)/100^3","(97*97*97)/100^3","(97*96*95)/100^3","(99*98*97)/100^3",
            "2.4 mph","4 mph","4.8 mph","5 mph",
            "36","48","4.8","3.6",


            // Technical

            "break","exit(0)","abort()","terminate",
            "Changes to parameter values within the function also affect the original arguments","There is need to copy parameter values (i.e. less memory used)","There is no need to call constructors for parameters (i.e. faster)","All of these",
            "right to left","left to right","center to right","center to left to right",
            "template parameters","template type parameters","type parameters","template type",
            "Integer","float","double","long",
            "a","b","1","10",
            "S5, S3","S7, S1 ","S8, S4 ","S5, S2",
            "6 days","12 days","5 days","8 days",
            "Rs. 2500","Rs. 1800","Rs. 1200","Rs. 1500",
            "31","13","24","18"

    };

    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions2);

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
                    Intent in = new Intent(getApplicationContext(), com.example.pceconnect.ResultActivity1.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), com.example.pceconnect.ResultActivity1.class);
                startActivity(intent);
            }
        });
    }

}