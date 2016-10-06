public class Prova2 {
	
	//Modificació 2312313131
	//Modificació 2
	
public static void main(String[] args) {
	    
		String entrada = "abaccggaaaejjjeahekeee";
        Prova2 llargada = new Prova2();
        System.out.println(llargada.calcula(entrada));
	}
	
	public String calcula(String entrada) {
		String resultat = "";
		if (entrada.length() == 0){
			return "No s'ha escrit cap frase.";
		}
		int max = 0;
		int contador = 0;
		char caracter = entrada.charAt(0);
		
		for(int i=0; i<entrada.length(); i++) {
			
			if (entrada.charAt(i) == caracter) {
				contador ++;
			}
			
			else {
				
				if (contador == max) {
					resultat = resultat + ", " + caracter;
				}
				
				else if (contador > max) {
					resultat = Character.toString(caracter);
					max = contador;
				}
				
				caracter = entrada.charAt(i);
				contador = 1;
			}
		}
		
		if (contador == max) {
			resultat = resultat + ", " + caracter;
		}
		
		else if (contador > max) {
			resultat = Character.toString(caracter);
			max = contador;
		}
		if(max == 1){
			return resultat + " tenen " + max + " repetició.";
		}
		else{
			return resultat + " tenen " + max + " repeticions.";
		}
	}

}
