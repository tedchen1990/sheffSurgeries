package com.gchen

class BootStrap {

    def init = { servletContext ->
	
	/* Receptionist */
	def receptionist_A = new Receptionist
	(
	 recepName:'ReceptionCentre101',
	 recepEmail:'receptionCentre101@gmail.com',
	 recepUsername: 'b7020285',
	 recepPassword:'123456',
	 recepPhone:'07777777777'
	).save()

	def receptionist_B = new Receptionist
	(
	 recepName:'ReceptionCentre102',
	 recepEmail:'receptionCentre102@gmail.com',
	 recepUsername: 'b7123456',
	 recepPassword:'123456',
	 recepPhone:'07777777777'
	).save()

	def receptionist_C = new Receptionist
	(
	 recepName:'ReceptionCentre103',
	 recepEmail:'receptionCentre103@gmail.com',
	 recepUsername: 'b7000000',
	 recepPassword:'123456',
	 recepPhone:'07777777777'
	).save()

	/* Doctor */
	def doctor_A = new Doctor
	(
	 username:'M11',
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
	 username:'J11',
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
	 username:'J12',
	 fullName:'Jame',
	 qualification:'Professor',
	 position:'Ophthalmology',
	 doctorEmail:'jame@gmail.com', 
	 password:'000000',
	 doctorOffice:'Hallam university',
	 doctorPhone:'07333333333',
	 bio:'Very good!'
	).save()

	/* Nurse */
	def nurse_A = new Nurse
	(
	 nurseName:'Aston',
	 qualifications:'A-level', 
	 nurseEmail:'aston@gmial.com',
	 nurseOffice :'hallam university', 
	 nursePhone:'07433333333'
	).save()

	def nurse_B = new Nurse
	(
	 nurseName:'Miki',
	 qualifications:'A-level', 
	 nurseEmail:'miki@gmial.com',
	 nurseOffice :'hallam university', 
	 nursePhone:'07433333331'
	).save()

	def nurse_C = new Nurse
	(
	 nurseName:'Seoiy',
	 qualifications:'A-level', 
	 nurseEmail:'seoiy@gmial.com',
	 nurseOffice :'hallam university', 
	 nursePhone:'07433333332'
	).save()

	/* Appointment */
	def appointment_A = new Appointment
	(
	 appDate: new Date('01/04/2019'),
	 appTime:'3:00 pm',
	 appDuration:30, 
	 roomNumber:'A-9200'
	).save()

	def appointment_B = new Appointment
	(
	 appDate: new Date('01/9/2019'),
	 appTime:'9:00 pm',
	 appDuration:30, 
	 roomNumber:'A-9211'
	).save()

	def appointment_C = new Appointment
	(
	 appDate: new Date('01/5/2019'),
	 appTime:'9:00 pm',
	 appDuration:30, 
	 roomNumber:'A-9288'
	).save()

	/* Patient */
	def patient_A = new Patient
	(
	 patientName:'Grace',
	 patientAddress:'Central quay',
	 patientResidence:'Sheffield',
	 patientDob:new Date('01/09/1980'),
	 patientID:'P-1',
	 dateRegistered:new Date('01/09/1980'),
	 patientPhone:'07128945778',
	 appointment:appointment_A
	).save()

	def patient_B = new Patient
	(
	 patientName:'Miles',
	 patientAddress:'Central quay',
	 patientResidence:'Sheffield',
	 patientDob:new Date('01/09/1998'),
	 patientID:'P-2',
	 dateRegistered:new Date('01/09/1980'),
	 patientPhone:'07125245778',
	 appointment:appointment_B
	).save()

	def patient_C = new Patient
	(
	 patientName:'lisy',
	 patientAddress:'Central quay',
	 patientResidence:'Sheffield',
	 patientDob:new Date('01/05/1994'),
	 patientID:'P-3',
	 dateRegistered:new Date('01/09/1980'),
	 patientPhone:'07125855778',
	 appointment:appointment_C
	).save()

	/* Surgery */
	def surgery_A = new Surgery
	(
	 name:'Free skin graft',
	 address:'Hallam sheffield',
	 postcode:'S1 1WB',
	 telephone:'44(0)114 225 5555',
	 numberOfPatients:4,
	 description:'Removing healthy skin from part of body to repair damaged areas',
	 openingTime:'9:00-17:00 hrs'
	).save()

	def surgery_B = new Surgery
	(
	 name:'Mastectomy',
	 address:'Hallam sheffield',
	 postcode:'S1 1WB',
	 telephone:'44(0)114 225 5555',
	 numberOfPatients:6,
	 description:'Removing all or part of breast',
	 openingTime:'11:00-16:00 hrs'
	).save()

	def surgery_C = new Surgery
	(
	 name:'Eyes cure',
	 address:'Hallam sheffield',
	 postcode:'S1 1WB',
	 telephone:'44(0)114 225 5555',
	 numberOfPatients:6,
	 description:'Correct eyes',
	 openingTime:'13:00-18:00 hrs'
	).save()

	/* Prescription */
	def prescription_A = new Prescription
	(
	 pharmacyName:'YYS',
	 prescripNumber:'NHS-100',
	 medicine:'Good',
	 totalCost :150.00,
	 dateIssued :new Date('01/9/2026'),
	 patientPaying:false,
	 doctor:doctor_A
	).save()

	def prescription_B = new Prescription
	(
	 pharmacyName:'USO',
	 prescripNumber:'NHS-116',
	 medicine :'Good',
	 totalCost :98.00,
	 dateIssued :new Date('01/4/2026'),
	 patientPaying:true,
	 doctor:doctor_B
	).save()
	 
	def prescription_C = new Prescription
	(
	 pharmacyName:'REDS',
	 prescripNumber:'NHS-156',
	 medicine :'Good',
	 totalCost :97.00,
	 dateIssued :new Date('01/7/2026'),
	 patientPaying:true,
	 doctor:doctor_C
	).save()

	surgery_A.addToReceptionists(receptionist_A)
	surgery_B.addToReceptionists(receptionist_B)
	surgery_C.addToReceptionists(receptionist_C)

	surgery_A.addToDoctors(doctor_A)
	surgery_B.addToDoctors(doctor_B)
	surgery_C.addToDoctors(doctor_C)
	
	surgery_A.addToNurses(nurse_A)
	surgery_B.addToNurses(nurse_B)
	surgery_C.addToNurses(nurse_C)

	surgery_A.addToPatients(patient_A)
	surgery_B.addToPatients(patient_B)
	surgery_C.addToPatients(patient_C)

	appointment_A.addToSurgerys(surgery_A)
	appointment_B.addToSurgerys(surgery_B)
	appointment_C.addToSurgerys(surgery_C)

	appointment_A.addToNurses(nurse_A)
	appointment_B.addToNurses(nurse_B)
	appointment_C.addToNurses(nurse_C)

	appointment_A.addToDoctors(doctor_A)
	appointment_B.addToDoctors(doctor_B)
	appointment_C.addToDoctors(doctor_C)

	appointment_A.addToReceptionists(receptionist_A)
	appointment_B.addToReceptionists(receptionist_B)
	appointment_C.addToReceptionists(receptionist_C)

	doctor_A.addToPrescriptions(prescription_A)
	doctor_B.addToPrescriptions(prescription_B)
	doctor_C.addToPrescriptions(prescription_C)

	doctor_A.addToPatients(patient_A)
	doctor_B.addToPatients(patient_B)
	doctor_C.addToPatients(patient_C)

	doctor_A.addToNurses(nurse_A)
	doctor_B.addToNurses(nurse_B)
	doctor_C.addToNurses(nurse_C)

	nurse_A.addToPatients(patient_A)
	nurse_B.addToPatients(patient_B)
	nurse_C.addToPatients(patient_C)

	patient_A.addToPrescriptions(prescription_A)
	patient_B.addToPrescriptions(prescription_B)
	patient_C.addToPrescriptions(prescription_C)

	}
    def destroy = {
    }
}
