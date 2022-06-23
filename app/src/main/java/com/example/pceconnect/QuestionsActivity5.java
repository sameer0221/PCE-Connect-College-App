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

public class QuestionsActivity5 extends AppCompatActivity {
    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;
    private TextView questionnumber;



    String questions[] = {

            // aptitude

            "Pointing to a lady, Arun said: “The son of her only brother is the brother of my wife”. How is the lady related to Arun?",
            "Pointing to a person, Arun said to Sarika, “His mother the only daughter of your father.” How is Sarika related to that person?",
            "Condition: While:: Iteration: ?",
            "North: Jammu & Kashmir:: East",
            "Less: Few:: Measure:?",
            "In a row of ten girls, when Harini was shifted by two places towards the left, he became fourth from the left end. What was his earlier position from the left end of the row?",
            "If ZINGS is written as MDGCI in a certain code, how is LUNCH written in that code?",
            "Four of the following are alike in some manner, find out the one which doesn’t belong to the group?",
            "If Anand Kumar finds that he is fourteenth from the left end and 7 from the right end, then how many boys must be added to the line such that there are 30 boys in the line?",
            "In a class of 90 students, the numbers of boys are twice the number of girls. Swathi is 58th from the left end and there are 20 boys to the right of Swathi, then the number of girls to the left of Swathi?",



            // Technical


            "Who invented C++?",
            "Which component is used to compile, debug and execute the java programs?",
            "Which one of the following is not a Java feature?",
            "In Operating Systems, which of the following is/are CPU scheduling algorithms?",
            "The operating system is responsible for?",
            "Which command is used to remove a relation from an SQL?",
            "In which of the following formats data is stored in the database management system?",
            "How many types of access specifiers are provided in OOP (C++)?",
            "Which among the following can show polymorphism?",
            "What is an example of iteration in C?"

    };
    String answers[] = {"Sister of father-in-law","Mother","For", "Manipur", "Count","7th","FJGAD","D!J","10","17","Bjarne Stroustrup","JDK","Use of pointers","All of the mentioned","all of the mentioned","Drop table","Table","3","Overloading <<","all of the mentioned"};
    String opt[] = {




            //  Aptitude

            "Mother’s sister","Sister of father-in-law","Maternal aunt","Grandmother",
            "Mother","Aunt","Mother-in-law","Daughter",
            "if","do","Auto","For",
            "Gujarat","Tamil Nadu","Manipur","Andhra Pradesh",
            "Measurement","Weight","Count","Much",
            "2nd","4th","7th","5th",
            "FJGBD","FJGAD","FJGAE","FJGZD",
            "5XL","N@U","D!J","F&^",
            "12","10","14","8",
            "19","17","16","15",


            // Technical

            "Dennis Ritchie","Ken Thompson","Brian Kernighan","Bjarne Stroustrup",
            "JDK","JRE","JIT","JVM",
            "Object-oriented","Use of pointers","Portable","Dynamic and Extensible",
            "Priority","Round Robin","Shortest Job First","All of the mentioned",
            "bad-block recovery","booting from disk","disk initialization","all of the mentioned",
            "Drop table","Delete","Purge","Remove",
            "Image","Table","Text","Graph",
            "4","3","2","1",
            "Overloading <<","Overloading &&","Overloading ||","Overloading +=",
            "for","while","do-while","all of the mentioned"

    };




    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions5);

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
                    Intent in = new Intent(getApplicationContext(), com.example.pceconnect.ResultActivity5.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), com.example.pceconnect.ResultActivity5.class);
                startActivity(intent);
            }
        });
    }

}