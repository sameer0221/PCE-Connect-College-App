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

public class QuestionsActivity6 extends AppCompatActivity {
    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;
    private TextView questionnumber;


    String questions[] = {

            // aptitude

            "The ratio of A and B is in the ratio 5: 8. After 6 years, the ratio of ages of A and B\n" +
                    "will be in the ratio 17: 26. Find the present age of B.",
            "A bag contains 25p, 50p and 1Re coins in the ratio of 2: 4: 5 respectively. If the total\n" +
                    "money in the bag is Rs 75, find the number of 50p coins in the bag.",
            "If an article is sold for 270 at a loss of 10% then, to make a profit of 15%, at what\n" +
                    "price article should be sold",
            "The greatest possible length which can be used to measure exactly the lengths 1m\n" +
                    "92cm,3m 84cm ,23m 4cm.",
            "HCF of 4/3, 8/6, 36/63 and 20/42",
            "Find the LCM of 3/8, 9/32, 33/48, 18/72",
            "If m and n are two whole numbers and if m^n= 49. Find n^m, given that n ≠ 1",
            "Priya bought 10 tables at the rate of 600 each. She spends 1600 rupees on\n" +
                    "transportation and 400 on the packaging. At what price should Priya sell a table to\n" +
                    "make a profit of 20%.",
            "A number of students in 4th and 5th class is in the ratio 6: 11. 40% in class 4 are\n" +
                    "girls and 48% in class 5 are girls. What percentage of students in both classes are boys?",
            "Consider two alloys A and B. 50 kg of alloy A is mixed with 70 kg of alloy B. A\n" +
                    "contains brass and copper in the ratio 3 : 2, and B contains them in the ratio 4 : 3\n" +
                    "respectively. What is the ratio of copper to brass in the mixture?",



            // Technical


            "Which of the following is not an OOP language?",
            "Which of the following is not a Script Programming language?",
            "Which of the following statements should be used to obtain a remainder after dividing 3.14\n" +
                    "by 2.1?",
            "Which of the following allows function overloading in C++?",
            "What does ‘stack underflow’ refer to?",
            "What is the time complexity of pop() operation when the stack is implemented using an\n" +
                    "array?",
            "A characteristic of an entity.",
            "The restrictions placed on the data.",
            "What does the following declaration mean?\n" +
                    "int (*ptr)[10];",
            "Database is generally ____"

    };
    String answers[] = {"72","40","345","32","4/126","198/8","128","960","54.8%","5:7","C","None","rem = fmod(3.14, 2.1);","Both (a) and (b)","Removing items from an empty stack","O(1)","Attribute","Constraint","ptr is a pointer to an array of 10 integers","User-centered"};
    String opt[] = {




            //  Aptitude

            "66","77","60","72",
            "40","45","50","25",
            "315","325","335","345",
            "32","26","34","23",
            "4/126","4/8","4/36","4/42",
            "3/8","8/33","198/8","8/3",
            "96","561","128","18",
            "860","920","960","1020",
            "62.5%","52.6%","55.8%","54.8%",
            "7: 5","5: 11","5: 7","8:5",


            // Technical

            "C","C++","Java","Python",
            "PHP","Ruby","JavaScript","None",
            "rem = modf(3.14, 2.1);","rem = fmod(3.14, 2.1);","rem = 3.14 % 2.1;","Remainder cannot be obtain in floating point division.",
            "Type","Number of arguments","both (a) and (b)","None of these",
            "Accessing item from an undefined stack","Adding items to a full stack","Removing items from an empty stack","Index out of bounds exception",
            "O(1)","O(n)","O(log n)","O(n log n)",
            "Relation","Attribute","Parameter","Constraint",
            "Relation","Attribute","Parameter","Constraint",
            "ptr is a pointer to an array of 10 integers","ptr is an array of 10 integers","ptr is an array of pointers to 10 integers","ptr is a pointer to an array",
            "System-centered","User-centered","Company-centered","Data-centered"

    };


    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions6);

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
                    Intent in = new Intent(getApplicationContext(), com.example.pceconnect.ResultActivity6.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), com.example.pceconnect.ResultActivity6.class);
                startActivity(intent);
            }
        });
    }

}