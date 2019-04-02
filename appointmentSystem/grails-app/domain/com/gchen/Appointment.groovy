package com.gchen

class Appointment {

Date appDate 
Date appTime 
int appDuration 
String roomNumber

    static constraints = {
	appDate blank:false, nullable:false;
	appTime blank:false, nullable:false;
	appDuration blank:false, nullable:false;
	roomNumber blank:false, nullable:false;
    }
}
