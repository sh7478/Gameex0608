package com.example.gameex0608;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnNew;
    Button btnSend1;
    Button btnSend2;
    Button btnSend3;
    LinearLayout secondCol;
    LinearLayout thirdCol;
    TextView txtVNum1;
    TextView txtVNum2;
    TextView txtVNum3;
    TextView txtVNum4;
    TextView txtVSum1;
    TextView txtVSum2;
    ImageView firstMark;
    ImageView secondMark;
    ImageView thirdMark;
    EditText firstAns;
    EditText secondAns;
    EditText thirdAns;
    int answer;
    int sum;
    int num1;
    int num2;
    int rolledNum;
    int successRate;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNew = findViewById(R.id.btnNew);
        btnSend1 = findViewById(R.id.btnSend1);
        btnSend2 = findViewById(R.id.btnSend2);
        btnSend3 = findViewById(R.id.btnSend3);
        secondCol = findViewById(R.id.secondCol);
        thirdCol = findViewById(R.id.thirdCol);
        txtVNum1 = findViewById(R.id.txtVNum1);
        txtVNum2 = findViewById(R.id.txtVNum2);
        txtVNum3 = findViewById(R.id.txtVNum3);
        txtVNum4 = findViewById(R.id.txtVNum4);
        txtVSum1 = findViewById(R.id.txtVSum1);
        txtVSum2 = findViewById(R.id.txtVSum2);
        firstMark = findViewById(R.id.firstMark);
        secondMark = findViewById(R.id.secondMark);
        thirdMark = findViewById(R.id.thirdMark);
        firstAns = findViewById(R.id.firstAns);
        secondAns = findViewById(R.id.secondAns);
        thirdAns = findViewById(R.id.thirdAns);
        startGame();
    }

    public void firstSent(View view)
    {
        st = firstAns.getText().toString();
        answer = Integer.parseInt(st);
        firstMark.setVisibility(View.VISIBLE);
        if(answer == sum)
        {
            firstMark.setImageResource(R.drawable.correct);
            successRate++;
        }
        else
        {
            firstMark.setImageResource(R.drawable.wrong);
        }
        secondCol.setVisibility(View.VISIBLE);
        txtVSum1.setVisibility(View.VISIBLE);
        num1 = randomNum();
        sum = sum + num1;
        txtVNum3.setText(""+num1);
        txtVSum2.setText(""+sum);
    }
    public void secondSent(View view)
    {
        st = secondAns.getText().toString();
        answer = Integer.parseInt(st);
        secondMark.setVisibility(View.VISIBLE);
        if(answer == sum)
        {
            secondMark.setImageResource(R.drawable.correct);
            successRate++;
        }
        else
        {
            secondMark.setImageResource(R.drawable.wrong);
        }
        thirdCol.setVisibility(View.VISIBLE);
        txtVSum2.setVisibility(View.VISIBLE);
        num1 = randomNum();
        sum = sum + num1;
        txtVNum4.setText("" + num1);
    }

    public void newGame(View view)
    {
        startGame();
    }


    public void startGame()
    {
        secondCol.setVisibility(View.INVISIBLE);
        thirdCol.setVisibility(View.INVISIBLE);
        btnSend1.setVisibility(View.INVISIBLE);
        txtVSum1.setVisibility(View.INVISIBLE);
        txtVSum2.setVisibility(View.INVISIBLE);
        firstMark.setVisibility(View.INVISIBLE);
        secondMark.setVisibility(View.INVISIBLE);
        thirdMark.setVisibility(View.INVISIBLE);
        btnSend2.setVisibility(View.INVISIBLE);
        btnSend3.setVisibility(View.INVISIBLE);
        answer = 0;
        successRate = 0;
        sum = 0;
        num1 = 0;
        num2 = 0;
        txtVNum3.setText("");
        txtVNum4.setText("");
        txtVSum2.setText("");
        num1 = randomNum();
        num2 = randomNum();
        sum = num1 + num2;
        txtVNum1.setText("" + num1);
        txtVNum2.setText("" + num2);
        txtVSum1.setText("" + (num1 + num2));
        btnNew.setText("start new game.");

    }

    public void typing1(View view)
    {
        btnSend1.setVisibility(View.VISIBLE);
    }

    public void typing2(View view)
    {
        btnSend2.setVisibility(View.VISIBLE);
    }

    public void typing3(View view)
    {
        btnSend3.setVisibility(View.VISIBLE);
    }

    public int randomNum()
    {
        Random rnd= new Random();
        rolledNum = rnd.nextInt(99-10+1)+10;
        return rolledNum;
    }

    public void lastSend(View view)
    {
        st=thirdAns.getText().toString();
        answer = Integer.parseInt(st);
        thirdMark.setVisibility(View.VISIBLE);
        if(answer == sum)
        {
            thirdMark.setImageResource(R.drawable.correct);
            successRate++;
        }
        else
        {
            thirdMark.setImageResource(R.drawable.wrong);
        }
        btnNew.setText("start new game. correct rate: " + successRate + "/3 or " + (float)successRate/3*100 + "%");
    }
}
