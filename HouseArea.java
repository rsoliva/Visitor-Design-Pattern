import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Composite Pattern: Composite Class
 * HouseArea is a floor (upstairs, downstairs), the house itself, or a room
 */
class HouseArea implements Serializable, iHouseEntity, iVisitee {
	
	private static final long serialVersionUID = 1L;
	
	// List of children
	private List<iHouseEntity> childGroup = new ArrayList<iHouseEntity>();
	public String blockName;
	public HouseArea(String blockName){	
		this.blockName = blockName;
	}
	
	public void add(iHouseEntity group) {
		
		//for(HouseEntity group:entity)
		childGroup.add(group);
	}
	
	public void remove(iHouseEntity group) {
		childGroup.remove(group);
	}
	
	@Override
	public void listHouseSpecs(int level) {

		// First display the current group
		StringBuffer sb = new StringBuffer();
		for(int j = 0; j < level; j++)
			sb.append("   ");
		System.out.println(sb.toString() + blockName);
		
		// Now delegate the task of display to any children
		for(iHouseEntity group: childGroup){
			group.listHouseSpecs(level+1);
		}	
	}

	@Override
	public int countContents() {
		int contents = 0;
		for(iHouseEntity child: childGroup){
			contents += child.countContents();
		}
		return contents +1;
	}

	@Override
	public void accept(iVisitor visitor) {
		visitor.visit(this);
		
	}
}
