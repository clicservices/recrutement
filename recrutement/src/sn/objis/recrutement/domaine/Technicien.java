package sn.objis.recrutement.domaine;
/**
 * @author Aboubacry Balde
 *@category livrable module 1 
 *@since 20/09/2018
 *@version 1.0
 *La classe Technicien est la classe mere a parfil delaquelle on va generer les differents profils des developpeurs
 */
 class Technicien {
	protected String nom, prenom, competences;
	protected int age, experience;
	protected double salaire;
	/**
	 * La methode sans paramettre de la classe developpment
	 */
	public Technicien() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur avaec touts les paramettre de la classe Technicen
	 * @param nom
	 * @param prenom
	 * @param competences
	 * @param age
	 * @param experience
	 * @param salaire
	 */
	public Technicien(String nom, String prenom, String competences, int age, int experience, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.competences = competences;
		this.age = age;
		this.experience = experience;
		this.salaire = salaire;
	}
	/**
	 * A partir d ici on a les  getters et les setters de la classe Technicien
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
	 *  methode pour creer le profil des techniciens
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param competences
	 * @param experiences
	 * @param contact
	 */
	public void profiltec(String nom, String prenom, int age,String competences, int experiences, int contact ) {
		
	}

}
