package CreationalPattern;

public class TestFactory {
		public static void test() {
			Animal cow = AnimalFactory.getAnimal("cow", "land");
			Animal fish = AnimalFactory.getAnimal("fish", "sea");
			System.out.println("Factory Land Config ::" + cow);
			System.out.println("Factory Sea Config ::" + fish);
		}

}
