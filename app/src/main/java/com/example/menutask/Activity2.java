package com.example.menutask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //register the view for context menu
        TextView tv = (TextView) findViewById(R.id.TextView);
        registerForContextMenu(tv);
    }
        //create context menu
        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            super.onCreateContextMenu(menu, v, menuInfo);
            MenuInflater inflater=getMenuInflater();
            inflater.inflate(R.menu.context_menu, menu);
        }

        //selection of item option
        @Override
        public boolean onContextItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.copy:
                    Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_LONG).show();
                    return true;
                case R.id.paste:
                    Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_LONG).show();
                    return true;
                case R.id.clear:
                    Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_LONG).show();
            }
            return super.onContextItemSelected(item);
        }

    }
