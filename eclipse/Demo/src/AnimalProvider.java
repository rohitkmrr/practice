
public enum AnimalProvider implements Animal {

	CAT {

		@Override
		public int legs() {
			return 10;
		}

		@Override
		public String name1() {
			return this.name();
		}
	};
	
	
}
