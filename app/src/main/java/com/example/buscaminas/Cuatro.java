package com.example.buscaminas;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import Juego.Acciones;


import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
 
public class Cuatro extends Activity {
	EscuchadorDialogo escuchadorDialogo;
	EscuchadorFalse escuchadorFalse;
	static final int READ_BLOCK_SIZE = 100;
	int valor1;
	int victorias;
	TextView tvVictorias;
	float A1, A2, A3, A4;
	float B1, B2, B3, B4;
	float C1, C2, C3, C4;
	float D1, D2, D3, D4;
	int NumA1=0, NumA2=0, NumA3=0, NumA4=0;
	int NumB1=0, NumB2=0, NumB3=0, NumB4=0;
	int NumC1=0, NumC2=0, NumC3=0, NumC4=0;
	int NumD1=0, NumD2=0, NumD3=0, NumD4=0;
	Aleatorio aleatorio = new Aleatorio();
	Contador contador;
	int contadorMinas;
	Cuatro cuatro;
	boolean MA1, MA2,MA3,MA4,MB1,MB2,MB3,MB4,MC1,MC2,MC3,MC4,MD1,MD2,MD3,MD4;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cuatro);
		
		tvVictorias = (TextView) findViewById(R.id.victorias);
		mostrarVictorias();
		contador = new Contador();
		Acciones acciones = new Acciones(contador, this);
		Thread maxThread = new Thread(acciones);
		maxThread.start();
		llenar();
		asignaMina();
		
		contador.aumentMinas();
		accionMina();
		int contarMinas = contador.getMinas();
		if (contarMinas==0){
			Intent i = new Intent(getApplicationContext(), Cuatro.class);
			startActivity(i);
		}
		
		
	}
	public void llenar(){
		aleatorio.setN(16);
		aleatorio.obtenerAleatorio();
		A1 = aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		A2 = aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		A3 = aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		A4 = aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		B1 = aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		B2 = aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		B3 = aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		B4 = aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		C1 = aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		C2 = aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		C3 = aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		C4 = aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		D1 = aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		D2 = aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		D3 = aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		aleatorio.obtenerAleatorio();
		D4 = aleatorio.obtenerAleatorio();
	}
	public void asignaMina(){
	if(A1==0||A1==3||A1==6||A1==9||A1==12){
		contador.aumentMinas();
		MA1=true;
		NumA2++;
		NumB1++;
		NumB2++;
	}
	if(A2==0||A2==3||A2==6||A2==9||A2==12){
		contador.aumentMinas();
		MA2=true;
		NumA1++;
		NumA3++;
		NumB1++;
		NumB2++;
		NumB3++;
	}
	if(A3==0||A3==3||A3==6||A3==9||A3==12){
		contador.aumentMinas();
		MA3=true;	
		NumA2++;
		NumA4++;
		NumB2++;
		NumB3++;
		NumB4++;
		
	}
	if(A4==0||A4==3||A4==6||A4==9||A4==12){
		contador.aumentMinas();
		MA4=true;	
		NumA3++;
		NumB3++;
		NumB4++;
	}
	if(B1==0||B1==3||B1==6||B1==9||B1==12){
		contador.aumentMinas();
		MB1=true;
		NumA1++;
		NumA2++;
		NumB2++;
		NumC1++;
		NumC2++;
	}
	if(B2==0||B2==3||B2==6||B2==9||B2==12){
		contador.aumentMinas();
		MB2=true;
		NumA1++;
		NumA2++;
		NumA3++;
		NumB1++;
		NumB3++;
		NumC1++;
		NumC2++;
		NumC3++;
	}
	if(B3==0||B3==3||B3==6||B3==9||B3==12){
		contador.aumentMinas();
		MB3=true;
		NumA2++;
		NumA3++;
		NumA4++;
		NumB2++;
		NumB4++;
		NumC2++;
		NumC3++;
		NumC4++;
	}
	if(B4==0||B4==3||B4==6||B4==9||B4==12){
		contador.aumentMinas();
		MB4=true;
		NumA3++;
		NumA4++;
		NumB3++;
		NumC3++;
		NumC4++;
	}
	
	if(C1==0||C1==3||C1==6||C1==9||C1==12){
		contador.aumentMinas();
		MC1=true;
		NumB1++;
		NumB2++;
		NumC2++;
		NumD1++;
		NumD2++;
	}
	if(C2==0||C2==3||C2==6||C2==9||C2==12){
		contador.aumentMinas();
		MC2=true;
		NumB1++;
		NumB2++;
		NumB3++;
		NumC1++;
		NumC3++;
		NumD1++;
		NumD2++;
		NumD3++;
	}
	if(C3==0||C3==3||C3==6||C3==9||C3==12){
		contador.aumentMinas();
		MC3=true;	
		NumB2++;
		NumB3++;
		NumB4++;
		NumC2++;
		NumC4++;
		NumD2++;
		NumD3++;
		NumD4++;
	}
	if(C4==0||C4==3||C4==6||C4==9||C4==12){
		contador.aumentMinas();
		MC4=true;
		NumB3++;
		NumB4++;
		NumC3++;
		NumD3++;
		NumD4++;
	}
	if(D1==0||D1==3||D1==6||D1==9||D1==12){
		contador.aumentMinas();
		MD1=true;
		NumC1++;
		NumC2++;
		NumD2++;
	}
	if(D2==0||D2==3||D2==6||D2==9||D2==12){
		contador.aumentMinas();
		MD2=true;
		NumC1++;
		NumC2++;
		NumC3++;
		NumD1++;
		NumD3++;
	}
	if(D3==0||D3==3||D3==6||D3==9||D3==12){
		contador.aumentMinas();
		MD3=true;
		NumC2++;
		NumC3++;
		NumC4++;
		NumD2++;
		NumD4++;
	}
	if(D4==0||D4==3||D4==6||D4==9||D4==12){
		contador.aumentMinas();	
		MD4=true;
		NumC3++;
		NumC4++;
		NumD3++;
	}
}
	
	
	public void ButtonA1(View view) {
		accion();
		Button a1 =(Button) findViewById(R.id.a1);
		if(MA1==true){
			
			a1.setText("x");
			a1.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			a1.setBackgroundColor(Color.rgb(255, 158, 61));
			a1.setText(String.valueOf(NumA1));
			
		}
		a1.setClickable(false);

	}
	public void ButtonA2(View view) {
		accion();
		Button a2 =(Button) findViewById(R.id.a2);
		if(MA2==true){
			a2.setText("x");
			a2.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			a2.setBackgroundColor(Color.rgb(255, 158, 61));
			a2.setText(String.valueOf(NumA2));
		}
		a2.setClickable(false);
		
	}
	public void ButtonA3(View view) {
		accion();
		Button a3 =(Button) findViewById(R.id.a3);
		if(MA3==true){
			a3.setText("x");
			a3.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			a3.setBackgroundColor(Color.rgb(255, 158, 61));
			a3.setText(String.valueOf(NumA3));
		}
		a3.setClickable(false);
	}
	public void ButtonA4(View view) {
		accion();
		Button a4 =(Button) findViewById(R.id.a4);

		if(MA4==true){
			a4.setText("x");
			a4.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			a4.setBackgroundColor(Color.rgb(255, 158, 61));
			a4.setText(String.valueOf(NumA4));
		}
		a4.setClickable(false);
	}
	public void ButtonB1(View view) {
		accion();
		Button b1 =(Button) findViewById(R.id.b1);

		if(MB1==true){
			b1.setText("x");
			b1.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			b1.setBackgroundColor(Color.rgb(255, 158, 61));
			b1.setText(String.valueOf(NumB1));
		}
		b1.setClickable(false);
	}
	public void ButtonB2(View view) {
		accion();
		Button b2 =(Button) findViewById(R.id.b2);

		if(MB2==true){
			b2.setText("x");
			b2.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			b2.setBackgroundColor(Color.rgb(255, 158, 61));
			b2.setText(String.valueOf(NumB2));
		}
		b2.setClickable(false);
	}
	
	public void ButtonB3(View view) {
		accion();
		Button b3 =(Button) findViewById(R.id.b3);

		if(MB3==true){
			b3.setText("x");
			b3.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			b3.setBackgroundColor(Color.rgb(255, 158, 61));
			b3.setText(String.valueOf(NumB3));
		}
		b3.setClickable(false);
	}
	public void ButtonB4(View view) {
		accion();
		Button b4 =(Button) findViewById(R.id.b4);

		if(MB4==true){
			b4.setText("x");
			b4.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			b4.setBackgroundColor(Color.rgb(255, 158, 61));
			b4.setText(String.valueOf(NumB4));
		}
		b4.setClickable(false);
	}
	public void ButtonC1(View view) {
		accion();
		Button c1 =(Button) findViewById(R.id.c1);

		if(MC1==true){
			c1.setText("x");
			c1.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			c1.setBackgroundColor(Color.rgb(255, 158, 61));
			c1.setText(String.valueOf(NumC1));
		}
		c1.setClickable(false);
	}
	public void ButtonC2(View view) {
		accion();
		Button c2 =(Button) findViewById(R.id.c2);

		if(MC2==true){
			c2.setText("x");
			c2.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			c2.setBackgroundColor(Color.rgb(255, 158, 61));
			c2.setText(String.valueOf(NumC2));
		}
		c2.setClickable(false);
	}public void ButtonC3(View view) {
		accion();
		Button c3 =(Button) findViewById(R.id.c3);

		if(MC3==true){
			c3.setText("x");
			c3.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			c3.setBackgroundColor(Color.rgb(255, 158, 61));
			c3.setText(String.valueOf(NumC3));
		}
		c3.setClickable(false);
	}
	public void ButtonC4(View view) {
		accion();
		Button c4 =(Button) findViewById(R.id.c4);

		if(MC4==true){
			c4.setText("x");
			c4.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			c4.setBackgroundColor(Color.rgb(255, 158, 61));
			c4.setText(String.valueOf(NumC4));
		}
		c4.setClickable(false);
	}
	public void ButtonD1(View view) {
		accion();
		Button d1 =(Button) findViewById(R.id.d1);

		if(MD1==true){
			d1.setText("x");
			d1.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			d1.setBackgroundColor(Color.rgb(255, 158, 61));
			d1.setText(String.valueOf(NumD1));
		}
		d1.setClickable(false);
	}
	
	public void ButtonD2(View view) {
		accion();
		Button d2 =(Button) findViewById(R.id.d2);

		if(MD2==true){
			d2.setText("x");
			d2.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			d2.setBackgroundColor(Color.rgb(255, 158, 61));
			d2.setText(String.valueOf(NumD2));
		}
		d2.setClickable(false);
	}
	
	public void ButtonD3(View view) {
		accion();
		Button d3 =(Button) findViewById(R.id.d3);

		if(MD3==true){
			d3.setText("x");
			d3.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			d3.setBackgroundColor(Color.rgb(255, 158, 61));
			d3.setText(String.valueOf(NumD3));
		}
		d3.setClickable(false);
	}
	public void ButtonD4(View view) {
		accion();
		Button d4 =(Button) findViewById(R.id.d4);

		if(MD4==true){
			d4.setText("x");
			d4.setBackgroundColor(Color.RED);
			accionMina();
		}else{
			d4.setBackgroundColor(Color.rgb(255, 158, 61));
			d4.setText(String.valueOf(NumD4));
		}
		d4.setClickable(false);
	}
	
