package items;

public abstract class Item {
	public String name;

	public Item(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "[name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null || obj.getClass() != this.getClass()) {
            return false;
		}

		Item thing = (Item) obj;
		return name == thing.getName() || (name != null && name.equals(thing.getName()));
    }

    @Override
    public int hashCode() {
    	final int PRIME = 17;
    	int hash = 37;
    	hash = hash * PRIME + ((name == null) ? 0 : name.hashCode());
    	return hash;
    }
}