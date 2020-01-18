package com.twigsoftwares.menuexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerForContextMenu((TextView)findViewById(R.id.t1));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_file, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle item selection
        switch (item.getItemId()) {
            case R.id.i1:
                //perform any action;
                Toast.makeText(MainActivity.this,"Main Menu Tapped",Toast.LENGTH_LONG).show();
                return true;
            case R.id.i2:
                //perform any action;
                Toast.makeText(MainActivity.this,"a Menu Tapped",Toast.LENGTH_LONG).show();
                return true;
            case R.id.i3:
                //perform any action;
                Toast.makeText(MainActivity.this,"b Menu Tapped",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu_file,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.i1:
                Toast.makeText(this,"Clicked Main menu",Toast.LENGTH_SHORT).show();
                break;
            case R.id.i2:
                Toast.makeText(this,"I am sub-menu 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.i3:
                Toast.makeText(this,"I am sub-menu 2",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;

    }

    public void pop(View v){
        PopupMenu popup = new PopupMenu(this,v);
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu_file,popup.getMenu());
        popup.show();

    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.i1:
                Toast.makeText(this,"Clicked Main menu",Toast.LENGTH_SHORT).show();
                break;
            case R.id.i2:
                Toast.makeText(this,"I am sub-menu 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.i3:
                Toast.makeText(this,"I am sub-menu 2",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
