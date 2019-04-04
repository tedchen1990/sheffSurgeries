package com.gchen

class Patient {

String patientName 
String patientAddress 
String patientResidence 
Date patientDob 
String patientID 
Date dateRegistered 
String patientPhone
Surgery surgery

static hasMany=[prescription:Prescription]

    static constraints = {
	patientName blank:false, nullable:false;
	patientAddress blank:false, nullable:false;
	patientResidence blank:false, nullable:false;
	patientDob blank:false, nullable:false;
	patientID blank:false, nullable:false;
	dateRegistered blank:false, nullable:false;
	patientPhone blank:false, nullable:false;
    }
}
