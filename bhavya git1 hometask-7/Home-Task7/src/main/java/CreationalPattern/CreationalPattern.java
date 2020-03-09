package CreationalPattern;

public class CreationalPattern {

		public static void main(String[] args) throws CloneNotSupportedException {
			System.out.println("Creational Pattern Examples");
			System.out.println();
			System.out.println();
			
			System.out.println("Implementing Prototype Design Pattern");
			System.out.println();
			PrototypePatternTest prototypePatternTest = new PrototypePatternTest();
			prototypePatternTest.test();
			System.out.println();
			
			System.out.println("Implementing Factory Design Pattern");
			System.out.println();
			TestFactory testFactory = new TestFactory();
			testFactory.test();
			System.out.println();
		}


}
