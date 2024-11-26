package com.example.bredufateczlsoex01.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bredufateczlsoex01.R;
import com.example.bredufateczlsoex01.controller.RaizController;

public class MainActivity extends AppCompatActivity {

    protected Button calcButton;
    protected EditText AValor;
    protected EditText BValor;
    protected EditText CValor;
    protected TextView ResultadoText;

    private final RaizController raizController = new RaizController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        calcButton = findViewById(R.id.calcButton);
        AValor = findViewById(R.id.AValor);
        BValor = findViewById(R.id.BValor);
        CValor = findViewById(R.id.CValor);
        ResultadoText = findViewById(R.id.ResultadoText);

        addActionListeners();
    }

    private void addActionListeners() {
        calcButton.setOnClickListener((View v) -> {
            int A = Integer.parseInt(AValor.getText().toString());
            int B = Integer.parseInt(BValor.getText().toString());
            int C = Integer.parseInt(CValor.getText().toString());
            String resultado = raizController.calcular(A, B, C);
            ResultadoText.setVisibility(View.VISIBLE);
            ResultadoText.setText(resultado);
        });

    }
}