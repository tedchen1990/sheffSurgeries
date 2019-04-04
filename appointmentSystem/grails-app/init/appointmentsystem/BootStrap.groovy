package com.gchen

class BootStrap {

    def init = { servletContext ->
	
	/* Receptionist */
	def receptionist_A = new Receptionist
	(
	 recepName:'TedChen',
	 recepEmail:'tedchen@gmail.com',
	 recepUsername: 'b7020285',
	 recepPassword:'123456',
	 recepPhone:'07123456891'
	).save()

	def receptionist_B = new Receptionist
	(
	 recepName:'Olivia',
	 recepEmail:'olivia@gmail.com',
	 recepUsername: 'b7123456',
	 recepPassword:'123456',
	 recepPhone:'07123456946'
	).save()

	def receptionist_C = new Receptionist
	(
	 recepName:'Ruby',
	 recepEmail:'ruby@gmail.com',
	 recepUsername: 'b7223456',
	 recepPassword:'123456',
	 recepPhone:'07128963536'
	).save()

	/* Doctor */
	def doctor_A = new Doctor
	(
	 fullName:'Metthew',
	 qualification:'PHD',
	 position:'Cardiology',
	 doctorEmail:'metthew@gmail.com', 
	 password:'000000',
	 doctorOffice:'Hallam university',
	 doctorPhone:'07111111111', 
	 bio:'Very good!'
	).save()

	def doctor_B = new Doctor
	(
	 fullName:'Jacky',
	 qualification:'PHD',
	 position:'Dermatology',
	 doctorEmail:'jacky@gmail.com', 
	 password:'000000',
	 doctorOffice:'Hallam university',
	 doctorPhone:'07222222222',
	 bio:'Very good!'
	).save()

	def doctor_C = new Doctor
	(
	 fullName:'Jame',
	 qualification:'Professor',
	 position:'Ophthalmology',
	 doctorEmail:'jame@gmail.com', 
	 password:'000000',
	 doctorOffice:'Hallam university',
	 doctorPhone:'07333333333',
	 bio:'Very good!'
	).save()

	/* Patient */
	def patient_A = new Patient
	(
	 patientName:'Grace',
	 patientAddress:'grace@gmail.com',
	 patientResidence:'Sheffield',
	 patientDob:new Date('01/09/1980'),
	 patientID:'P-1',
	 dateRegistered:new Date('01/09/1980'),
	 patientPhone:'07128945778'
	).save()
	
	/* Appointment */
	def appointment_A = new Appointment
	(
	 appDate: new Date('01/04/2019'),
	 appTime:'3:00 pm',
	 appDuration:30, 
	 roomNumber:'A-9200',
	 doctor:doctor_A,
	 patient:patient_A	
	).save()

	}
    def destroy = {
    }
}
