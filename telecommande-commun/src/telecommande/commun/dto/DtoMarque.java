package telecommande.commun.dto;

public class DtoMarque {

	
    private int			idMarque;
	
	private String		nom;
	
	public DtoMarque() {
	}

	public DtoMarque(int id, String nom ) {
		super();
		this.idMarque = id;
		this.nom = nom;
		
	}
	

	public int getIdMarque() {
		return idMarque;
	}

	public void setIdMarque(int id) {
		this.idMarque = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
