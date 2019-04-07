package com.gchen

class Surgery {

String name
String address
String postcode
String telephone
int numberOfPatients
String description
String openingTime

static hasMany=[appointments:Appointment,doctors:Doctor,nurses:Nurse,receptionists:Receptionist,patients:Patient]
static belongsTo=[Appointment]
String toString(){
return name
}

    static constraints = {
	name blank:false, nullable:false;
	address blank:false, nullable:false;
	postcode blank:false, nullable:false;
	telephone blank:false, nullable:false;
	numberOfPatients blank:false, nullable:false;
	description blank:true, nullable:true;
	openingTime blank:false, nullable:false;
    }
}
