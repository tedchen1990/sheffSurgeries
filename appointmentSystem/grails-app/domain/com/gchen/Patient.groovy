package com.gchen

class Patient {

String patientName 
String patientAddress 
String patientResidence 
Date patientDob 
String patientID 
Date dateRegistered 
String patientPhone
static hasMany=[surgery:Surgery ,appointments:Appointment]
static belongsTo=[Appointment,Surgery]

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
    }
}
