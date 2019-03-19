package com.bbowler

class Nurse {
	
	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	int nursePhone
	

    static constraints = {

	nurseName nullable:false, blank:false
	qualifications nullable:false, blank:false
	nurseEmail nullable:false, blank:false, email=true
	Nurse Office nullable:false, blank:false
	NursePhone nullable:false, blank:false
    }
}
