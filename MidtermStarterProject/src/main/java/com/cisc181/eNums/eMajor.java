package com.cisc181.eNums;

public enum eMajor {
BUSINESS(1), COMPSI(2),CHEM(3), PHYSICS(3), NURSING(4);
	
	public int number;
	
	private eMajor(final int number){
		this.number = number;
	}
}
