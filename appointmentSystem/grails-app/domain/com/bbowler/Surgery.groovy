package com.bbowler

class Surgery {

	String name
	String address
	String postcode
	int telephone
	int numberOfPatients
	String description
	Float openingTime
	Boolean registeringNewPatients

	static hasMany=[doctors:Doctor, nurses:Nurse, receptionists:Receptionist, patients:Patient, appointments:Appointment]

	String toString(){
	return name
	}

    static constraints = {
	
	name nullable:false, blank:false
	address nullable:false, blank:false
	postcode nullable:false, blank:false
	telephone nullable:false, blank:false
	numberOfPatients nullable:false, blank:false
	description nullable:false, blank:false
	openingTime nullable:false, blank:false
	registeringNewPatients nullable:false, blank:false
    }
}
