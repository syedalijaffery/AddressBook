package com.example.zainmudassar.addressbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button addBtn;
    EditText name,address,email,phone;
    ListView contactsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addBtn = findViewById(R.id.addBtn);
        name = findViewById(R.id.name);
        address = findViewById(R.id.adress);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        contactsList = findViewById(R.id.contactsList);

        DatabaseHandler db = new DatabaseHandler(this);

        /**
         * CRUD Operations
         * */
        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contact("Ahmad", "03219200000","ahmad@gmail.com","H-6,Street # 2, NY, USA"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");



        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHandler dtb = new DatabaseHandler(view.getContext());
                Log.d("Insert: ", "Inserting ..");
                dtb.addContact(new Contact(name.getText().toString(), phone.getText().toString(),email.getText().toString(),address.getText().toString()));
                String log = " Name: " + name.getText().toString() + " ,Phone: " + phone.getText().toString();
                Log.d("Insert: ", log);



                ArrayList<Contact> contacts = (ArrayList<Contact>) dtb.getAllContacts();
                ArrayList<String> contactNames = new ArrayList<String>();
                for (int i=0;i<contacts.size();i++) {
                    contactNames.add(contacts.get(i)._name + " "+contacts.get(i)._phone_number  );
                }
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(view.getContext(),
                        android.R.layout.simple_list_item_1, android.R.id.text1, contactNames);
                contactsList.setAdapter(adapter);
            }
        });



    }

    }

