package com.gchen

class Appointment {

Date appDate 
String appTime 
int appDuration 
String roomNumber

static hasMany=[surgerys:Surgery,doctors:Doctor,nurses:Nurse,patients:Patient]


String toString(){
return appDate
}

    static constraints = {
	appDate blank:false, nullable:false;
	appTime blank:false, nullable:false;
	appDuration blank:false, nullable:false;
	roomNumber blank:false, nullable:false;
    }
}
