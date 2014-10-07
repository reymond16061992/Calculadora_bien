package com.CUTonala.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
	
	double operador1=0, operador2=0,resultado=0;
	int operacion;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button button0=(Button) findViewById(R.id.btn0);
        button0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btn0();
			}

		});
        Button button1=(Button) findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btn1();
			}

		});
        Button button2=(Button) findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btn2();
			}

		});
        Button button3=(Button) findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btn3();
			}

		});
        Button button4=(Button) findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btn4();
			}

		});
        Button button5=(Button) findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btn5();
			}

		});
        Button button6=(Button) findViewById(R.id.btn6);
        button6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btn6();
			}

		});
        Button button7=(Button) findViewById(R.id.btn7);
        button7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btn7();
			}

		});
        Button button8=(Button) findViewById(R.id.btn8);
        button8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btn8();
			}

		});
        Button button9=(Button) findViewById(R.id.btn9);
        button9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btn9();
			}

		});
        Button buttonsuma=(Button) findViewById(R.id.btnSuma);
        buttonsuma.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btnsuma();
			}
			

		});
        Button buttonresta=(Button) findViewById(R.id.btnResta);
        buttonresta.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btnresta();
			}
			

		});
        Button buttondivision=(Button) findViewById(R.id.btnDivision);
        buttondivision.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btndivision();
			}
			

		});
        Button buttonmultiplicacion=(Button) findViewById(R.id.btnMultiplicacion);
        buttonmultiplicacion.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btnmultiplicacion();
			}
			

		});
        Button buttonigual=(Button) findViewById(R.id.btnIgual);
        buttonigual.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btnigual();
			}
			

		});
        Button buttonPunto=(Button) findViewById(R.id.btnPunto);
        buttonPunto.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btnPunto();
			}
			

		});
        Button buttonac=(Button) findViewById(R.id.btnBorrar);
        buttonac.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btnac();
			}
			

		});
        
    } 
public void btn0()
{
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	if(numero.equalsIgnoreCase("0")==true)
	{
		numero="0";
		
	}
	else
	{
	numero=numero+"0";
	}
	txt_r.setText(numero.toString());
	
}
public void btn1()
{
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	if(numero.equalsIgnoreCase("0")==true)
	{
		numero="1";
		
	}
	else
	{
	numero=numero+"1";	
	}
	txt_r.setText(numero.toString());
	
}
public void btn2()
{
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	if(numero.equalsIgnoreCase("0")==true)
	{
		numero="2";
		
	}
	else
	{
	numero=numero+"2";	
	}
	txt_r.setText(numero.toString());
	
}
public void btn3()
{
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	if(numero.equalsIgnoreCase("0")==true)
	{
		numero="3";
		
	}
	else
	{
	numero=numero+"3";	
	}
	txt_r.setText(numero.toString());
	
}
public void btn4()
{
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	if(numero.equalsIgnoreCase("0")==true)
	{
		numero="4";
		
	}
	else
	{
	numero=numero+"4";	
	}
	txt_r.setText(numero.toString());
	
}
public void btn5()
{
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	if(numero.equalsIgnoreCase("0")==true)
	{
		numero="5";
		
	}
	else
	{
	numero=numero+"5";	
	}
	txt_r.setText(numero.toString());
	
}
public void btn6()
{
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	if(numero.equalsIgnoreCase("0")==true)
	{
		numero="6";
		
	}
	else
	{
	numero=numero+"6";	
	}
	txt_r.setText(numero.toString());
	
}
public void btn7()
{
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	if(numero.equalsIgnoreCase("0")==true)
	{
		numero="7";
		
	}
	else
	{
	numero=numero+"7";	
	}
	txt_r.setText(numero.toString());
	
}
public void btn8()
{
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	if(numero.equalsIgnoreCase("0")==true)
	{
		numero="8";
		
	}
	else
	{
	numero=numero+"8";	
	}
	txt_r.setText(numero.toString());
	
}
public void btn9()
{
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	if(numero.equalsIgnoreCase("0")==true)
	{
		numero="9";
		
	}
	else
	{
	numero=numero+"9";	
	}
	txt_r.setText(numero.toString());
	
}
public void btnsuma(){
	
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	operador1=Double.parseDouble(numero);
	operacion=1;
	numero="0";
	txt_r.setText(numero);
	
}
public void btnresta(){
	
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	operador1=Double.parseDouble(numero);
	operacion=2;
	numero="0";
	txt_r.setText(numero);
	
}
public void btnmultiplicacion(){
	
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	operador1=Double.parseDouble(numero);
	operacion=3;
	numero="0";
	txt_r.setText(numero);
	
}
public void btndivision(){
	
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	txt_r.invalidate();
	
	operador1=Double.parseDouble(numero);
	operacion=4;
	numero="0";
	txt_r.setText(numero);
	
}
public void btnigual()
{
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	operador2=Double.parseDouble(numero);
	switch(operacion)
	{
	case 1:resultado=(operador1+operador2);
	break;
	case 2:resultado=(operador1-operador2);
	break;
	case 3:resultado=(operador1*operador2);
	break;
	case 4:resultado=(operador1/operador2);
	break;
	}
	numero=String.valueOf(resultado);
	operacion=0;
	txt_r.setText(numero);
}
public void btnPunto()
{
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	if(numero.equalsIgnoreCase("0")==true)
	{
		numero=".";
		
	}
	else
	{
	numero=numero+".";	
	}
	txt_r.setText(numero.toString());
	
}

@SuppressWarnings("unused")
public void btnac()
{
	EditText txt_r=(EditText) findViewById(R.id.txtResultado);
	String numero=txt_r.getText().toString();
	txt_r.invalidate();
	
	
	txt_r.setText("0");
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
}