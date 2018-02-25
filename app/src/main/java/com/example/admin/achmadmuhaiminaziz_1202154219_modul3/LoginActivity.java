package com.example.admin.achmadmuhaiminaziz_1202154219_modul3;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //membuat variabel untuk komponen yang ada
    private EditText username, password;
    Button btnLogin, btnCancel;
    private static String usname, passwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //membuat nama variabel sesuai komponen yang ada
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);

    }
    public void login(View view) {
        //memberi data statik berupa username dan password
        usname = "EAD";
        passwd = "MOBILE";
        //get text dari edittext username dan password menjadi String
        final String uname = username.getText().toString();
        String pass = password.getText().toString();

        //kondisi ketika username & password sama
        if(uname.equals(usname) && pass.equals(passwd)){
            //memunculkan toast jika login berhasil
            Toast.makeText(getApplicationContext(), "Login Sukses..!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            LoginActivity.this.startActivity(intent);

            //kondisi jika username dan password kosong
        }else if (uname.isEmpty() && pass.isEmpty()){
            Toast.makeText(getApplicationContext(), "Silahkan Isi Username dan Password !", Toast.LENGTH_SHORT).show();
            //kondisi jika username dan password salah
        }else if (!uname.equals(usname) && !pass.equals(passwd)){
            Toast.makeText(getApplicationContext(), "Username atau Password Salah !", Toast.LENGTH_SHORT).show();
        }
    }

}
