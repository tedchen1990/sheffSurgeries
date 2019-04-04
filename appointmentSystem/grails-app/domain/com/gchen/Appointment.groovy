package com.gchen

class Appointment {

Date appDate 
String appTime 
int appDuration 
String roomNumber
Doctor doctor
Patient patient
static hasMany =[nurse:Nurse,surgery:Surgery]

    static constraints = {
	appDate blank:false, nullable:false;
	appTime blank:false, nullable:false;
	appDuration blank:false, nullable:false;
	roomNumber blank:false, nullable:false;
    }
}
