package com.example.hospital_appointment_system;
import com.amazonaws.services.sqs.model.Message;
import com.example.hospital_appointment_system.Appointment.appointment;
import com.example.hospital_appointment_system.DAO.Appointment_DAO;
import com.example.hospital_appointment_system.DAO.Login_DAO;
import com.example.hospital_appointment_system.DAO.Patient_DAO;
import com.example.hospital_appointment_system.Patient.Patient;
import com.example.hospital_appointment_system.Queue.sqsQueue;
import com.example.hospital_appointment_system.Mail.SendMail;
import com.example.hospital_appointment_system.Receptionist.Receptionist;
import java.util.List;

public class Main {
    public static void main(String []args) throws Exception
    {
//        Patient patient=new Patient();
//        Patient_DAO patient_dao=new Patient_DAO();

//          Login_DAO login_dao=new Login_DAO();
//          login_dao.hashPasswordMatch("doctorA");
//        login_dao.hashPasswordMatch("doctorA");
//        login_dao.hashPasswordMatch("doctorA");

//        sqsQueue SQS =new sqsQueue();
//        SQS.deleteAllMessages("doctorA");

//        Details details=new Details();
//        details.setPatient_name("Daniyal");
//        details.setReason("Any reason");
//        details.setAge(22);
//        details.setEmail("test@test.com");
//        details.setDoc_code('A');
//
//        Receptionist receptionist=new Receptionist();
//        receptionist.newPatient(details);



//        System.out.println(receptionist.);
//        System.out.println(receptionist.generate_waitingTime("doctorA"));

        //patient_dao.addPatient(patient);

//        sqsQueue SQS=new sqsQueue();
//        SQS.getQueueUrl("doctorA");


//        Appointment_DAO ap=new Appointment_DAO();
//        System.out.println(ap.returnToken())    ;

//        Patient patient=new Patient();
//        patient.setName("Test123");
//        patient.setEmail("test@gmail.com");
//        patient.setAge(23);
//        patient.setId("PAT-0121");
//
//        Patient_DAO patient_dao=new Patient_DAO();
//        patient_dao.addPatient(patient);

//        sqsQueue SQS=new sqsQueue();
//        SQS.readMessage("doctorA");
//
//        appointment app=new appointment();
//        app.setDate();


//        System.out.println("Reading All Messages....");
//        SQS.readAllMessage("doctorA");
//        Thread.sleep(2*1000);
//        System.out.println("Printing waiting time");
//        System.out.println(receptionist.generate_waitingTime("doctorA"));
//        System.out.println("Reading the top most message....");
//        String receiptHandle=SQS.readMessage("doctorA");
//        Thread.sleep(2*1000);
//        SQS.deleteMessage("doctorA",receiptHandle);
//        SQS.readAllMessage("doctorA");
//        SQS.deleteAllMessages("doctorA");



        //Thread.sleep(10*1000);
        //SQS.readMessage("doctorA");

//        String text="testing";
//        String recipient="m.ali.ather786@gmail.com";
//        SendMail.sendEmail(recipient,text);

    }
}
