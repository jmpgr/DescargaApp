package descargas;

public abstract class Multimedia extends Contenido {

	String calidadString;

	public Multimedia() {
		super();
	}

	public Multimedia(String id, String titulo) {
		super(id, titulo);
	}

	public abstract String getCalidadString() ;

	public void setCalidadString(String calidadString) {
		this.calidadString = calidadString;
	}

}