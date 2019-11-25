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
	public void use(TypeMsg type, String str1, String str2, String str3, Interactable object) {
		if (type == TypeMsg.HUMAN_ITEM) {
			System.out.println(str1 + object.getName() + str2 + this.getName() + str3);
		}
		if (type == TypeMsg.ITEM_HUMAN) {
			System.out.println(str1 + this.getName() + str2 + object.getName() + str3);
		}
	}
}