package com.gchen

class Receptionist {

String recepName
String recepEmail   
String recepUsername 
String recepPassword
String recepPhone

static hasMany=[surgerys:Surgery]
static belongsTo=[Surgery]

String toString(){
return recepName
}

    static constraints = {
	recepName blank:false, nullable:false;
	recepEmail blank:false, nullable:false, email:true;
	recepUsername blank:false, nullable:false,unique:true;
	recepPassword blank:false, nullable:false;
	recepPhone blank:false, nullable:false;
    }
}
