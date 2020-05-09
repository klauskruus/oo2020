public class Main{
    public static void main(String[] arg){

        Toiduaine Kartul = new Toiduaine("Kartul", 23, 50, 27);
		Toiduaine Hapukoor = new Toiduaine("Hapukoor", 3, 20, 77);
        Toiduaine Vorst = new Toiduaine("Vorst", 43, 20, 30);
        
        Toidukomponent kartul = new Toidukomponent();
		kartul.t = Kartul;
		kartul.kogus = 90;
		
		Toidukomponent hapukoor = new Toidukomponent();
		hapukoor.t = Hapukoor;
		hapukoor.kogus = 30;

		Toidukomponent vorst = new Toidukomponent();
		vorst.t = Vorst;
        vorst.kogus = 50;
        
        Toit KartuliSalat = new Toit();
		KartuliSalat.nimetus = "Kartulisalat";
		KartuliSalat.Toidukomponendid.add(kartul);
		KartuliSalat.Toidukomponendid.add(hapukoor);
		KartuliSalat.Toidukomponendid.add(vorst);
		
		return KartuliSalat.kogusSalatiks(soovitudKogus);
		
    }
}