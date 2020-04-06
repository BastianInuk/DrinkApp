package app.inuk.drinkorderer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ChangeProfile extends AppCompatActivity  {
    EditText editTextName, editTextEmail, editTextPhonenumber;
    TextView textName, textEmail, textPhonenumber;

    ProfileInformation profileInformation = new ProfileInformation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_profile);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPhonenumber = findViewById(R.id.editTextPhonenumber);
        textName = findViewById(R.id.textName);
        textEmail = findViewById(R.id.textEmail);
        textPhonenumber = findViewById(R.id.textPhonenumber);

    }
}
