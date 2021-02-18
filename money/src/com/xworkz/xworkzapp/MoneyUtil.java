package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.money.Money;

public class MoneyUtil {

	public static void main(String[] args) {
		Money money = new Money("ED010000001","Note");
		//money.searialNo="ED10000000D1";
		//money.type="note";
		System.out.println(money.type+" Searial Number "+money.searialNo);
		
		
	}

}
