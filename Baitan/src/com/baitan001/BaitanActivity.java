package com.baitan001;

import android.app.Activity;
import android.os.Bundle;

public class BaitanActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        connInit();
        
    }
    
    
    /* Initialize the connection with server, retrieve Logo*/
    private boolean connInit(){
    	final String defaultLogo = "res/drawble-ldpi/logo91x29.png"; 
    	dispLogo(defaultLogo);
    	return true;
    }
    
    
    /* Display Logo*/
    private boolean dispLogo(String logoURI){
 
    	return true;
    }
}