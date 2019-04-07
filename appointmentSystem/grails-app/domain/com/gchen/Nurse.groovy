package com.gchen

class Nurse {

String nurseName 
String qualifications 
String nurseEmail 
String nurseOffice 
String nursePhone

static hasMany=[appointments:Appointment,surgerys:Surgery,patients:Patient,doctors:Doctor]
static belongsTo=[Appointment,Surgery,Doctor]

String toString(){
return nurseName
}

    static constraints = {
	nurseName blank:false, nullable:false;
	qualifications blank:false, nullable:false;
	nurseEmail blank:false, nullable:false, email:true;
	nurseOffice blank:false, nullable:false;
	nursePhone blank:false, nullable:false,maxSize:11;
    }
}
