package items;

import enums.*;
import interfaces.*;

public class ActItem extends Item implements Interactable {
	public ActItem(String name) {
		super(name);
	}

	@Override 
	public String getName() {
		return name;
	}

	@Override
	public String use(TypeMsg type, String str1, String str2, String str3, Interactable object) {
		String result = new String();
		if (type == TypeMsg.HUMAN_ITEM) {
			result = str1 + object.getName() + str2 + this.getName() + str3;
		}
		if (type == TypeMsg.ITEM_HUMAN) {
			result = str1 + this.getName() + str2 + object.getName() + str3;
		}
		return result;
	}
}