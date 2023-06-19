//import Wilder.*;

class Classroom {
// à minima une classe nommée + une méthode

//methode principale = point d'entrée du prgm
    public static void main(String[] args) {
		
        Wilder wildJc = new Wilder("Jean-Claude",true);
        wildJc.whoAmI();
        
        Wilder wildHi = new Wilder("Henri",false);
        wildHi.whoAmI();
        
    }
}

