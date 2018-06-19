import java.io.Serializable;
import java.util.List;

/**
 * 
 * Composite pattern:  Leaf node
 */
class Furniture implements Serializable, iHouseEntity, iVisitee {
	private static final long serialVersionUID = 1L;
	String blockName;
	int value;
	public Furniture(String blockName, int value){
		this.blockName = blockName;
		this.value = value;
	}
	
 	@Override
	public void listHouseSpecs(int level) {
		StringBuffer sb = new StringBuffer();
		for(int j = 0; j < level; j++)
			sb.append("   ");			
		System.out.println(sb.toString() + blockName);		
	}

	@Override
	public int countContents() {
		return 1;
	}


	public int getValue() {
		return value;
	}

	@Override
	public void accept(iVisitor visitor) {
		visitor.visit(this);
		
	}

	@Override
	public void add(iHouseEntity block) {
		// TODO Auto-generated method stub
		
	} 
}