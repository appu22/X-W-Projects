package com.xworkz.app.map.villeageandpincode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VilleagePinCodeTester {

	public static void main(String[] args) {

		Map<Integer, VillegePincodeDTO> villeage = new HashMap<Integer, VillegePincodeDTO>();

		VillegePincodeDTO mgkd = new VillegePincodeDTO(591235, "Mugalkhod");
		VillegePincodeDTO athani = new VillegePincodeDTO(591304, "Athani");
		VillegePincodeDTO harg = new VillegePincodeDTO(591322, "Harugeri");
		VillegePincodeDTO mall = new VillegePincodeDTO(591003, "Malleshwaram");
//--------add values dto to map -----------------------------------
		villeage.put(mgkd.getVilleagePinCode(), mgkd);
		villeage.put(athani.getVilleagePinCode(), athani);
		villeage.put(harg.getVilleagePinCode(), harg);
		villeage.put(mall.getVilleagePinCode(), mall);
		System.out.println("Villege list  : " + villeage);

		System.out.println("*************************************************************");
		System.out.println("All pincode list  : " + villeage.keySet());
//------printing pincode using for each and keyset		
		Set<Integer> keySet = villeage.keySet();
		for (Integer pincode : keySet) {
			System.out.println("inside for each loop pincode list --> " + pincode);
		}
		System.out.println("*************************************************************");

//		System.out.println("All Villeage List : "+villeage.values());

//		System.out.println(villeage.entrySet());

		Set<Entry<Integer, VillegePincodeDTO>> entrySet = villeage.entrySet();
		Iterator<Entry<Integer, VillegePincodeDTO>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = itr.next();
			System.out.println("Details of villege -->" + itr.next());
		}
		System.out.println("-----------------------------------------------------------");
//		
//		for (Entry<Integer, VillegePincodeDTO> val : entrySet) {
//			System.out.println("Villege PinCode : " + val.getKey());
//			System.out.println("Villege Name and Pincode   :  " + val.getValue());
//		}

	}

}
