package it.eb.segreteria.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.eb.segreteria.model.Studente;

@Component 
public class StudenteDAO {
	
	@Autowired
	GenericDAO genericDAO;
	

	public ArrayList<Studente> getAllStudente(){
		String query="select matricola, codice_fiscale, nome, cognome, data_nascita, genere, telefono1, nome_telefono1, telefono2, nome_telefono2, email, luogo_nascita, citta, indirizzo, cap, nazionalita from studente";
		ResultSet resultSet = genericDAO.getQueryResultSet(query, null);
		ArrayList<Studente> u = new ArrayList<Studente>();
		try { 
			while (resultSet.next()) {
				u.add(new Studente (resultSet.getString("matricola"),
								 resultSet.getString("codice_fiscale"),
								 resultSet.getString("nome"),
								 resultSet.getString("cognome"),
								 resultSet.getString("data_nascita"),
								 resultSet.getString("genere"),
								 resultSet.getString("telefono1"),
								 resultSet.getString("nome_telefono1"),
								 resultSet.getString("telefono2"),
								 resultSet.getString("nome_telefono2"),
								 resultSet.getString("email"),
								 resultSet.getString("luogo_nascita"),
								 resultSet.getString("citta"),
								 resultSet.getString("indirizzo"),
								 resultSet.getString("cap"),
								 resultSet.getString("nazionalita")
							));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	public void salva(Studente studente) {
		
		HashMap<String, Object> inParamMap = new HashMap<String,Object>();
		inParamMap.put("matricola", studente.getMatricola());
		inParamMap.put("codice_fiscale", studente.getCodice_fiscale());
		 inParamMap.put("nome", studente.getNome());
		 inParamMap.put("cognome", studente.getCognome());
		 inParamMap.put("data_nascita", studente.getData_nascita());
		 inParamMap.put("genere", studente.getGenere());
		 inParamMap.put("telefono1", studente.getTelefono1());
		 inParamMap.put("nome_telefono1", studente.getNome_telefono1());
		 inParamMap.put("telefono2", studente.getTelefono2());
		 inParamMap.put("nome_telefono2", studente.getNome_telefono2());
		 inParamMap.put("email", studente.getEmail());
		 inParamMap.put("luogo_nascita", studente.getLuogo_nascita());
		 inParamMap.put("citta", studente.getCitta());
		 inParamMap.put("indirizzo", studente.getIndirizzo());
		 inParamMap.put("cap", studente.getCap());
		 inParamMap.put("nazionalita", studente.getNazionalita());
		 
		 genericDAO.getQueryResult("call segreteria.inserimento_studenti(:matricola,:codice_fiscale,:nome,:cognome,:data_nascita,:genere,:telefono1,:nome_telefono1,:telefono2,:nome_telefono2,:email,:luogo_nascita,:citta,:indirizzo,:cap,:nazionalita);", inParamMap);
		 
	}
	
}