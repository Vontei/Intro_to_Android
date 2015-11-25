package contentorganizer.vontei.org.usersdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button homeLogin, homeSignUp;
    EditText editName, editAge, editUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = (EditText) findViewById(R.id.editName);
        editAge = (EditText) findViewById(R.id.editAge);
        editUserName = (EditText) findViewById(R.id.editUsername);

        homeSignUp = (Button) findViewById(R.id.homeSignUp);
        homeLogin = (Button) findViewById(R.id.homeLogin);

        homeLogin.setOnClickListener(this);
        homeSignUp.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.homeLogin:
                startActivity(new Intent(this, Login.class));

                break;

            case R.id.homeSignUp:
                startActivity(new Intent(this, Register.class));

                break;
        }



    }


}
