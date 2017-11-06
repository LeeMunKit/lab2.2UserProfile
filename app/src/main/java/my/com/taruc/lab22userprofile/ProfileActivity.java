package my.com.taruc.lab22userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {
    EditText id;
    EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        id = (EditText)findViewById(R.id.idtxt);
        email = (EditText)findViewById(R.id.emailtxt);
    }

    public void updateProfile(View view){
        String idstring = id.getText().toString();
        String emailstring = email.getText().toString();

        Intent intent = getIntent();
        intent.putExtra(MainActivity.USER_ID, idstring);
        intent.putExtra(MainActivity.USER_EMAIL, emailstring);

        setResult(MainActivity.REQUEST_PROFILE_UPDATE,intent);
        finish();
    }
}
