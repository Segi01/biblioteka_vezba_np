package biblioteka;

import java.util.List;

public class Knjiga {

	
	private String naslov;
	private Long isbn;
	private List<Autor> autori;
	private String izdavac;
	private int izdanje;
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public Long getIsbn() {
		return isbn;
	}
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	public List<Autor> getAutori() {
		return autori;
	}
	public void setAutori(List<Autor> autori) {
		this.autori = autori;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	
	
	
	
	
}
