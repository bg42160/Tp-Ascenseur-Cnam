public class CapteurPosition {
	
	private int position;
    public ascenseurAbstract ascenseur;
    
    public CapteurPosition(ascenseurAbstract a,int positionDepart) {
    	ascenseur=a;
    	this.position=positionDepart;
    }

    
    public int getPosition() { 
        return position;
    }
    
    public void Montee() { 
    	
        this.position=position+1;
    }

    public void Descente() {
    	
        this.position=position-1;
    }
}