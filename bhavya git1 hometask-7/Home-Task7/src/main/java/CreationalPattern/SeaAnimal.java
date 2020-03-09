package CreationalPattern;

public class SeaAnimal extends Animal{

		private String name;
		private String place;
		
		public SeaAnimal(String name, String place) {
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
