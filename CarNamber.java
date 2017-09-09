package carsNambers;

public class CarNamber {
	private String namLetters;//пр
	private String namNumerals;
	private String namCode;
	
	public CarNamber(String namLetters, String namNumerals, String namCode) {
		this.namLetters = namLetters;
		this.namNumerals = namNumerals;
		this.namCode = namCode;		
	}
	
	protected boolean containsNamLetters (String namLetters) {
		return this.namLetters.equals(namLetters);
	}
	
	protected boolean containsNamNumerals (String namNumerals) {
		return this.namNumerals.equals(namNumerals);
	}
	
	protected boolean containsNamCode (String namCode) {
		return this.namCode.equals(namCode);
	}
	
	protected boolean seachNamber(String namLetters, String namNumerals, String namCode) {
		if(this.containsNamLetters(namLetters) && this.containsNamNumerals(namNumerals) && this.containsNamCode(namCode)) {
			return true;
		}
		return false;
	}
	
	

}
