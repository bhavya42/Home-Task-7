package CreationalPattern;


	public abstract class Animal {
		public abstract String getName();
		public abstract String getPlace();
		@Override
		public String toString() {
			return "Name=" + getName() + ", Place=" + getPlace();
		}
		

}
