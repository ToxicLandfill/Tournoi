import java.util.*;

public class Championnat {


	private ArrayList<Equipe> listeEquipe;
	private ArrayList<Equipe> ruban;
	private int nbEquipe;
	
	public Championnat(ArrayList<Equipe> listeEquipe) {
		this.listeEquipe = listeEquipe;
		this.ruban = listeEquipe;
		
		this.nbEquipe = this.listeEquipe.size();
		if (this.nbEquipe%2!=0) this.ruban.add(new Equipe("REPOS", 0));
	}
	
	public int getNbEquipe() {
		return this.nbEquipe;
	}

	public int getNbMatch() {
		
		if(nbEquipe%2==0) {
			return nbEquipe*(nbEquipe-1)/2;
		} else {
			return nbEquipe*(nbEquipe/2);
		}

	}
	
	public void afficherRuban() {
		for (Equipe monEquipe : ruban) {
			System.out.println(monEquipe.getNom() + " : " + monEquipe.getId());
		}
	}
	
	
	
	public void rotationRuban() {
		
		Collections.rotate(ruban, 1);
		Collections.swap(ruban, 0, 1);
	}
	
	public void afficherMatch() {

		int nbRonde;
		if (nbEquipe%2==0) {
			nbRonde = nbEquipe-1;
		} else {
			nbRonde = nbEquipe;
		}
		
		
		int iMatch=1;
		
		for (int i=0; i<nbRonde; i++) {
			for(int j=0; j<((nbRonde+1)/2); j++) {
				System.out.println("Match " + iMatch + " : " + ruban.get(j).getNom() + " VS " + ruban.get(ruban.size()-j-1).getNom());
				iMatch++;
			}
			System.out.println("");
			this.rotationRuban();
			
		}
		
		
	}
	

}
