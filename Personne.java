
public class Personne {
	
	String nom ;
	String prenom;
	int age;
	
	
	public Personne(String nom, String prenom) {
		
		super();
		this.nom = nom;
		this.prenom = prenom;
		
	}


	@Override
	public String toString() {
		// TODO Stub de la m�thode g�n�r� automatiquement
		
		return prenom + " "+ nom;
	}


	
	
	
}
