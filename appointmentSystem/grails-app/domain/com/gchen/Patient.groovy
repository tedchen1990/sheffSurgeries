package com.gchen

class Patient {
String patientName 
String patientAddress 
String patientResidence 
Date patientDob 
String patientID 
Date dateRegistered 
String patientPhone
Appointment appointment
static hasMany=[surgery:Surgery,prescriptions:Prescription]
static belongsTo=[Surgery,Appointment,Prescription]

String toString(){
return patientName
}

    static constraints = {
	patientName blank:false, nullable:false;
	patientAddress blank:false, nullable:false;
	patientResidence blank:false, nullable:false;
	patientDob blank:false, nullable:false;
	patientID blank:false, nullable:false,unique:true;
	dateRegistered blank:false, nullable:false;
	patientPhone blank:false, nullable:false,maxSize:11;
	appointment blank:true,nullable:true;
    }
}
