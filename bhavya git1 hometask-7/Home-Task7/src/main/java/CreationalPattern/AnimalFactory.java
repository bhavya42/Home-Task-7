package CreationalPattern;

public class AnimalFactory {
	public static Animal getAnimal(String name, String place){
		if("Land".equalsIgnoreCase(place)) return new LandAnimal(name, place);
		else if("Sea".equalsIgnoreCase(place)) return new SeaAnimal(name, place);
		
		return null;
	}

}
