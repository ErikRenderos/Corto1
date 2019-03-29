package com.example.corto1;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.corto1.utilites.AppConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class SecondActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnShare;
    private TextView tvUser, tvEmail, tvTotal;
    String cont1, cont2, cont3, cont4, cont5, cont6, cont7, cont8, cont9, txtUser, txtEmail, txtTotal;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvUser = findViewById(R.id.tvUser_2);
        tvEmail = findViewById(R.id.tvEmail_2);
        tvTotal = findViewById(R.id.tvTotal_2);

        btn1 =findViewById(R.id.btn1_2);
        btn2 =findViewById(R.id.btn2_2);
        btn3 =findViewById(R.id.btn3_2);
        btn4 =findViewById(R.id.btn4_2);
        btn5 =findViewById(R.id.btn5_2);
        btn6 =findViewById(R.id.btn6_2);
        btn7 =findViewById(R.id.btn7_2);
        btn8 =findViewById(R.id.btn8_2);
        btn9 =findViewById(R.id.btn9_2);

        btnShare = findViewById(R.id.btnShare_2);

        final JSONObject jsonx=new JSONObject();

        Intent nuevoIntent = getIntent();
        txtUser=txtEmail=txtTotal=cont1=cont2=cont3=cont4=cont5=cont6=cont7=cont8=cont9="";

        if(nuevoIntent != null) {
            txtUser = nuevoIntent.getStringExtra(AppConstants.USER);
            txtEmail = nuevoIntent.getStringExtra(AppConstants.EMAIL);
            txtTotal = nuevoIntent.getStringExtra(AppConstants.TOTAL);
            cont1 = nuevoIntent.getStringExtra(AppConstants.BTN1);
            cont2 = nuevoIntent.getStringExtra(AppConstants.BTN2);
            cont3 = nuevoIntent.getStringExtra(AppConstants.BTN3);
            cont4 = nuevoIntent.getStringExtra(AppConstants.BTN4);
            cont5 = nuevoIntent.getStringExtra(AppConstants.BTN5);
            cont6 = nuevoIntent.getStringExtra(AppConstants.BTN6);
            cont7 = nuevoIntent.getStringExtra(AppConstants.BTN7);
            cont8 = nuevoIntent.getStringExtra(AppConstants.BTN8);
            cont9 = nuevoIntent.getStringExtra(AppConstants.BTN9);
        }

        tvUser.setText("Usuario: "+ txtUser);
        tvEmail.setText("Correo: "+ txtEmail);
        tvTotal.setText("Total: "+ txtTotal);

        btn1.setText(""+ cont1);
        btn2.setText(""+ cont2);
        btn3.setText(""+ cont3);
        btn4.setText(""+ cont4);
        btn5.setText(""+ cont5);
        btn6.setText(""+ cont6);
        btn7.setText(""+ cont7);
        btn8.setText(""+ cont8);
        btn9.setText("" + cont9);


    }
}

