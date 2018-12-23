package sn.objis.recrutement.domaine;
/**
 * @author Aboubacry Balde
 *@category livrable module 1 
 *@since 20/09/2018
 *@version 1.0
 *La classe developpement est la classe mere a parfil delaquelle on va generer les differents profils des developpeurs
 */
public  class Developpement {
	// les propietes de la classe developpement
	protected String nom, prenom, competences, langPro;
	protected int age, experience;
	protected double salaire;
	/**
	 * La methode sans paramettre de la classe developpment
	 */
	public Developpement() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 *  le constructeur qui prend en paramettre toutes les proprietes de la classe developpment
	 * @param nom
	 * @param prenom
	 * @param competences
	 * @param langPro
	 * @param age
	 * @param experience
	 * @param salaire
	 */
	public Developpement(String nom, String prenom, String competences, String langPro, int age, int experience,
			double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.competences = competences;
		this.langPro = langPro;
		this.age = age;
		this.experience = experience;
		this.salaire = salaire;
	}
	/**
	 * A partir d ici on a les  getters et les setters de la classe developpment
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
	public String getLangPro() {
		return langPro;
	}
	public void setLangPro(String langPro) {
		this.langPro = langPro;
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
	 * une methode qui nous permettra d afficher les poofils des developpeur
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param competences
	 * @param experiences
	 * @param contact
	 * @param languedev
	 */
		
	public  void developpement(String nom, String prenom,int age, String competences, int experiences, int contact, String languedev) {
	
	}
	
}
