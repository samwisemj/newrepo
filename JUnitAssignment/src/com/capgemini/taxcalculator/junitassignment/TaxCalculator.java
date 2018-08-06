//class to calculate taxes
package com.capgemini.taxcalculator.junitassignment;

import com.capgemini.taxcalculator.junitassignment.exceptions.*;

public class TaxCalculator {

	//calculates taxes based on slabs
	public double calculateTax(String name, double empSal, boolean isIndian) throws Exception {
		double taxAmount=0.0;
		try {
			if (!isIndian)
				throw new CountryNotValidException();
			if(name==null)
				throw new EmployeeNameInvalidExceptions();
			
			if(empSal>1_00_000.00 && isIndian)
				taxAmount=empSal*0.08;
			else if(empSal>=50_000.00 && empSal<1_00_000.00  && isIndian)
				taxAmount=empSal*0.06;
			else if(empSal>=30_000.00 && empSal<50_000.00  && isIndian)
				taxAmount=empSal*0.05;
			else if(empSal>=10_000.00 && empSal<30_000.00  && isIndian)
				taxAmount=empSal*0.04;
			else 
				throw new TaxNotEligibleException();
		} catch (Exception e) {
			System.out.println(e);
		}
		return taxAmount;
	}

}
