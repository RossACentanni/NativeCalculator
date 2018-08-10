package com.example.nativecalculator.CalculatorActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nativecalculator.R;

public class MainActivity extends AppCompatActivity implements CalculatorContract.View {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    EditText ETOperand1;
    EditText ETOperand2;
    Button BTNAdd;
    Button BTNSub;
    TextView TVSolution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews(){
        ETOperand1 = findViewById(R.id.ETOperand1);
        ETOperand2 = findViewById(R.id.ETOperand2);
        BTNAdd = findViewById(R.id.BTNAdd);
        BTNSub = findViewById(R.id.BTNSubtract);
        TVSolution = findViewById(R.id.TVSolution);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.BTNAdd:
                add(Integer.parseInt(ETOperand1.getText().toString()), Integer.parseInt(ETOperand2.getText().toString()));
                break;
            case R.id.BTNSubtract:
                subtract(Integer.parseInt(ETOperand1.getText().toString()), Integer.parseInt(ETOperand2.getText().toString()));
                break;
        }
    }

    @Override
    public void updateSolution(int solution) {
        TVSolution.setText(String.valueOf(solution));
    }
}
