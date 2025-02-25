package com.example.gameex0608;

import android.os.Bundle;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}