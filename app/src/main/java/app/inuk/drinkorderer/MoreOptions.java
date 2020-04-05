package app.inuk.drinkorderer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoreOptions extends AppCompatActivity implements View.OnClickListener {
Button buttonMyProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_options);

        buttonMyProfile = findViewById(R.id.buttonMyProfile);
        buttonMyProfile.setOnClickListener(this);

}
    @Override
    public void onClick(View v) {
        if (v == buttonMyProfile) {
            Intent profileInformation = new Intent (this, ProfileInformation.class);
            startActivity(profileInformation);
        }

    }
}
