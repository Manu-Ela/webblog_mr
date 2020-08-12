package webblogNeu;

public class Beitrag {
	
	// Attribute
	
	private String autorBeitrag;
	private String titelBeitrag;
	private String textBeitrag;
	
	// Konstruktor

	public Beitrag(String autorBeitrag, String titelBeitrag, String textBeitrag) {
		this.autorBeitrag = autorBeitrag;
		this.titelBeitrag = titelBeitrag;
		this.textBeitrag = textBeitrag;
	}
	
	// Getter und Setter
	
	public String getAutorBeitrag() {
		return autorBeitrag;
	}

	public void setAutorBeitrag(String autorBeitrag) {
		this.autorBeitrag = autorBeitrag;
	}

	public String getTitelBeitrag() {
		return titelBeitrag;
	}

	public void setTitelBeitrag(String titelBeitrag) {
		this.titelBeitrag = titelBeitrag;
	}

	public String getTextBeitrag() {
		return textBeitrag;
	}

	public void setTextBeitrag(String textBeitrag) {
		this.textBeitrag = textBeitrag;
	}
	
	// Methoden
	
	// Überschreibe toString
	
	public String toString() {
		return String.format("%s\nvon: %s\n%s\n", titelBeitrag,autorBeitrag,textBeitrag);
	}
	
}
