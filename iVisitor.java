//import composite.Furniture;
//import composite.HouseArea;

public interface iVisitor {
	public void visit(HouseArea houseEntity);
	public void visit(Furniture furniture);
}
