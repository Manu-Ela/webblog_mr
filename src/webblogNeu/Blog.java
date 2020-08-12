package webblogNeu;

public class Blog {

	private Beitrag[] beitraege = new Beitrag[1000];

	public void addBeitrag(Beitrag beitrag) {

		for (int i = 0; i < beitraege.length; i++) {
			if (beitraege[i] == null) {
				beitraege[i] = beitrag;
				return;
			}
		}

		for (Beitrag einBeitrag : beitraege) {
			if (einBeitrag == null) {
				einBeitrag = beitrag;
				return;
			}
		}
	}
	
	public Beitrag[] getBeitraege() {
		return this.beitraege;
	}
	
	public String toString() {
		String value ="";
		for (Beitrag beitrag:beitraege) {
			value += beitrag + ", ";
		}
		return value;
	}

}
