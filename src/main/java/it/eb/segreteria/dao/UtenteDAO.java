package it.eb.segreteria.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.eb.segreteria.model.Utente;

@Component
public class UtenteDAO {
	
	@Autowired
	GenericDAO genericDAO;
	

	public ArrayList<Utente> getAllUtente(){
		String query = "select email,password,nome,cognome from users; ";
		ResultSet resultSet = genericDAO.getQueryResultSet(query, null);
		ArrayList<Utente> u = new ArrayList<Utente>();
		try {
			while(resultSet.next()) {
				u.add(new Utente(resultSet.getString("email"),
								 resultSet.getString("password"),
								 resultSet.getString("nome"),
								 resultSet.getString("cognome")
						 ));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
}
