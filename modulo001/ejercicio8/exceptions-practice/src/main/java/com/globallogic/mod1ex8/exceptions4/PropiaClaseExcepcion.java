package com.globallogic.mod1ex8.exceptions4;

public class PropiaClaseExcepcion {

	public static void main(String[] args) throws MiExcepcion {
    	try {
    		
    		int money = 0;
    		
    		if (money - 1 < 0) {
    			throw new MiExcepcion();
    		}
 		
    	} finally {
            System.exit(0);
    	}
	}

}
