package sn.objis.recrutement.domaine;

/**
 * @author Aboubacry Balde
 *@category livrable module 1 
 *@since 20/09/2018
 *@version 1.0
 *La classe qui permet de gerer le profils de Maintenancier. elle herite de la classe Technicien.
 */

public class ReseauTelecom extends Technicien {

	/**
	 * la methode sans paramettre herite de la classe Technicien
	 */

	public ReseauTelecom() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * le Constructeur de la classe Reseau Telecom avec ses paramettres
	 * @param nom
	 * @param prenom
	 * @param competences
	 * @param langPro
	 * @param age
	 * @param experience
	 * @param salaire
	 */
	public ReseauTelecom(String nom, String prenom, String competences, int age, int experience, double salaire) {
		super(nom, prenom, competences, age, experience, salaire);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Redefinition de la methode POUR AFFICHER LE PROFIL DES TECH
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param competences
	 * @param experiences
	 * @param contact
	 */


	@Override
	public void profiltec(String nom, String prenom, int age, String competences, int experiences, int contact) {
		System.out.println("=====================Profil de Technicien Reseau et Telecom============================");
		System.out.println("nom: " + nom + "\nPrenom: " + prenom + "\nAge: " + age + "\nCompetences: "+ competences + "\nExperiences: " + experience +"\nNumero Portable: " +contact );
		super.profiltec(nom, prenom, age, competences, experiences, contact);
	}
	

}
