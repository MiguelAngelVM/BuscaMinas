package com.example.buscaminas;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.os.Build;

public class Inicio extends Activity {
	Cuatro cuatro;
	Aleatorio aleatorio = new Aleatorio();
	private ListView mainListView;
	private ArrayAdapter<String> listAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_inicio);

		mainListView = (ListView) findViewById(R.id.listView1);
		String[] Operaciones = new String[] { "4X4", "5X5", "6X6","Miguel" };

		ArrayList<String> Operaciones1 = new ArrayList<String>();
		Operaciones1.addAll(Arrays.asList(Operaciones));

		listAdapter = new ArrayAdapter<String>(this, R.layout.vista,
				Operaciones1);
		mainListView.setAdapter(listAdapter);

		mainListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				if (position == 0) {
					Intent i = new Intent(getApplicationContext(), Cuatro.class);
					startActivity(i);

				}if (position == 1) {
					Intent i = new Intent(getApplicationContext(), Cinco.class);
					startActivity(i);

				}if (position == 2) {
					Intent i = new Intent(getApplicationContext(), Seis.class);
					startActivity(i);

				}

			}
		});

	}
	

	
		
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inicio, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_inicio,
					container, false);
			return rootView;
		}
	}
}
