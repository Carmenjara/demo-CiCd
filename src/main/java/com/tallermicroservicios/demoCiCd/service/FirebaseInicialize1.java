package com.tallermicroservicios.demoCiCd.service;

import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;


@Service
public class FirebaseInicialize1 {
	
	@PostConstruct
	public void initialize() throws IOException {
		
		try {
			FileInputStream serviceAccount =
					  new FileInputStream("./serviceaccount.json");

					FirebaseOptions options = new FirebaseOptions.Builder()
					  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
					  .setDatabaseUrl("https://beaconsutpl-d73c0.firebaseio.com")
					  .build();

					FirebaseApp.initializeApp(options);
			 
		}catch (Exception e){
			e.printStackTrace();
			
		}
		
	}

}
