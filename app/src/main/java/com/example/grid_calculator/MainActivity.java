package com.example.grid_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.temporal.ValueRange;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, buttonPoint, buttonReset, buttonEqual, buttonC, buttonMod,buttonRoot,
            buttonLog,buttonLn,buttonSquare,buttonSin,buttonCos,buttonTan,buttonFact,buttonPI;

    EditText eT1, eT2;

    Double ValueOne, ValueTwo, result;

    int count,fact=1;
    boolean Addition, Subtract, Multiplication, Division, Modulus,Root,Log,Ln,Square,
            Sin,Cos,Tan,Fact,PI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencing
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPoint = (Button) findViewById(R.id.buttonPoint);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonReset = (Button) findViewById(R.id.buttonReset);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonMod = (Button) findViewById(R.id.buttonMod);
        buttonRoot = (Button) findViewById(R.id.buttonRoot);
        buttonSquare = (Button) findViewById(R.id.buttonSquare);
        buttonLog = (Button) findViewById(R.id.buttonLog);
        buttonLn = (Button) findViewById(R.id.buttonLn);
        buttonSin = (Button) findViewById(R.id.buttonSin);
        buttonCos = (Button) findViewById(R.id.buttonCos);
        buttonTan = (Button) findViewById(R.id.buttonTan);
        buttonPI = (Button) findViewById(R.id.buttonPI);
        buttonFact = (Button) findViewById(R.id.buttonFact);

        eT1 = (EditText) findViewById(R.id.eT1);
        eT2 = (EditText) findViewById(R.id.eT2);

        //Event Listeners
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //to set the editText with the button value 1
                eT1.setText(eT1.getText() + "1");

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT1.setText(eT1.getText() + "2");

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT1.setText(eT1.getText() + "3");

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT1.setText(eT1.getText() + "4");

            }

        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT1.setText(eT1.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT1.setText(eT1.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT1.setText(eT1.getText() + "7");

            }

        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT1.setText(eT1.getText() + "8");

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT1.setText(eT1.getText() + "9");

            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT1.setText(eT1.getText() + "0");
            }

        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT1.setText("");
            }

        });
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT1.setText("");
                eT2.setText("");
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT1.setText(eT1.getText() + ".");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String check = eT1.getText().toString();
                if (TextUtils.isEmpty(check)) {
                    eT1.setText("");
                    eT2.setText("");
                } else {
                    //convert string to float and set UI Null to get next input
                    ValueOne = Double.parseDouble(eT1.getText().toString());
                    Addition = true;
                    eT2.setText(+ValueOne + "+");
                    eT1.setText("");
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = eT1.getText().toString();
                if (TextUtils.isEmpty(check)) {
                    eT1.setText("");
                    eT2.setText("");
                } else {
                    ValueOne = Double.parseDouble(eT1.getText().toString());
                    Subtract = true;
                    eT2.setText(+ValueOne + "-");
                    eT1.setText("");
                }
            }

        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = eT1.getText().toString();
                if (TextUtils.isEmpty(check)) {
                    eT1.setText("");
                    eT2.setText("");
                } else {
                    ValueOne = Double.parseDouble(eT1.getText().toString());
                    Multiplication = true;
                    eT2.setText(+ValueOne + "X");
                    eT1.setText("");
                }
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = eT1.getText().toString();
                if (TextUtils.isEmpty(check)) {
                    eT1.setText("");
                    eT2.setText("");
                } else {
                    ValueOne = Double.parseDouble(eT1.getText().toString());
                    Division = true;
                    eT2.setText(+ValueOne + "/");
                    eT1.setText("");
                }
            }
        });
        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = eT1.getText().toString();
                if (TextUtils.isEmpty(check)) {
                    eT1.setText("");
                    eT2.setText("");
                } else {
                    ValueOne = Double.parseDouble(eT1.getText().toString());
                    Modulus = true;
                    eT2.setText(+ValueOne + "%");
                    eT1.setText("");
                }
            }
        });
        buttonRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = eT1.getText().toString();
                if (TextUtils.isEmpty(check)) {
                    eT1.setText("");
                    eT2.setText("");
                } else {
                    ValueOne = Double.parseDouble(eT1.getText().toString());
                    Root = true;
                    eT2.setText("√" + ValueOne);
                    eT1.setText("");
                }
            }
        });
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = eT1.getText().toString();
                if (TextUtils.isEmpty(check)) {
                    eT1.setText("");
                    eT2.setText("");
                } else {
                    ValueOne = Double.parseDouble(eT1.getText().toString());
                    Log = true;
                    eT2.setText(+ValueOne + "log");
                    eT1.setText("");
                }
            }
        });
        buttonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = eT1.getText().toString();
                if (TextUtils.isEmpty(check)) {
                    eT1.setText("");
                    eT2.setText("");
                } else {
                    ValueOne = Double.parseDouble(eT1.getText().toString());
                    Square = true;
                    eT2.setText(+ValueOne + "^");
                    eT1.setText("");
                }
            }
        });
        buttonLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = eT1.getText().toString();
                if (TextUtils.isEmpty(check)) {
                    eT1.setText("");
                    eT2.setText("");
                } else {
                    ValueOne = Double.parseDouble(eT1.getText().toString());
                    Ln = true;
                    eT2.setText("ln" + ValueOne);
                    eT1.setText("");
                }
            }
        });
        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = eT1.getText().toString();
                if (TextUtils.isEmpty(check)) {
                    eT1.setText("");
                    eT2.setText("");
                } else {
                    ValueOne = Double.parseDouble(eT1.getText().toString());
                    Sin = true;
                    eT2.setText("sin" + ValueOne);
                    eT1.setText("");
                }
            }
        });
        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = eT1.getText().toString();
                if (TextUtils.isEmpty(check)) {
                    eT1.setText("");
                    eT2.setText("");
                } else {
                    ValueOne = Double.parseDouble(eT1.getText().toString());
                    Cos = true;
                    eT2.setText("cos" + ValueOne);
                    eT1.setText("");
                }
            }
        });
        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = eT1.getText().toString();
                if (TextUtils.isEmpty(check)) {
                    eT1.setText("");
                    eT2.setText("");
                } else {
                    ValueOne = Double.parseDouble(eT1.getText().toString());
                    Tan = true;
                    eT2.setText("tan" + ValueOne);
                    eT1.setText("");
                }
            }
        });
        buttonPI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = eT1.getText().toString();
                if (TextUtils.isEmpty(check)) {
                    result = Math.PI;
                    eT1.setText(""+result);
                    eT2.setText("π");
                    PI = false;
                } else {
                    ValueOne = Double.parseDouble(eT1.getText().toString());
                    PI = true;
                    eT2.setText(ValueOne+"π");
                    eT1.setText("");
                }
            }
        });

        buttonFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = eT1.getText().toString();
                if (TextUtils.isEmpty(check)) {
                    eT1.setText("");
                    eT2.setText("");
                } else {
                    count = Integer.parseInt(eT1.getText().toString());
                    Fact = true;
                    eT2.setText(count+"!");
                    eT1.setText("");
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = eT1.getText().toString();
                if (TextUtils.isEmpty(check)) {
                    eT1.setText("");
                    eT2.setText("");
                }
                if (Addition == true) {
                    ValueTwo = Double.parseDouble(eT1.getText().toString());
                    result = ValueOne + ValueTwo;
                    eT2.setText(+ValueOne + "+"+ValueTwo);
                    eT1.setText(String.valueOf(result));
                    Addition = false;

                }
                if (Subtract == true) {
                    ValueTwo = Double.parseDouble(eT1.getText().toString());
                    result = ValueOne - ValueTwo;
                    eT2.setText(+ValueOne + "-"+ValueTwo);
                    eT1.setText(String.valueOf(result));
                    Subtract = false;

                }
                if (Multiplication == true) {
                    ValueTwo = Double.parseDouble(eT1.getText().toString());
                    eT2.setText(+ValueOne + "X"+ValueTwo);
                    result = ValueOne * ValueTwo;
                    eT1.setText(String.valueOf(result));
                    Multiplication = false;

                }
                if (Modulus == true) {
                    ValueTwo = Double.parseDouble(eT1.getText().toString());
                    result = ValueOne % ValueTwo;
                    eT2.setText(+ValueOne + "%"+ValueTwo);
                    eT1.setText(String.valueOf(result));
                    Modulus = false;
                }

                if (Division == true) {
                    ValueTwo = Double.parseDouble(eT1.getText().toString());
//
//                    try {
//                        result = ValueOne / ValueTwo;
//                        eT.setText(String.valueOf(result));
//                        Division = false;
//                    }
//                    catch (ArithmeticException e){
//                        eT.setText("Can't Divided by Zero");
//                        Division = false;
//                    }
                    result = ValueOne / ValueTwo;
                    if (result.isInfinite()) {
                        eT2.setText(+ValueOne + "/"+ValueTwo);
                        eT1.setText("Can't Divided by Zero");
                        Division = false;
                    } else {
                        eT2.setText(+ValueOne + "/"+ValueTwo);
                        eT1.setText(String.valueOf(result));
                        Division = false;
                    }
                }
                if(Root == true){
                    result = Math.sqrt(ValueOne);
                    eT2.setText("√"+ValueOne);
                    eT1.setText(String.valueOf(result));
                    Root = false;
                }
                if(Log == true){
                    result = Math.log10(ValueOne);
                    eT2.setText("log"+ValueOne);
                    eT1.setText(String.valueOf(result));
                    Log = false;
                }
                if(Square == true){
                    ValueTwo = Double.parseDouble(eT1.getText().toString());
                    result = Math.pow(ValueOne,ValueTwo);
                    eT2.setText(+ValueOne+"^"+ValueTwo);
                    eT1.setText(String.valueOf(result));
                    Square = false;
                }
                if(Ln == true){
                    result = 2.303 * Math.log10(ValueOne);
                    eT2.setText("ln"+ValueOne);
                    eT1.setText(String.valueOf(result));
                    Ln = false;
                }
                if(Sin == true){
//                    double radians = Math.toRadians(ValueOne);
                    result = Math.sin(ValueOne);
                    eT2.setText("sin"+ValueOne);
                    eT1.setText(String.valueOf(result));
                    Sin = false;
                }
                if(Cos == true){
//                    double radians = Math.toRadians(ValueOne);
                    result = Math.cos(ValueOne);
                    eT2.setText("cos"+ValueOne);
                    eT1.setText(String.valueOf(result));
                    Cos = false;
                }
                if(Tan == true){
//                    double radians = Math.toRadians(ValueOne);
                    result = Math.tan(ValueOne);
                    eT2.setText("tan"+ValueOne);
                    eT1.setText(String.valueOf(result));
                    Tan = false;
                }
                if(Fact == true){
                    for (int i=1 ; i<=count; i++){
                        fact = fact*i;
                    }
                    eT2.setText(count+"!");
                    eT1.setText(String.valueOf(fact));
                    Fact = false;
                }
                if(PI == true){
                    result = ValueOne * Math.PI;
                    eT2.setText("π"+ValueOne);
                    eT1.setText(String.valueOf(result));
                    PI = false;
                }
            }
        });
    }

}