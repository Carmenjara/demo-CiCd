package com.tallermicroservicios.demoCiCd.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.tallermicroservicios.demoCiCd.objetos.Usuarios;

@Service
public class FirebaseService {

	
	public String saveUsuario(Usuarios usuario) throws InterruptedException, ExecutionException {
		Firestore dbFirestore = FirestoreClient.getFirestore();
		ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection("users").document(usuario.getNombre()).set(usuario);
		return collectionsApiFuture.get().getUpdateTime().toString();
		
		
	}
}
