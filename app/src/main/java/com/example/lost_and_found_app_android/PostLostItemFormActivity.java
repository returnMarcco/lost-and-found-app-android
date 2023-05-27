package com.example.lost_and_found_app_android;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;
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
    String lostOrFoundPost;

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
        lostItemRadioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lostOrFoundPost = "Lost";
                System.out.println(lostOrFoundPost);
            }
        });

        foundItemRadioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lostOrFoundPost = "Found";
            }
        });

        savePostButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                try {
                    if (lostOrFoundPost != null) {
                        LostAndFoundModel lostAndFoundPost = new LostAndFoundModel(-1, userName.getText().toString(), Integer.parseInt(userPhoneNumber.getText().toString()), itemDescription.getText().toString(), dateOfPost.getText().toString(), locationOfLostFoundItem.getText().toString(), false, lostOrFoundPost);
                        Toast.makeText(PostLostItemFormActivity.this, lostOrFoundPost + " item has been posted!", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(PostLostItemFormActivity.this, "You must select a category for this post", Toast.LENGTH_SHORT).show();
                    }
                } catch(Exception e) {
                    Toast.makeText(PostLostItemFormActivity.this, "You must fill out all required fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
    };
}
