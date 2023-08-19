package client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import base.Chicken;
import dbimpl.StudentDbService;
import model.Student;
import service.StudentService;

public class StudentClient {
	private static final Logger logger = LogManager.getLogger(StudentClient.class);

	public StudentClient() {
		logger.info("StudentClient start");

	}

	public static void main(String[] args) {
		StudentClient studentClient = new StudentClient();
		studentClient.chickenTest();

	}

	public void studentTest(){
		StudentService service = new StudentDbService();
		service.create(new Student());
		service.read("17SS0001");
		service.update(new Student());
		service.delete("17SS0001");
	}

	public void chickenTest(){
		logger.info("chickenTest start");
		Chicken chicken =new Chicken("Very delicious");
	}

}