///////////////////////////////////////////////////////////////////////////7Rub/////////////////////////////////////////////////77
	public void accion() {
		// TODO Auto-generated method stub
		contador.augmentMovimientos();

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				log1("");
			}
		};
		new Thread(runnable).start();

	}

	public void log1(final String string) {
		runOnUiThread(new Runnable() {

			@Override
			public void run() {
				TextView tvMovimiento = (TextView) findViewById(R.id.Movimientos);
				int contarMovimientos = contador.getMovimientos();
				tvMovimiento.setText("Movimientos: "
						+ String.valueOf(contarMovimientos));
			}
		});

	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////7
	public void accionMina() {
		// TODO Auto-generated method stub
		contador.disminuirMinas();

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				log2("");
			}
		};
		new Thread(runnable).start();
		

	}

	public void log2(final String string) {
		runOnUiThread(new Runnable() {

			@Override
			public void run() {
				TextView tvMinas = (TextView) findViewById(R.id.Minas);
				int contarMinas = contador.getMinas();
				tvMinas.setText("Minas: "
						+ String.valueOf(contarMinas));
				if (contarMinas==0){
					valor1=valor1+1;
					Toast.makeText(Cuatro.this, "En hora buena,�Ganaste!",Toast.LENGTH_SHORT).show();
					guardarVictorias();
					mostrarVictorias();
					desactivar();
				}				
			}
		});

	}
	public void borrarTodo(View view){
		valor1=0;
		guardarVictorias();
		mostrarVictorias();
       
	}
	public void nuevoJuego(View view){
		Intent i = new Intent(getApplicationContext(), Cuatro.class);
		startActivity(i);
		
	}
	public void guardarVictorias(){
		String str = String.valueOf(valor1);
        try{
            FileOutputStream fos = openFileOutput("textFile.txt", MODE_PRIVATE);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
             
           
            osw.write(str);
            osw.flush();
            osw.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
	}
	
	public void mostrarVictorias(){
		

		try{
			
            FileInputStream fis = openFileInput("textFile.txt");
            InputStreamReader isr = new InputStreamReader(fis);
             
            char[] inputBuffer = new char[READ_BLOCK_SIZE];
            String s = "";
             
            int charRead;
            while((charRead = isr.read(inputBuffer)) > 0){
                String readString = String.copyValueOf(inputBuffer, 0, charRead);
                s += readString;
                 
                inputBuffer = new char[READ_BLOCK_SIZE];
            }
             
            tvVictorias.setText(s);
            valor1 = (Integer.valueOf(tvVictorias.getText().toString()));
             
            isr.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
		//escuchadorDialogo.alerta();
    }
	public void desactivar() {
		// TODO Auto-generated method stub
		
		Button a1 =(Button) findViewById(R.id.a1);
		a1.setClickable(false);
		Button a2 =(Button) findViewById(R.id.a2);
		a2.setClickable(false);
		Button a3 =(Button) findViewById(R.id.a3);
		a3.setClickable(false);
		Button a4 =(Button) findViewById(R.id.a4);
		a4.setClickable(false);
		Button b1 =(Button) findViewById(R.id.b1);
		b1.setClickable(false);
		Button b2 =(Button) findViewById(R.id.b2);
		b2.setClickable(false);
		Button b3 =(Button) findViewById(R.id.b3);
		b3.setClickable(false);
		Button b4 =(Button) findViewById(R.id.b4);
		b4.setClickable(false);
		Button c1 =(Button) findViewById(R.id.c1);
		c1.setClickable(false);
		Button c2 =(Button) findViewById(R.id.c2);
		c2.setClickable(false);
		Button c3 =(Button) findViewById(R.id.c3);
		c3.setClickable(false);
		Button c4 =(Button) findViewById(R.id.c4);
		c4.setClickable(false);
		Button d1 =(Button) findViewById(R.id.d1);
		d1.setClickable(false);
		Button d2 =(Button) findViewById(R.id.d2);
		d2.setClickable(false);
		Button d3 =(Button) findViewById(R.id.d3);
		d3.setClickable(false);
		Button d4 =(Button) findViewById(R.id.d4);
		d4.setClickable(false);
	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cuatro, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_cuatro,
					container, false);

			return rootView;
		}

	}
}
