package com.dio;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.dio.Carro;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity { 

    TextView TextoCarro;

    TextView TextoCarro2;

    TextView TextoCarro3;
    
    TextView TextoCarro4;
    
    TextView TextoCarro5;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextoCarro = (TextView) findViewById(R.id.txt);
 
        TextoCarro2 = (TextView) findViewById(R.id.txt2);
        
        TextoCarro3 = (TextView) findViewById(R.id.txt3);
        
        TextoCarro4 = (TextView) findViewById(R.id.txt4);
        
        TextoCarro5 = (TextView) findViewById(R.id.txt5);
        
        
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        System.out.println(listCarros.contains(new Carro("Ford")));

        String Texto = String.valueOf(listCarros.contains(new Carro("Ford")));
        TextoCarro.setText(Texto);
        
        
        
        System.out.println(listCarros.get(2));

        String Texto2 = String.valueOf(listCarros.get(2));
        TextoCarro2.setText(Texto2);
        
        
        
        System.out.println(listCarros.indexOf(new Carro("Fiat")));
        String Texto3 = String.valueOf(listCarros.indexOf(new Carro("Fiat")));
        TextoCarro3.setText(Texto3);
        
        
        
        System.out.println(listCarros.remove(2));
        String Texto4 = String.valueOf(listCarros.remove(2));
        TextoCarro4.setText(Texto4);
        
        
        
        System.out.println(listCarros);
        String Texto5 = String.valueOf(listCarros);
        TextoCarro5.setText(Texto5);
        

    }

} 
