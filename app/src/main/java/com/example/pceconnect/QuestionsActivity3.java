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

public class QuestionsActivity3 extends AppCompatActivity {
    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;
    private TextView questionnumber;



    String questions[] = {

// aptitude



            "The permutations and combinations of abcd taken 3 at a time are respectively:",
            "The value of (1/512)1/9 is:",
            "If 2228/2n = 512 then find the value of n.",
            "Sangeeta invested Rs. 20,000 at 8 % p.a. If the interest is compounded half yearly, then total\n" +
                    "interest earned by Sangeeta at the end of the year is:",
            "What is the value of (5⁻² x 10⁻⁴) / (2⁻⁵ x 5⁻⁶)",
            "When 235 is divided by 5, then the remainder is:",
            "The product of two numbers is 2208. If the LCM of the number is 552. What is their HCF?",
            "Identify the set of all the positive integers",
            "Every year before the festive season, a shopkeeper increases the price of the products by 35% and then introduces two successive discounts of 10% and 15% respectively. What is his percentage loss or gain?",
            "If COMPUTER is coded as GKQLYPIN, what is the code for SENATE?",


// Technical
            "A tap can fill a bucket in 6 hours. After half the bucket is filled, three more similar taps are\n" +
                    "opened. What is the total time taken to fill the bucket completely?",
            "A reduction of 20% in the price of strawberries enables a person to purchase 12 more for Rs.\n" +
                    "15. What was the price of 16 strawberries before reduction ofprice?",
            "Ankit is the son of Zubin. Manju is the daughter of Anil. Sheela is the mother of Manju. Mohan\n" +
                    "is the brother of Manju. How is Mohan related to Sheela?",
            "Choose the best antonym for 'Exodus",
            "Choose the best antonym for Amused",
            "A whole number n which when divided by 4 gives 3 as remainder. What will be the remainder\n" +
                    "when 2n is divided by 4?",
            "Raju, Ramu and Razi can do a piece of work in 20, 30 and 60 days respectively depending\n" +
                    "on their capacity of doing work. If Raju is assisted by Ramu and Razi on every third day, then in\n" +
                    "how Raju will complete the work?",
            "Pointing to a gentleman, Neeraj said, His only brother is the father of my daughter's father.\n" +
                    "How is the gentleman related to Neeraj?",
            "n an election between two candidates, one got 55% of the total valid votes and got 20%\n" +
                    "invalid votes. At the end of the day when the total number of votes were counted, the total\n" +
                    "number was found to be 7500. So what was the total number of valid votes that the winning\n" +
                    "candidate got, was:",
            "What is the smallest number which when decreased by 8 is divisible by 21, 27, 33, and 55?"








    };
    String answers[] = {"24,4","1/2","None of these","Rs. 1632","2","3","4","{1, 2, 3, 4, …}","3.27% gain","WARWXA","3 hrs 45 min","5","Son","Influx","Saddened","2","15 days","Uncle","2700","None of the above"};
    String opt[] = {


            //  Aptitude




            "12, 2","24, 4","36, 6","48,8",
            "1/2","1/3","1/4","1/6",
            "219","218","237","None of these",
            "Rs. 1829","Rs. 1632","Rs, 1923","Rs. 2020",
            "0","2","5","10",
            "2","3","4","0",
            "12","4","24","Data inconsistent",
            "{0, 1, 2, 3, …}","{1, 2, 3, 4, …}","{2, 4, 6, 8, …}","{2, 5, 7, 11, …}",
            "3.27% loss","3.27% gain","No profit no loss","8.875% loss",
            "WARWXQ","WAPWXA","WARWXA","WARWPA",

            // Technical

            "3 hrs 15 min","3 hrs 45 min","4 hrs 25 min","4 hrs 15 min",
            "6","5","7","9",
            "Brother","Father","Son","Cannot be determined",
            "Influx","Homecoming","Return","Restoration",
            "Jolted","Frightene","Saddened","Astonished",
            "0","1","2","4",
            "12 days","15 days","16 days","18 days",
            "Father","Grandfather","brother-in-law","Uncle",
            "2400","3100","3400","2700",
            "1490","10405","15490","None of the above"










    };

    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions3);

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
                    Intent in = new Intent(getApplicationContext(), com.example.pceconnect.ResultActivity3.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), com.example.pceconnect.ResultActivity3.class);
                startActivity(intent);
            }
        });
    }

}