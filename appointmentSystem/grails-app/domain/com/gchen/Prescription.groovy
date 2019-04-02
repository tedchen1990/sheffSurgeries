package com.gchen

class Prescription {
  
String pharmacyName 
int prescripNumber 
String medicine 
double totalCost 
Date dateIssued 
Boolean patientPaying

Patient patient 
Doctor doctor

    static constraints = {
	pharmacyName blank:false, nullable:false;
	prescripNumber blank:false, nullable:false;
	medicine blank:false, nullable:false;
	totalCost blank:false, nullable:false;
	dateIssued blank:false, nullable:false;
	patientPaying blank:false, nullable:false;
	patient blank:false, nullable:false;
	doctor blank:false, nullable:false;
    }
}
