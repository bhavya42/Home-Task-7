package CreationalPattern;

public class LandAnimal extends Animal{
		private String name;
		private String place;
		public LandAnimal(String name, String place) {
			super();
			this.name = name;
			this.place = place;
		}
		@Override
		public String getName() {
			return this.name;
		}
		@Override
		public String getPlace() {
			return this.place;
		}

}
