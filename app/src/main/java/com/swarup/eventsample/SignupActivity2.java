package com.swarup.eventsample;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity2 extends AppCompatActivity {

    private Button signup;
    private EditText email;
    /*private Firebase mRef;*/
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;
    private ProgressDialog mProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);
        Firebase.setAndroidContext(this);

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Users");
        mProgress = new ProgressDialog(this);

        signup = (Button) findViewById(R.id.next1);
        email = (EditText) findViewById(R.id.signup_email1);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRegister();

            }
        });
    }

    private void startRegister() {

        mProgress.setMessage("Signing Up");
        mProgress.show();
        String Email = email.getText().toString().trim();

        String User_Id = mAuth.getCurrentUser().getUid();
        DatabaseReference user =mDatabase.child(User_Id);
        user.child("Email").setValue(Email);

        mProgress.dismiss();
    }
}
