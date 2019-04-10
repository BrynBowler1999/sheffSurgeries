package com.bbowler

class BootStrap {

    def init = { servletContext ->

	def doctorTom=new Doctor(
	fullName: 'Tom Skill',
	qualification: 'PHD',
	position: 'Dr',
	doctorEmail: 'skillbean@mail.com',
	password: 'ayylmao',
	doctorOffice: '505',
	doctorPhone: '01246234621',
	bio: 'Dr Tom').save()

	def doctorMike=new Doctor(
	fullName: 'Mike T',
	qualification: 'PHD',
	position: 'Dr',
	doctorEmail: 'MikeT@mail.com',
	password: 'ayy',
	doctorOffice: '500',
	doctorPhone: '01246234621',
	bio: ' Dr Mike').save()

	def diazepam=new Prescription(
	pharmacyName: 'Abbydale Pharmacy',
	prescripNumber: '1',
	medicine: 'Diazepam',
	totalCost: 8.50,
	dateIssued: new Date('15/03/2019'),
	patientPaying: true).save()

	def paracetemol=new Prescription(
	pharmacyName: 'Abbydale Pharmacy',
	prescripNumber: '2',
	medicine: 'Paracetemol',
	totalCost: 2.50,
	dateIssued: new Date('16/03/2019'),
	patientPaying: true).save()

	def joeGlover=new Patient(
	patientName: 'Joe Glover',
	patientAddress: '31 Fentonville Street',
	patientResidence: 'Sheffield',
	patientDob: new Date('12/01/1999'),
	patientID: 'E25555',
	dateRegistered: new Date('26/02/2018'),
	patientPhone: '01246234622').save()

	def brynBowler=new Patient(
	patientName: 'Bryn Bowler',
	patientAddress: '32 Fentonville Street',
	patientResidence: 'Sheffield',
	patientDob: new Date('08/01/1999'),
	patientID: 'E25543',
	dateRegistered: new Date('22/02/2018'),
	patientPhone: '01246234623').save()

	def nurseJoy=new Nurse(
	nurseName: 'Joy Nurse',
	qualifications: 'A-Level',
	nurseEmail: 'NurseJoy@mail.com',
	nurseOffice: '504',
	nursePhone: '01246234620').save()

	def nurseJay=new Nurse(
	nurseName: 'Jay Nurse',
	qualifications: 'A-Level',
	nurseEmail: 'NurseJay@mail.com',
	nurseOffice: '823',
	nursePhone: '01246234098').save()
	
	def Cantor=new Surgery(
	name: 'Cantor Surgery',
	address: '31 Cantor Street',
	postcode: 'S417AF',
	telephone: '01346234675',
	numberOfPatients: '200',
	description: 'Cantor Surgery',
	openingTime: 08.00,
	registeringNewPatients: true).save()

	def sharrowSurgery=new Surgery(
	name: 'Sharrow Surgery',
	address: '31 Sharrow Street',
	postcode: 'S517BC',
	telephone: '01346234828',
	numberOfPatients: '50',
	description: 'Sharrow Surgery',
	openingTime: 09.00,
	registeringNewPatients: true).save()

	def edBee=new Receptionist(
	recepName: 'Ed Bee',
	recepEmail: 'edbee@mail.com',
	recepUsername: 'edbee',
	recepPassword: 'abc123',
	recepPhone: '02738291756').save()

	def kylanBH=new Receptionist(
	recepName: 'Kylan Barker-Hill',
	recepEmail: 'Kylan@mail.com',
	recepUsername: 'kylanBH',
	recepPassword: 'abc098',
	recepPhone: '02738361756').save()

	def brokenArm=new Appointment(
	appDate: new Date('03/03/2019'),
	appTime: 8.00,
	appDuration: 30,
	roomNumber: 'A12354').save()

	def brokenLeg=new Appointment(
	appDate: new Date('05/03/2019'),
	appTime: 12.00,
	appDuration: 30,
	roomNumber: 'A12654').save() 
	
    }
    def destroy = {
    }
}
