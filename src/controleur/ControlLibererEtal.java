package controleur;

import villagegaulois.Etal;

public class ControlLibererEtal {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;

	public ControlLibererEtal(
			ControlTrouverEtalVendeur controlTrouverEtalVendeur) {
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	public boolean isVendeur(String nomVendeur) {
		Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		return etal != null;
	}

	/**
	 *
	 * @param nomVendeur
	 * @return donneesEtal est un tableau de chaine contenant
	 * 		[0] : un boolean indiquant si l'etal est occupe
	 * 		[1] : nom du vendeur
	 * 		[2] : produit vendu
	 * 		[3] : quantite de produit a vendre au debut du marche	
	 * 		[4] : quantite de produit vendu
	 */
	public String[] libererEtal(String nomVendeur) {
		Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		String[] donneesEtal = etal.etatEtal();
		etal.libererEtal();
		return donneesEtal;
	}

}