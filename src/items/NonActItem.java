package items;

import interfaces.*;

public class NonActItem extends Item implements NonInteractable {
	public NonActItem(String name) {
		super(name);
	}

	@Override
	public void use(String str1, String str2) {
		System.out.println(str1 + getName() + str2);
	}
}