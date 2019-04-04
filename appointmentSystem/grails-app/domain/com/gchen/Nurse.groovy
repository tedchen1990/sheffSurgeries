package com.gchen

class Nurse {

String nurseName 
String qualifications 
String nurseEmail 
String nurseOffice 
int nursePhone
Surgery surgery

static belongsTo=[Surgery]

    static constraints = {
	nurseName blank:false, nullable:false;
	qualifications blank:false, nullable:false;
	nurseEmail blank:false, nullable:false, email:true;
	nurseOffice blank:false, nullable:false;
	nursePhone blank:false, nullable:false;
    }
}
