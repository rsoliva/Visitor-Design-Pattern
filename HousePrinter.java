
public class HousePrinter implements iVisitor {

	@Override
	public void visit(HouseArea houseEntity) {
		System.out.println("House area: " + houseEntity.toString());
		
	}

	@Override
	public void visit(Furniture furniture) {
		System.out.print("Furniture: " + furniture.toString());
		System.out.println(" valued at: " + furniture.getValue());
		
	}

}
