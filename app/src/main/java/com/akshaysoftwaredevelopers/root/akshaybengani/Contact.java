package com.akshaysoftwaredevelopers.root.akshaybengani;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Contact extends Fragment {


    public Contact() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_contact, container, false);


        ImageView call=(ImageView)v.findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:--HiddenForGithub--"));
                startActivity(callIntent);
            }
        });

        ImageView gmail=(ImageView)v.findViewById(R.id.mail);
        gmail.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent email = new Intent(android.content.Intent.ACTION_SENDTO);
                email.setType("message/rfc822");
                email.putExtra(Intent.EXTRA_EMAIL, new String[] { "--HiddenForGithub--" });
                email.putExtra(Intent.EXTRA_SUBJECT, "Contact");
                email.putExtra(Intent.EXTRA_TEXT,"");
                startActivity(Intent.createChooser(email,"Choose an Email client :"));
            }
        });


        ImageView facebook=(ImageView)v.findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/people/Akshay-Bengani/100005699104818"));
                startActivity(browserIntent);
            }
        });

        ImageView gplus=(ImageView)v.findViewById(R.id.gplus);
        gplus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://plus.google.com/u/0/101247972520813311354"));
                startActivity(browserIntent);
            }
        });

        ImageView instagram=(ImageView)v.findViewById(R.id.instagram);
        instagram.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/akshaybengani/"));
                startActivity(browserIntent);
            }
        });

        ImageView whatsapp=(ImageView)v.findViewById(R.id.whatsapp);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:--HiddenForGithub--"));
                startActivity(callIntent);
            }
        });


        ImageView twitter=(ImageView)v.findViewById(R.id.twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://twitter.com/benganiakshay"));
                startActivity(browserIntent);
            }
        });

        ImageView youtube=(ImageView)v.findViewById(R.id.youtube);
        youtube.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/channel/UCTZkAFc2e6SG0girtzoSk_Q"));
                startActivity(browserIntent);
            }
        });

        ImageView github=(ImageView)v.findViewById(R.id.github);
        github.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/akshaybengani"));
                startActivity(browserIntent);
            }
        });

        ImageView behance=(ImageView)v.findViewById(R.id.behance);
        behance.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.behance.net/akshaybenge0e9"));
                startActivity(browserIntent);
            }
        });

        ImageView freecodecamp=(ImageView)v.findViewById(R.id.freecode);
        freecodecamp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.freecodecamp.org/akshaybengani"));
                startActivity(browserIntent);
            }
        });

        ImageView linkedin=(ImageView)v.findViewById(R.id.linkedin);
        linkedin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.linkedin.com/in/akshay-b-6bb75ba4"));
                startActivity(browserIntent);
            }
        });


        return v;


    }

}
