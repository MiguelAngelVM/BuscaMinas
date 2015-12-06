package com.example.buscaminas;

import java.util.Random;
import com.example.buscaminas.*;

public class Aleatorio implements ProcesoEstocastico {

	private static int lado; 
	private Random rnd;
	

	public void setN( int num)
	{
		lado=num;
	}
	
	public float obtenerAleatorio()
	{
		int ladoObtenido;
		
	    rnd = new Random();
			
		return ladoObtenido=(int)(rnd.nextDouble()*(lado));
			
		
	
			}
	
			
}
		
		
