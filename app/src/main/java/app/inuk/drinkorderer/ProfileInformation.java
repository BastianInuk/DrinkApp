package app.inuk.drinkorderer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileInformation extends AppCompatActivity implements View.OnClickListener{
    TextView textName, textGetName;
    Button buttonEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_information);

        textName = findViewById(R.id.textEmail);
        textGetName = findViewById(R.id.textEmail);
        buttonEdit = findViewById(R.id.buttonEdit);
        buttonEdit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == buttonEdit) {
            Intent changeProfile = new Intent(this, ChangeProfile.class);
            startActivity(changeProfile);
        }

    }
}
