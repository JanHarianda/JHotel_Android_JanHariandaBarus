package com.example.janbarus.jhotel_android_janhariandabarus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.support.v7.app.AlertDialog;
import android.view.*;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText FullNameInput = (EditText) findViewById(R.id.FullNameInput);
        final EditText emailInput = (EditText) findViewById(R.id.inputEmail);
        final EditText passInput = (EditText) findViewById(R.id.inputPass);
        final Button buttonRegis = (Button) findViewById(R.id.buttonRegis);
        buttonRegis.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View V) {
                String name = FullNameInput.getText().toString();
                String email = emailInput.getText().toString();
                String pass = passInput.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String> ()
                {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonResponse = new JSONObject(response);
                            if(jsonResponse!=null) {
                                AlertDialog.Builder builder=new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Registration Success")
                                        .create()
                                        .show();
                            }
                        }
                        catch (JSONException e)
                        {
                            AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                            builder.setMessage("Registration Failed.")
                                    .create()
                                    .show();
                        }
                    }
                };
                RegisterRequest registerRequest = new RegisterRequest(name,email,pass,responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this); queue.add(registerRequest);


            }
        });
    }

}