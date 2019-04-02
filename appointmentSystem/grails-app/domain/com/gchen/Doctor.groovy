package com.gchen

class Doctor {

String fullName
String qualification
String position
String doctorEmail 
String password
String doctorOffice 
int doctorPhone 
String bio

static hasMany =[prescription:Prescription,appointment:Appointmentm,nurse:Nurse,surgery:Surgery]

static belongsTo=[Surgery]

    static constraints = {
	fullName blank:false, nullable:false;
	qualification blank:false, nullable:false;
	position blank:false, nullable:false;
	doctorEmail blank:false, nullable:false, email:true;
	password blank:false, nullable:false;
	doctorOffice blank:false, nullable:false;
	doctorPhone blank:false, nullable:false;
	bio blank:false, nullable:false;
    }
}
