package sn.objis.recrutement.service;


/**
 * @author Aboubacry Balde
 *@category livrable module 1 
 *@since 20/09/2018
 *@version 1.0
 * classe Salaire qui permet de calculer le salaire net des candidats: une commission de 500f est enleve sur le salaire de chaque candidat
 */
public class Salaire {
	double interet; // la commission
	double salaire; // le salaire pretndu par le candidat
	public double estimationSalaire(double salairenet) {
		interet = 200;
	    salairenet  += interet;
		return salairenet;
		
	}
		

}
