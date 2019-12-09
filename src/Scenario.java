import java.util.ArrayDeque;

import exceptions.*;

public class Scenario {
	private ArrayDeque<String> replicas = new ArrayDeque<String>();

	public void add(String replica) {
		replicas.add(replica);
	}

	public String getString() {
		String result = new String();

		for(String replica : replicas){
          result = result + replica;
        }

        return result;
	}
}