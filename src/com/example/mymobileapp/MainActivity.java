package com.example.mymobileapp;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lv = (ListView) findViewById(R.id.listview);
		String[] name = {"TT","HH","KB","MM"};
		ArrayList<String> data = new ArrayList<String>();
		for(int j =0;j < name.length; j++)
		{
			data.add(name[j]);
		}

		ArrayAdapter<String> adapter = null;
		adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
		Log.d("test",adapter.toString());
		lv.setAdapter(adapter);
		Log.d("test","breakpoint 1");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
