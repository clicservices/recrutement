package sn.objis.recrutement.presentation;
import sn.objis.recrutement.domaine.*;
import sn.objis.recrutement.service.Salaire;

import java.util.Scanner;
/** @author Aboubacry Balde
*@category livrable module 1 
*@since 20/09/2018
*@version 1.0
*La classe lanceur  est la classe principâle
*/
public class Lanceur {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenue sur notre application recrutement" + "\nSoyez pret pour votre prochain emploi"); //message de benvenue
		//declaration et initialisation des objets
		FrontEnd f1 = new FrontEnd();
		BackEnd b1 = new BackEnd();
		Maintenancier profiltecM = new Maintenancier();
		ReseauTelecom profiltelecom = new ReseauTelecom();
		Marketing profilMa = new Marketing();
		Salaire estSalaire = new Salaire();
		//utilisation de la methode scanner pour recuperer la saisie au clavier
		Scanner sc = new Scanner(System.in);
		int choix = 0; //declaration de la variable choix pour tester les choix de l utilisateur
		char rep = ' '; //utilisation de la methode char pour  recuperere l index du choix de l utilisateur
		System.out.println("1.creer un profil de Developpeur");
		System.out.println("2.cree un profil de Techniciens");
		System.out.println("3.creer un profil de Marketeur");
		double salaireFixe = 0;
		choix = sc.nextInt();

