package sn.objis.recrutement.domaine;
/**
 * @author Aboubacry Balde
 *@category livrable module 1 
 *@since 20/09/2018
 *@version 1.0
 *La classe mARKETING est la classe mere a parTIR delaquelle on va generer les differents profils des mARKETEURS
 */

public class Marketing {
	protected String nom, prenom, competences, languesPar;
	protected int age, experience;
	protected double salaire;
	/**
	 * La methode sans paramettre de la classe developpment
	 */
	public Marketing() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur avaec touts les paramettre de la classe Marketing
	 * @param nom
	 * @param prenom
	 * @param competences
	 * @param languesPar
	 * @param age
	 * @param experience
	 * @param salaire
	 */
	public Marketing(String nom, String prenom, String competences, String languesPar, int age, int experience,
			double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.competences = competences;
		this.languesPar = languesPar;
		this.age = age;
		this.experience = experience;
		this.salaire = salaire;
	}
	/**
	 * A partir d ici on a les  getters et les setters de la classe Marketing
	 * @return
	 */
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCompetences() {
		return competences;
	}
	public void setCompetences(String competences) {
		this.competences = competences;
	}
	public String getLanguesPar() {
		return languesPar;
	}
	public void setLanguesPar(String languesPar) {
		this.languesPar = languesPar;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	/**
	 * Methode pour afficher les profil des marketeurs
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param competences
	 * @param experiences
	 * @param contact
	 */
	public void profilmarket(String nom, String prenom, int age,String competences, int experiences, int contact ) {
		System.out.println("=====================Profil de Responsable Marketing digital============================");
		System.out.println("nom: " + nom + "\nPrenom: " + prenom + "\nAge: " + age + "\nCompetences: "+ competences + "\nExperiences: " + experience +"\nNumero Portable: " +contact );	
	}
}
