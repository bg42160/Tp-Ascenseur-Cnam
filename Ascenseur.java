public class Ascenseur extends ascenseurAbstract {

	public Ascenseur(int nbrEtages, int positionDepart) {
		super(nbrEtages, positionDepart);
		this.nbrEtages=nbrEtages;
		this.position=new CapteurPosition(this,positionDepart);
	}

	@Override
	public void commandeInterne(int commandeInterne) {

		this.commandeInterne = commandeInterne;

	}
	@Override
	public void commandeExterne(int commandeExterne) {

		this.commandeExterne = commandeExterne;
		System.out.println("La demande pour aller au "+commandeExterne+"e est reçue par le circuit de commande, l'ascenseur se déplace...");
		this.Passage();
	}
	@Override
	public void appelInterne(int appel) {
		System.out.println("Vous appuyez depuis l'ascenseur sur le bouton"+appel);
		this.commandeInterne(appel);
	}
	@Override
	public void appelExterne(int appel) {
		System.out.println("Vous appuyez à l'extérieur de l'ascenseur sur le bouton"+appel);
		this.commandeExterne(appel);
	}

	/**
	 * Ici on simule le mouvement de l'ascenseur, la récupération de la position
	 * se fait par l'objet "capteur" instancié par la classe CapteurPosition 
	 */
	@Override
	public void Passage() {

		System.out.println("Les moteurs se mettent en route...");
		while((position.getPosition()!=this.commandeInterne)&&
				(position.getPosition()!=this.commandeExterne)) {

			if(this.commandeExterne<position.getPosition()) {
				System.out.println("Descente commandée: position actuelle -> "+this.position.getPosition());
				position.Descente();
			}
			else if(this.commandeExterne>position.getPosition()) {
				System.out.println("Montée commandée: position actuelle -> "+this.position.getPosition());
				position.Montee();
			}
			else {
				System.out.println("Vous êtes arrivé au "+this.position.getPosition());
			}
		}
		System.out.println("Vous êtes arrivé à destination, position actuelle -> "+this.position.getPosition());
	}
}