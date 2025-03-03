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

public class MainActivity extends AppCompatActivity {

    Button btnNew;
    Button btnSend1;
    Button btnSend2;
    Button btnSend3;
    LinearLayout firstCol;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNew = findViewById(R.id.btnNew);
        btnSend1=findViewById(R.id.btnSend1);
        btnSend2=findViewById(R.id.btnSend2);
        btnSend3=findViewById(R.id.btnSend3);
        firstCol=findViewById(R.id.firstCol);
        secondCol=findViewById(R.id.secondCol);
        thirdCol=findViewById(R.id.thirdCol);
        txtVNum1=findViewById(R.id.txtVNum1);
        txtVNum2=findViewById(R.id.txtVNum2);
        txtVNum3=findViewById(R.id.txtVNum3);
        txtVNum4=findViewById(R.id.txtVNum4);
        txtVSum1=findViewById(R.id.txtVSum1);
        txtVSum2=findViewById(R.id.txtVSum2);
        firstMark=findViewById(R.id.firstMark);
        secondMark=findViewById(R.id.secondMark);
        thirdMark=findViewById(R.id.thirdMark);
        firstAns=findViewById(R.id.firstAns);
        secondAns=findViewById(R.id.secondAns);
        thirdAns=findViewById(R.id.thirdAns);
        startGame();
    }

    public void firstSent(View view)
    {
        continueGame();
    }
    public void secondSent(View view)
    {
        continueGame();
    }

    public void newGame(View view)
    {
        startGame();
    }
    public void continueGame()
    {
        if(answer == sum)
        {
            firstMark.setImageResource(R.drawable.correct);
        }
        else
        {
            firstMark.setImageResource(R.drawable.wrong);
        }
        secondCol.setVisibility(View.VISIBLE);
    }

    public void startGame()
    {
        secondCol.setVisibility(View.INVISIBLE);
        thirdCol.setVisibility(View.INVISIBLE);
        btnSend1.setVisibility(View.INVISIBLE);
        answer = 0;
        sum = 0;
        num1 = 0;
        num2 = 0;
        txtVNum1.setText("");
        txtVNum2.setText("");
        txtVNum3.setText("");
        txtVNum4.setText("");
        txtVSum1.setText("");
        txtVSum2.setText("");
    }
}
