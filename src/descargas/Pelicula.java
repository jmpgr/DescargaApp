package descargas;

public class Pelicula extends Multimedia {

	Director director;
	Persona[] actoresPrincipales;
	
	
	public Pelicula(String id, String titulo) {
		super(id, titulo);
	}


	@Override
	public String getCalidadString() {
		// TODO Auto-generated method stub
		return calidadString;
	} 
}
