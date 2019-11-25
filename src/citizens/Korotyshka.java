package citizens;

import interfaces.*;
import enums.*;

public class Korotyshka implements Interactable {
	private String name;
	private LifeStyle style;

	public Korotyshka(String name, LifeStyle style) {
		this.name = name;
		this.style = style;
	}

	public class Organ {
		private String name;

		public String getName() {
			return name;
		}

		public Organ(String name) {
			this.name = name;
		}

		public void process(String str1, String str2, String str3) {
			System.out.println(str1 + Korotyshka.this.getName() + str2 + this.getName() + str3);
		}
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

	public void setStyle(LifeStyle style) {
		this.style = style;
	}

	public LifeStyle getStyle() {
		return style;
	}

	public void process(String str1, String str2) {
		System.out.println(str1 + getName() + str2);
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "[name=" + name + ", style=" + style +"]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null || obj.getClass() != this.getClass()) {
            return false;
		}

		Korotyshka person = (Korotyshka) obj;
		return (name == person.getName() || (name != null && name.equals(person.getName())))
		     &&(style == person.getStyle() || (style != null && style.equals(person.getStyle())));
    }

    @Override
    public int hashCode() {
    	final int PRIME = 17;
    	int hash = 37;
    	hash = hash * PRIME + ((name == null) ? 0 : name.hashCode());
    	hash = hash * PRIME + ((style == null) ? 0 : style.hashCode());
    	return hash;
    }
}