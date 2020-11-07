#patient-enrollment-service This service possesses CRUD operations to enroll and withdraw patient enrollment. Sample request JSONs

POST hms/registerPatient :
{ "adharCardNumber": "111122223333", "patientName": "Vishal Rajapure", "mobileNumber": "9960743366", "bloodGroup": "B_POSITIVE", "gender": "MALE", "address": { "addressLine": "Kharadi", "city": "Pune", "zipCode": "411014", "country": "INDIA" }, "password": "vishal@123", "emergencyNumber": "9960743366" }

GET hms/getPatient/111122223333
DELETE /hms/deletePatient/111122223333
UPDATE /hms/updatePatient/754833386685
{ "adharCardNumber": "754833386685", "patientName": "Vishal Rajapure", "mobileNumber": "9960743366", "bloodGroup": "B_POSITIVE", "gender": "MALE", "address": { "addressLine": "Kharadi", "city": "Pune", "zipCode": "411014", "country": "INDIA" }, "password": "vishal@123", "emergencyNumber": "9960743366" }