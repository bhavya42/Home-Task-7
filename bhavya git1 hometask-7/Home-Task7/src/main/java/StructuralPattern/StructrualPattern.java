package StructuralPattern;

public class StructrualPattern {

		public static void main(String[] args) {
			System.out.println("Structural Design Pattern Examples");
			System.out.println();
			System.out.println();
			
			System.out.println("Implementing Composite Design Pattern");
			System.out.println();
			TestCompositePattern testCompositePattern = new TestCompositePattern();
			testCompositePattern.test();
			System.out.println();
			
			System.out.println("Implementing Proxy Design Pattern");
			System.out.println();
			ProxyPatternTest proxyPatternTest = new ProxyPatternTest();
			proxyPatternTest.test();
			
		}

}
