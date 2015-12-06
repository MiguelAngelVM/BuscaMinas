package Juego;


import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.buscaminas.*;


public class Acciones implements Runnable {


	private Contador contador;
	private Cuatro cuatro;

	public Acciones(Contador contador, Cuatro cuatro) {
		this.contador = contador;
		this.cuatro = cuatro;
	}

	@Override
	public void run() {
				cuatro.runOnUiThread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
					
						
						
						
					}
				});
				
			}

	

		

	
}
