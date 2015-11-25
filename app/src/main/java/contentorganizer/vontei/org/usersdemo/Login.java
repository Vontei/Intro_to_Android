package contentorganizer.vontei.org.usersdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button bLogin;
    EditText editUserName, editPassword;
    TextView loginRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUserName = (EditText) findViewById(R.id.editUsername);
        editPassword = (EditText) findViewById(R.id.editPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        loginRegister = (TextView) findViewById(R.id.loginRegister);

        bLogin.setOnClickListener(this);
        loginRegister.setOnClickListener(this);
    }

    //Use an override method to allow multiple clicks/actions on this view. must implement View.OnClickListener;
    // The first allows login from view, second a logout when needed;
    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.bLogin:

                break;

            case R.id.loginRegister:
                startActivity(new Intent(this, Register.class));

                break;
        }



    }
}
