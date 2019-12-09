package items;

import interfaces.*;

public class NonActItem extends Item implements NonInteractable {
	public NonActItem(String name) {
		super(name);
	}

	@Override
	public String use(String str1, String str2) {
		return str1 + getName() + str2;
	}
}