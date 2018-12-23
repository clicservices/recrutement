package sn.objis.recrutement.domaine;
/**
 * @author Aboubacry Balde
 *@category livrable module 1 
 *@since 20/09/2018
 *@version 1.0
 *La classe qui permet de gerer le profils de deloppeur Backend. elle herite de la classe Develeoppment.
 */


public class FrontEnd extends Developpement {
	/**
	 * la methode sans paramettre herite de la classe developpment
	 */

	public FrontEnd() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * le Constructeur de la classe front end avec ses paramettre
	 * @param nom
	 * @param prenom
	 * @param competences
	 * @param langPro
	 * @param age
	 * @param experience
	 * @param salaire
	 */

	public FrontEnd(String nom, String prenom, String competences, String langPro, int age, int experience,
			double salaire) {
		super();
		// TODO Auto-generated constructor stub
		}
	/**
	 * redefinition de la methode developpement pour afficher le profil des dev Front end
	 */

	@Override
	public void developpement(String nom, String prenom,int age, String competences,int experiences,int contact, String languedev) {
		System.out.println("=====================Profil developpeur front end============================");
		System.out.println("nom: " + nom + "\nPrenom: " + prenom + "\nAge: " + age + "\nCompetences: "+ competences + "\nLangage de developpement: " + langPro + "\nExperiences: " + experience );
		super.developpement(nom, prenom,age,competences,experiences,contact, languedev);
	}
	
		
}

