package com.example.lost_and_found_app_android;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Button;

public class PostLostItemFormActivity extends AppCompatActivity {
    RadioButton lostRadioBtn;
    RadioButton foundRadioBtn;
    EditText userName;
    EditText userPhoneNumber;
    EditText itemDescription;
    EditText dateOfPost;
    EditText locationOfLostFoundItem;
    Button savePostButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_lost_item_form);
        lostRadioBtn = findViewById(R.id.idLostRadioBtn);
        foundRadioBtn = findViewById(R.id.idFoundRadioBtn);
        userName = findViewById(R.id.idNameInput);
        userPhoneNumber = findViewById(R.id.editTextPhone);
        itemDescription = findViewById(R.id.idItemDescription);
        dateOfPost = findViewById(R.id.idEditTextDate);
        locationOfLostFoundItem = findViewById(R.id.idLocationLostFoundItem);
        savePostButton = findViewById(R.id.idSavePostBtn);
    }
    protected void saveButtonHandler(EditText userInput) {
        savePostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get user input here
                // Concat to one record here
                // MySQLite CRUD here
            }
        });
    }



}