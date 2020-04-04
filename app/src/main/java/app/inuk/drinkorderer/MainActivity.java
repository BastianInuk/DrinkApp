package app.inuk.drinkorderer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonMore = findViewById(R.id.buttonMore);

        buttonMore.setOnClickListener(this);

    }

    public void onClick(View view) {
        if (view == buttonMore) {
            Intent moreOptions = new Intent(this, MoreOptions.class);
            startActivity(moreOptions);
            System.out.println("Knap 1");
        }
    }
}
