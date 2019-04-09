package com.gchen

class Prescription {
  
String pharmacyName 
String prescripNumber 
String medicine 
double totalCost 
Date dateIssued 
Boolean patientPaying
Doctor doctor
static hasMany=[patients:Patient]
static belongsTo=[Doctor]

String toString(){
return pharmacyName
}

    static constraints = {
	pharmacyName blank:false, nullable:false;
	prescripNumber blank:false, nullable:false,unique:true;
	medicine blank:false, nullable:false;
	totalCost blank:false, nullable:false;
	dateIssued blank:false, nullable:false;
	patientPaying blank:false, nullable:false;
    }
}
