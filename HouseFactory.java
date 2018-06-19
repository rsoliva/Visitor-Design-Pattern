import java.util.ArrayList;
import java.util.List;

public abstract class HouseFactory {
	
	abstract iHouseEntity createHouse(String item);
	
	public iHouseEntity buildHouse(String type){

		iHouseEntity house = createHouse(type);
        return house;
	
     }
 }

