
public abstract class ascenseurAbstract {
	protected int commandeInterne;
	protected int commandeExterne;
	protected int nbrEtages;
	protected CapteurPosition position;
	
	public ascenseurAbstract(int nbrEtages, int positionDepart) {
		this.nbrEtages=nbrEtages;
		this.position=new CapteurPosition(this,positionDepart);
	}

	
	public void commandeInterne(int commandeInterne) {}
	
	public void commandeExterne(int commandeExterne) {}
	
	protected void appelInterne(int appel) {}
	
	protected void appelExterne(int appel) {}
	
	protected void Passage() {}
	
}
