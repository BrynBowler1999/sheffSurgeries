package com.bbowler

class Appointment {
	
	Date appDate
	Float appTime
	int appDuration
	String roomNumber 

	static hasMany=[surgeries:Surgery]
	static belongsTo=[Surgery]

    static constraints = {

	appDate nullable:false, blank:false
	appTime nullable:false, blank:false
	appDuration nullable:false, blank:false
	roomNumber nullable:false, blank:false
    }
}
