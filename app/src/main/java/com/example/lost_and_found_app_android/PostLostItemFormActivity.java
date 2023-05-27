package com.example.lost_and_found_app_android;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.RadioGroup;

public class PostLostItemFormActivity extends AppCompatActivity {
    RadioGroup lostOrFoundRadioGroup;
    RadioButton lostItemRadioBtn;
    RadioButton foundItemRadioBtn;
    EditText userName;
    EditText userPhoneNumber;
    EditText itemDescription;
    EditText dateOfPost;
    EditText locationOfLostFoundItem;
    Button savePostButton;

    boolean isLostItem = false;
    boolean isFoundItem = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_lost_item_form);
        // Widgets
        lostOrFoundRadioGroup = findViewById(R.id.idRadioGroupLostOrFound);
        userName = findViewById(R.id.idNameInput);
        userPhoneNumber = findViewById(R.id.editTextPhone);
        itemDescription = findViewById(R.id.idItemDescription);
        dateOfPost = findViewById(R.id.idEditTextDate);
        locationOfLostFoundItem = findViewById(R.id.idLocationLostFoundItem);
        savePostButton = findViewById(R.id.idSavePostBtn);
        lostItemRadioBtn = findViewById(R.id.idLostRadioBtn);
        foundItemRadioBtn = findViewById(R.id.idFoundRadioBtn);

        isLostOrFoundItemRadioButtonHandler();
    }

    protected void saveButtonHandler(EditText userInput) {
        savePostButton.setOnClickListener(view -> {
            // MySQLite query here
        });
    }
    protected void isLostOrFoundItemRadioButtonHandler() {
        lostItemRadioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isLostItem = true;
                isFoundItem = false;
            }
        });

        foundItemRadioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isFoundItem = true;
                isLostItem = false;
            }
        });
    }
}