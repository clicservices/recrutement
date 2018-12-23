package sn.objis.recrutement.domaine;
/**
 * @author Aboubacry Balde
 *@category livrable module 1 
 *@since 20/09/2018
 *@version 1.0
 *La classe qui permet de gerer le profils de deloppeur Backend. elle herite de la classe Develeoppment.
 */

public class BackEnd extends Developpement {
/**
 * la methode sans paramettre herite de la classe developpment
 */
	public BackEnd() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * le Constructeur de la classe backend avec ses paramettre
	 * @param nom
	 * @param prenom
	 * @param competences
	 * @param langPro
	 * @param age
	 * @param experience
	 * @param salaire
	 */

	public BackEnd(String nom, String prenom, String competences, String langPro, int age, int experience,
			double salaire) {
		super(nom, prenom, competences, langPro, age, experience, salaire);
		// TODO Auto-generated constructor stub
	}
	/**
	 * redefinition de la methode developpement pour afficher le profil des dev back end
	 */

	@Override
	public void developpement(String nom, String prenom, int age, String competences, int experiences, int contact,String languedev) {
		System.out.println("=====================Profil developpeur front Backend============================");
		System.out.println("nom: " + nom + "\nPrenom: " + prenom + "\nAge: " + age + "\nCompetences: "+ competences + "\nLangage de developpement: " + langPro + "\nExperiences: " + experience );
		super.developpement(nom, prenom, age, competences, experiences, contact,languedev);
	}
	

}
