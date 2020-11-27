package model;

import java.sql.Date;

public class Candidato
{
	int id;
	String mail;
	String password;
	String nome;
	String cognome;
	Date data_nascita;
	String titolo_studio;
	int numero_telefono;
	String comune;
	public Candidato() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidato(int id, String mail, String password, String nome, String cognome, Date data_nascita,
			String titolo_studio, int numero_telefono, String comune) {
		super();
		this.id = id;
		this.mail = mail;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.data_nascita = data_nascita;
		this.titolo_studio = titolo_studio;
		this.numero_telefono = numero_telefono;
		this.comune = comune;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public Date getData_nascita() {
		return data_nascita;
	}
	public void setData_nascita(Date data_nascita) {
		this.data_nascita = data_nascita;
	}
	public String getTitolo_studio() {
		return titolo_studio;
	}
	public void setTitolo_studio(String titolo_studio) {
		this.titolo_studio = titolo_studio;
	}
	public int getNumero_telefono() {
		return numero_telefono;
	}
	public void setNumero_telefono(int numero_telefono) {
		this.numero_telefono = numero_telefono;
	}
	public String getComune() {
		return comune;
	}
	public void setComune(String comune) {
		this.comune = comune;
	}
}
