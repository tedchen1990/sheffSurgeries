package com.gchen

class Receptionist {

String recepName
String recepEmail   
String recepUsername 
String recepPassword
String recepPhone

static hasMany=[appointments:Appointment,surgerys:Surgery]
static belongsTo=[Surgery]

String toString(){
return recepName
}

    static constraints = {
	recepName blank:false, nullable:false;
	recepEmail blank:false, nullable:false, email:true;
	recepUsername blank:false, nullable:false;
	recepPassword blank:false, nullable:false;
	recepPhone blank:false, nullable:false;
    }
}
