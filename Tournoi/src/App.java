import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Championnat monChampionnat;
		ArrayList<Equipe> listeEquipe = new ArrayList<Equipe>();
		ArrayList<Equipe> listeEquipe2 = new ArrayList<Equipe>();
		
		for (int i=1; i<=10; i++) {
			listeEquipe.add(new Equipe("Equipe_"+i, i));
		}
		
		for (int i=1; i<=15; i++) {
			listeEquipe2.add(new Equipe("Equipe_"+i, i));
		}		
		
		monChampionnat = new Championnat(listeEquipe);
		
		int nbEquipe = monChampionnat.getNbEquipe();
		int nbMatch = monChampionnat.getNbMatch();
		
		System.out.println("Nombre d'equipes : " + nbEquipe);
		System.out.println("Nombre de matchs : " + nbMatch);

		
		monChampionnat.afficherMatch();
		//test ajout ligne inutile
		int truc = 2;
		
		
	}

}
