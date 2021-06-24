package nenriki;

import java.util.List;

import com.company.data.PostgresDB;
import com.company.interfaces.IDB;

import nenriki.controller.NecklaceController;
import nenriki.entity.IStone;
import nenriki.entity.Necklace;

public class Main {
	public static void main(String[] args) {
		IDB idb = new PostgresDB();
		NecklaceController controller = new NecklaceController(idb);
		List<IStone> list = controller.getAllPrecious();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
			System.out.println("----------------------");
		}
		Necklace necklace = new Necklace(1, "Nur-Sultan", "hight");
		necklace.setNumberOfPrecious(list);
		necklace.setNumberOfSemiPrecious(list);
		int sum = necklace.calculateTotalWeight();
		System.out.println("Total weight: " + sum);
		
	}
}
