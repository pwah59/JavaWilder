import java.io.*;
import java.util.*;


	
    public class Wilder {
		
		
// attributs privés confid. à la classe
    private String firstname;
    private boolean aware;

   //constructor du même nom que la classe
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }
    
    // getters
    public String getFirstName(){
		return this.firstname;
	}
    
    public boolean isAware() {
    return this.aware;
}

	//setters
	
	public void setFirstName(String firstname) {
    this.firstname = firstname;
	}
  
    public void setAware(boolean aware) {
    this.aware = aware;
	}
	
	public void whoAmI() {
		if(this.aware){
	System.out.println("Je m'appelle " + this.firstname + " et je suis aware !"); 	
		}
		else{
			System.out.println("Je m'appelle " + this.firstname + " et je ne suis pas aware !");
		}
	}
	
}// fin de classe    


