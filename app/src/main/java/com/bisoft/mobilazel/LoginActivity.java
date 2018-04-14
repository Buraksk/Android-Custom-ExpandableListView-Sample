package com.bisoft.mobilazel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/**
 * Created by burakisik on 7/14/2017.
 */

public class LoginActivity extends Activity implements View.OnClickListener {
    Service service=new Service();
    Button btnLogin;
    EditText txtUserName,txtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin=(Button)findViewById(R.id.btnLogin);
        txtUserName=(EditText)findViewById(R.id.etUserName);
        txtPass=(EditText)findViewById(R.id.etPassword);
        btnLogin.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if(service.Login(txtUserName.getText().toString(),txtPass.getText().toString())==1) {
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }
}
