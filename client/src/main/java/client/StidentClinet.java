package client;

import dbimpl.StudentDbService;
import model.Student;
import service.StudentService;

public class StidentClinet {
	public static void main(String[] args) {
		StudentService service = new StudentDbService();
		service.create(new Student());
		service.read("17SS0001");
		service.update(new Student());
		service.delete("17SS0001");
	}
}
