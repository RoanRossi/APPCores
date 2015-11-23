package com.example.appcores;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TelasDasCores extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_telas_das_cores);
		
		LinearLayout vermelho = (LinearLayout) findViewById(R.id.txtvermelho);
		LinearLayout rosa = (LinearLayout) findViewById(R.id.txtrosa);
		LinearLayout roxo = (LinearLayout) findViewById(R.id.txtroxo);
		LinearLayout roxoescuro = (LinearLayout) findViewById(R.id.txtroxoescuro);
		LinearLayout anil = (LinearLayout) findViewById(R.id.txtanil);
		LinearLayout azul = (LinearLayout) findViewById(R.id.txtazul);
		LinearLayout azulclaro = (LinearLayout) findViewById(R.id.txtazulclaro);
		LinearLayout azulciano = (LinearLayout) findViewById(R.id.txtazulciano);
		LinearLayout verdeazulado = (LinearLayout) findViewById(R.id.txtverdeazulado);
		LinearLayout verde = (LinearLayout) findViewById(R.id.txtverde);
		LinearLayout verdeclaro = (LinearLayout) findViewById(R.id.txtverdeclaro);
		LinearLayout verdelima = (LinearLayout) findViewById(R.id.txtverdelima);
		LinearLayout amarelo = (LinearLayout) findViewById(R.id.txtamarelo);
		LinearLayout laranjaclaro = (LinearLayout) findViewById(R.id.txtlaranjaclaro);
		LinearLayout laranja = (LinearLayout) findViewById(R.id.txtlaranja);
		LinearLayout laranjaescuro = (LinearLayout) findViewById(R.id.txtlaranjaescuro);
		LinearLayout marrom = (LinearLayout) findViewById(R.id.txtmarrom);
		LinearLayout cinza = (LinearLayout) findViewById(R.id.txtcinza);
		LinearLayout cinzaazulado = (LinearLayout) findViewById(R.id.txtcinzaazulado);
		LinearLayout preto = (LinearLayout) findViewById(R.id.txtpreto);
		LinearLayout branco = (LinearLayout) findViewById(R.id.txtbranco);

		vermelho.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intencao = new Intent (TelasDasCores.this, Vermelho.class);
				startActivity(intencao);
				
			}
		});
		
		rosa.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intencao = new Intent (TelasDasCores.this, Rosa.class);
				startActivity(intencao);
			}
		});
		
		roxo.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, Roxo.class);
				startActivity(intencao);
				
			}
		});
		
		roxoescuro.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, RoxoEscuro.class);
				startActivity(intencao);
				
			}
		});
		
		anil.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, Anil.class);
				startActivity(intencao);				
			}
		});
		
		azul.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, Azul.class);
				startActivity(intencao);
				
			}
		});
	
		azulclaro.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, AzulClaro.class);
				startActivity(intencao);
				
			}
		});
		
		azulciano.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, AzulCiano.class);
				startActivity(intencao);
				
			}
		});
	
		verdeazulado.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, VerdeAzulado.class);
				startActivity(intencao);
				
			}
		});
	
		verde.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, Verde.class);
				startActivity(intencao);
				
			}
		});
	
		verdeclaro.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, VerdeClaro.class);
				startActivity(intencao);
				
			}
		});
	
		verdelima.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, VerdeLima.class);
				startActivity(intencao);
				
			}
		});
	
		amarelo.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, Amarelo.class);
				startActivity(intencao);
				
			}
		});
	
		laranjaclaro.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, LaranjaClaro.class);
				startActivity(intencao);				
			}
		});
	
		laranja.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, Laranja.class);
				startActivity(intencao);				
			}
		});
	
		laranjaescuro.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, LaranjaEscuro.class);
				startActivity(intencao);
				
			}
		});
	
		marrom.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, Marrom.class);
				startActivity(intencao);				
			}
		});
	
		cinza.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, Cinza.class);
				startActivity(intencao);				
			}
		});
	
		cinzaazulado.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (TelasDasCores.this, CinzaAzulado.class);
				startActivity(intencao);				
			}
		});
		preto.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String texto = "#000000";
				Context context = getApplicationContext();
				int duracao = Toast.LENGTH_LONG;
				Toast toast = Toast.makeText(context, texto, duracao);
				toast.show();
				
			}
		});
		branco.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String texto = "#FFFFFF";
				Context context = getApplicationContext();
				int duracao = Toast.LENGTH_LONG;
				Toast toast = Toast.makeText(context, texto, duracao);
				toast.show();
				
			}
		});
	}
	
}
