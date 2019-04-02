package com.gchen

class Appointment {

Date appDate 
Date appTime 
int appDuration 
String roomNumber

Doctor doctor 
Patient patient
static hasMany=[surgery:Surgery] 
 
    static constraints = {
	appDate blank:false, nullable:false;
	appTime blank:false, nullable:false;
	appDuration blank:false, nullable:false;
	roomNumber blank:false, nullable:false;
	patient blank:false, nullable:false;
	prescriptions blank:false, nullable:false;
	surgeries blank:false, nullable:false;
    }
}
