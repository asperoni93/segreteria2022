package it.eb.segreteria.model;

public class Studente {

	private String matricola;
	private String codice_fiscale;
	private String nome;
	private String cognome;
	private String data_nascita; 
	private String genere;
	private String telefono1;
	private String nome_telefono1;
	private String telefono2;
	private String nome_telefono2;
	private String email;
	private String luogo_nascita;
	private String citta;
	private String indirizzo;
	private String cap;
	private String nazionalita;
	
	
	public Studente() {
		
	}
	
	public Studente(String matricola, String codice_fiscale, String nome, String cognome, String data_nascita, 
			String genere,String telefono1, String nome_telefono1,  String telefono2, 
			String nome_telefono2, String email,String luogo_nascita, String citta, String indirizzo, 
			String cap, String nazionalita) {
		this.matricola= matricola;
		this.codice_fiscale=codice_fiscale;
		this.nome=nome;
		this.cognome=cognome;
		this.data_nascita=data_nascita;
		this.genere=genere;
		this.telefono1=telefono1;
		this.nome_telefono1=nome_telefono1;
		this.telefono2=telefono2;
		this.nome_telefono2=nome_telefono2;
		this.email=email;
		this.luogo_nascita=luogo_nascita;
		this.citta=citta;
		this.indirizzo=indirizzo;
		this.cap=cap;
		this.nazionalita=nazionalita;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getCodice_fiscale() {
		return codice_fiscale;
	}

	public void setCodice_fiscale(String codice_fiscale) {
		this.codice_fiscale = codice_fiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getData_nascita() {
		return data_nascita;
	}

	public void setData_nascita(String data_nascita) {
		this.data_nascita = data_nascita;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getTelefono1() {
		return telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	public String getNome_telefono1() {
		return nome_telefono1;
	}

	public void setNome_telefono1(String nome_telefono1) {
		this.nome_telefono1 = nome_telefono1;
	}

	public String getTelefono2() {
		return telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	public String getNome_telefono2() {
		return nome_telefono2;
	}

	public void setNome_telefono2(String nome_telefono2) {
		this.nome_telefono2 = nome_telefono2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLuogo_nascita() {
		return luogo_nascita;
	}

	public void setLuogo_nascita(String luogo_nascita) {
		this.luogo_nascita = luogo_nascita;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}
	

}
