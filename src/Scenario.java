import java.util.ArrayList;

import exceptions.*;

public class Scenario {
	private ArrayList<String> replicas = new ArrayList<String>();

	public void add(String replica) {
		replicas.add(replica);
	}

	public void get(int index) throws UncheckedScenarioException {
		if (index < 0) {
			throw new UncheckedScenarioException("\nИндекс реплики не может быть отрицательным!\n");
		}

		if (index >= replicas.size()) {
			throw new UncheckedScenarioException("\nВы еще не добавили реплику с таким номером!\n");
		}
		System.out.println(replicas.get(index));
	}
}