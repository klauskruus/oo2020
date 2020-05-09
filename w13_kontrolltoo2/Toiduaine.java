public class Toiduaine{


	
	String nimetus;
	double valkude_p;
	double rasvade_p;
	double sysivesikute_p;
	
	
	public Toiduaine(String unimetus, double uvalkude_p, double urasvade_p, double usysivesikute_p){
	
		
		nimetus = unimetus;
		valkude_p = uvalkude_p;
		rasvade_p = urasvade_p;
		sysivesikute_p = usysivesikute_p;
		
		if(valkude_p + rasvade_p + sysivesikute_p > 100){
			System.out.println("Protsent ei saa ületada arvu 100");
		}
		
	}

	public double Askvalgud(){
		return valkude_p;
	}

	public double Askrasvad(){
		return rasvade_p;
	}

	public double Asksysivesikud(){
		return sysivesikute_p;
	}

	public String toString(){
		return "Nimetus: " + nimetus;
		return "Valgud: " + valkude_p;
		return "Rasvad: " + rasvade_p;
		return "Süsivesikud: " + sysivesikute_p;
	}

}