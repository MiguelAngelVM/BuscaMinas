package com.example.buscaminas;


	


	import android.app.AlertDialog;
	import android.view.View;
	import android.view.View.OnClickListener;
	public class EscuchadorDialogo {
	
		private View contexto;
		public EscuchadorDialogo(View contexto) {
			super();
			this.contexto = contexto;
		}
		public void alerta() {
			// TODO Auto-generated method stub
			
			AlertDialog.Builder adb;
			adb = new AlertDialog.Builder(contexto.getContext());
			adb.setTitle("practica 1");
			adb.setMessage("¿que pildora quieres tomar?");
			adb.setCancelable(true);
			AlertDialog ad = adb.create();
			ad.show();
		}

	}


