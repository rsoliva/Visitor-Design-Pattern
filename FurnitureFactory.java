

public class FurnitureFactory extends HouseFactory{
		@Override
		public iHouseEntity createHouse(String item) {
			
			if (item.equals("Sink")) {
				return new Furniture("Sink", 100);
			} else if (item.equals("Counter")) {
				return new Furniture("Counter",200);
			} else if (item.equals("Bed")) {
				return new Furniture("Bed",300);
			} else if (item.equals("Dresser")) {
				return new Furniture("Dresser",250);
			} else if (item.equals("Bathtub")) {
				return new Furniture("Bathtub",200);
			} else return null;
			
		}
}

