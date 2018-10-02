package com.example.vihu.taste;

import android.app.AlertDialog;
import android.app.VoiceInteractor;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static android.app.PendingIntent.getActivity;

public class Home_page extends AppCompatActivity {


    Toolbar toolbar;


    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener = new FirebaseAuth.AuthStateListener() {




        @Override
        public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
            if (firebaseAuth.getCurrentUser()==null)
            {
                startActivity(new Intent(Home_page.this,MainActivity.class));
            }
        }
    };
    private Button logout;

    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //end-toolbar

        logout = findViewById(R.id.sign_out_button);
        mAuth = FirebaseAuth.getInstance();


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mAuth.signOut();
            }
        });

    }

    public void rice(View view) {
        Intent intent=new Intent(Home_page.this,itemrice.class);
        startActivity(intent);

    }

    public void sweets(View view) {
        Intent intent=new Intent(Home_page.this,itemsweet.class);
        startActivity(intent);

    }

    public void paratha(View view) {
        Intent intent=new Intent(Home_page.this,itemparatha.class);
        startActivity(intent);

    }

    public void dal(View view) {
        Intent intent=new Intent(Home_page.this,itemdal.class);
        startActivity(intent);

    }

    public void snacks(View view) {
        Intent intent=new Intent(Home_page.this,itemsnacks.class);
        startActivity(intent);

    }

    public void soup(View view) {
        Intent intent=new Intent(Home_page.this,itemsoup.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
                finishAffinity();

    }
}
