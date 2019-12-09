package interfaces;

import enums.*;

public interface Interactable {
	public String getName();
	public String use(TypeMsg type, String str1, String str2, String str3, Interactable object);
}