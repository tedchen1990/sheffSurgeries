package com.gchen

class Doctor {
String username
String fullName
String qualification
String position
String doctorEmail 
String password
String doctorOffice 
String doctorPhone 
String bio

static hasMany=[appointments:Appointment,prescriptions:Prescription,surgerys:Surgery]
static belongsTo=[Appointment,Surgery]
 
String toString(){
return fullName
}

    static constraints = {
	username blank:false, nullable:false,unique:true;
	fullName blank:false, nullable:false;
	qualification blank:false, nullable:false;
	position blank:false, nullable:false;
	doctorEmail blank:false, nullable:false, email:true;
	password blank:false, nullable:false;
	doctorOffice blank:false, nullable:false;
	doctorPhone blank:false, nullable:false;
	bio blank:false, nullable:false,widget:'textarea';
    }
}
