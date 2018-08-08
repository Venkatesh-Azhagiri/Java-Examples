package mapListExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Eg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, List<Model>> map = new HashMap<String, List<Model>>();
		List<Model> modelList = new ArrayList<Model>();
		Model model = new Model();
		model.setYear(2007);
		model.setCount(115);
		
		Model model1 = new Model();
		model1.setYear(2012);
		model1.setCount(50);
		
		modelList.add(model);
		modelList.add(model1);
		map.put("Angiogenesis", modelList);
		System.out.println("test");
		for(Map.Entry<String, List<Model>> m : map.entrySet()){
			System.out.println("key****"+m.getKey());
			/*for(Model a: m.getValue()){
				System.out.println("model****"+model.getYear() + "****"+model.getCount());
			}*/
			List<Model> md = (List<Model>) m.getValue();
			for(Model mdl : md)
			System.out.println("value****"+mdl.getYear() + "*********"+mdl.getCount());
		}
		

	}

}
