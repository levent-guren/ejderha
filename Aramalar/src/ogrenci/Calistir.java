package ogrenci;

import java.util.List;

public class Calistir {
	public static void main(String[] args) {
	// @formatter:off
		List<Student> students = List.of(
			    new Student("Ahmet", 70),
			    new Student("Ayşe", 85),
			    new Student("Mehmet", 90),
			    new Student("Zeynep", 60),
			    new Student("Ali", 75)
		);
	// @formatter:on
		System.out.println(students.stream().mapToInt(s -> s.getGrade()).average().getAsDouble());
		System.out.println(students.stream().filter(s -> s.getGrade() > 70).mapToInt(s -> s.getGrade()).sum());
	}

}