		//utilisation de la boucle do while pour decider a quant doit oin arreter le traitement
		do {
			// on utilise les boucles conditionnelles which pour etudier les choix de l utilisateur et faire des traitements
			switch (choix) {
			case 1:
				System.out.println("Choississez votre specialite en tant que developpeur");
				System.out.println("1.front end");
				System.out.println("2.back end");
				int choixDev = 0;
				choixDev = sc.nextInt();
				switch (choixDev) {
				case 1:// choix creer le profil du developpeur front end
					System.out.println("Vous etes le point de creer votre profil professionnel de Developpeur front end." + "\nPour auguementer votre chance de trouver un emploi rediger dans un langage simple et sans faute. Merci ");
					String profil = sc.nextLine();
					System.out.println("veuillez saisir votre Nom: ");
					String nom = sc.next();
					System.out.println("Veuillez saisir votre Prenom: ");
					String prenom = sc.next();
					System.out.println("Veillez saisir votre Age: ");
					int age = sc.nextInt();
					System.out.println("Veillez saisir vos Competences: ");
					String competences = sc.next();
					System.out.println("Langage de dev que vous maitrise: ");
					String languedev = sc.next();
					System.out.println("Veillez saisir votre Experience: ");
					int experiences = sc.nextInt();
					System.out.println("Veillez saisir votre Numero de telephone mobile: ");
					int contact = sc.nextInt();
					f1.developpement(nom, prenom,age,competences,experiences,contact,languedev);
					//salaireFixe = estSalaire.estimationSalaire();
					
					break;
				case 2: // choix pour creer le profil developpeur back end
					System.out.println("Vous etes le point de creer votre profil professionnel de Developpeur Back end." + "\nPour auguementer votre chance de trouver un emploi rediger dans un langage simple et sans faute. Merci ");
					String profilb1 = sc.nextLine();
					System.out.println("veuillez saisir votre Nom: ");
					String nomb1 = sc.next();
					System.out.println("Veuillez saisir votre Prenom: ");
					String prenomb1 = sc.next();
					System.out.println("Veillez saisir votre Age: ");
					int ageb1 = sc.nextInt();
					System.out.println("Veillez saisir vos Competences: ");
					System.out.println("Langage de dev que vous maitrise: ");
					String languedevb1 = sc.next();
					String competencesb1 = sc.next();
					System.out.println("Veillez saisir votre Experience: ");
					int experiencesb1 = sc.nextInt();
					System.out.println("Veillez saisir votre Numero de telephone mobile: ");
					int contactb1 = sc.nextInt();
					//affichage du profil 
					b1.developpement(nomb1, prenomb1,ageb1,competencesb1,experiencesb1,contactb1,languedevb1);
				default:
					break;
				}
				break;
			case 2 : // creatio du profil des techiniciens
				System.out.println("Profil des techniciens");
				System.out.println("1.Maintenancier");
				System.out.println("2.Technicien Telecom");
				int optionTech = 0;
				optionTech = sc.nextInt();
				switch (optionTech) {
				case 1: // profil des maintenanciers
					System.out.println("Vous etes le point de creer votre profil professionnel de Maintenancier informatique." + "\nPour auguementer votre chance de trouver un emploi rediger dans un langage simple et sans faute. Merci ");
					String profilM1 = sc.nextLine();
					System.out.println("veuillez saisir votre Nom: ");
					String nomM1 = sc.next();
					System.out.println("Veuillez saisir votre Prenom: ");
					String prenomM1 = sc.next();
					System.out.println("Veillez saisir votre Age: ");
					int ageM1 = sc.nextInt();
					System.out.println("Veillez saisir vos Competences: ");
					String competencesM1 = sc.next();
					System.out.println("Veillez saisir votre Experience: ");
					int experiencesM1 = sc.nextInt();
					System.out.println("Veillez saisir votre Numero de telephone mobile: ");
					int contactM1 = sc.nextInt();
					profiltecM.profiltec(nomM1, prenomM1,ageM1,competencesM1,experiencesM1,contactM1);
					break;
				case 2 :// profil des tech reseau telecom
					System.out.println("Vous etes le point de creer votre profil professionnel de Technicien Reseau et Te2lecom." + "\nPour auguementer votre chance de trouver un emploi rediger dans un langage simple et sans faute. Merci ");
					String profilR1 = sc.nextLine();
					System.out.println("veuillez saisir votre Nom: ");
					String nomR1 = sc.next();
					System.out.println("Veuillez saisir votre Prenom: ");
					String prenomR1 = sc.next();
					System.out.println("Veillez saisir votre Age: ");
					int ageR1 = sc.nextInt();
					System.out.println("Veillez saisir vos Competences: ");
					String competencesR1 = sc.next();
					System.out.println("Veillez saisir votre Experience: ");
					int experiencesR1 = sc.nextInt();
					System.out.println("Veillez saisir votre Numero de telephone mobile: ");
					int contactR1 = sc.nextInt();
					profiltecM.profiltec(nomR1, prenomR1,ageR1,competencesR1,experiencesR1,contactR1);
				default:
					break;
				}
			case 3:// profil des marketeurs
				System.out.println("Vous etes le point de creer votre profil professionnel de Responsable Marketing Digital." + "\nPour auguementer votre chance de trouver un emploi rediger dans un langage simple et sans faute. Merci ");
				String profilR1 = sc.nextLine();
				System.out.println("veuillez saisir votre Nom: ");
				String nomMa = sc.next();
				System.out.println("Veuillez saisir votre Prenom: ");
				String prenomMa= sc.next();
				System.out.println("Veillez saisir votre Age: ");
				int ageMa = sc.nextInt();
				System.out.println("Veillez saisir vos Competences: ");
				String competencesMa = sc.next();
				System.out.println("Veillez saisir votre Experience: ");
				int experiencesMa = sc.nextInt();
				System.out.println("Veillez saisir votre Numero de telephone mobile: ");
				int contactMa = sc.nextInt();
				System.out.println("Veillez saisir votre salaire: ");
				double salaireMa = sc.nextInt();
				// affichage profil marketeur
				profilMa.profilmarket(nomMa, prenomMa,ageMa,competencesMa,experiencesMa,contactMa);
				// initialisation du salaire fixe
				salaireFixe = estSalaire.estimationSalaire(salaireMa);
				// affichage du salaire
				System.out.println(salaireFixe);
			default:
				break;
			}
		} while (rep == 0);
	}

}
