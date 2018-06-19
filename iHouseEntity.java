
public interface iHouseEntity extends iVisitee {
	public void listHouseSpecs(int level);
	public int countContents();
	public String toString();
	public void add(iHouseEntity block);
}
