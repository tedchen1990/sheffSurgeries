package com.gchen

class Appointment {
int appID
Date appDate 
String appTime 
int appDuration 
String roomNumber
 
static hasMany=[surgerys:Surgery,doctors:Doctor,patients:Patient]

String toString(){
return appDate
}

    static constraints = {
	appID blank:false, nullable:false,unique:true;
	appDate blank:false, nullable:false;
	appTime blank:false, nullable:false;
	appDuration blank:false, nullable:false;
	roomNumber blank:false, nullable:false;
    }
}
