package model;

public class Candidatura
{
 int id;
 int id_candidato;
 int annuncio;
 int id_societa;
public Candidatura() {
	super();
	// TODO Auto-generated constructor stub
}
public Candidatura(int id, int id_candidato, int annuncio, int id_societa) {
	super();
	this.id = id;
	this.id_candidato = id_candidato;
	this.annuncio = annuncio;
	this.id_societa = id_societa;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getId_candidato() {
	return id_candidato;
}
public void setId_candidato(int id_candidato) {
	this.id_candidato = id_candidato;
}
public int getAnnuncio() {
	return annuncio;
}
public void setAnnuncio(int annuncio) {
	this.annuncio = annuncio;
}
public int getId_societa() {
	return id_societa;
}
public void setId_societa(int id_societa) {
	this.id_societa = id_societa;
}
 
}
