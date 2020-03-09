package CreationalPattern;

import java.util.List;

	public class PrototypePatternTest {
		public static void test() throws CloneNotSupportedException {
			Students students = new Students();
			students.loadData();
			
			//Use the clone method to get the Employee object
			Students studentsNew = (Students) students.clone();
			Students studentsNew1 = (Students) students.clone();
			List<String> list = studentsNew.getStudentList();
			list.add("Kavya");
			List<String> list1 = studentsNew1.getStudentList();
			list1.remove("Himanshi");
			
			System.out.println("students List: "+students.getStudentList());
			System.out.println("studentsNew List: "+list);
			System.out.println("empsNew1 List: "+list1);
		}

}
