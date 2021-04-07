package com.xworkz.app.map.villeageandpincode;


public class VillegePincodeDTO {

	
	private String villeageName;
	private int villeagePinCode;

	public VillegePincodeDTO(int villeagePinCode,String villeageName) {

		this.villeageName = villeageName;
		this.villeagePinCode = villeagePinCode;

	}

	public void setVilleageName(String villeageName) {
		this.villeageName = villeageName;

	}

	public String getVilleageName() {
		return villeageName;
	}

	public void setVilleagePinCode(int villeagePinCode) {
		this.villeagePinCode = villeagePinCode;
	}

	public int getVilleagePinCode() {
		return villeagePinCode;
	}

	@Override
	public String toString() {
		return "VillegePincodeDTO [villeageName=" + villeageName + ", villeagePinCode=" + villeagePinCode + "]";
	}
	
	
}
