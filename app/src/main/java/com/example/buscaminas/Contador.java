package com.example.buscaminas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;




import android.os.Environment;
import android.view.View;

public class Contador {

	private int movimientos;
	private int minas;
	private int victorias;

	public int getMovimientos() {

		return movimientos;
	}

	public void setMovimientos(int movimientos) {
		this.movimientos = movimientos;
	}

	public void augmentMovimientos() {
		movimientos++;

	}
	public void borrarTMovimientos(){
		movimientos= movimientos-movimientos;
	}

	public int getMinas() {

		return minas;
	}

	public void setMinas(int minas) {
		this.minas = minas;
	}

	public void disminuirMinas() {
		minas--;

	}

	public void aumentMinas() {
		minas++;

	}
	public void borrarTMinas(){
		minas=minas-minas;
	}

	

	
}
