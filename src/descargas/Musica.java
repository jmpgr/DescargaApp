package descargas;

public class Musica extends Multimedia {
	
	Artista artista;
	
	public Musica(String id, String titulo) {
		super(id, titulo);
	}

	@Override
	public String getCalidadString() {
		// TODO Auto-generated method stub
		return calidadString;
	}
	
}

