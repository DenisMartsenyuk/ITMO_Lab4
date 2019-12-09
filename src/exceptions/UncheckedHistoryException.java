package exceptions;

public class UncheckedHistoryException extends ArrayIndexOutOfBoundsException {
	public UncheckedHistoryException(String message) {
		super(message);
	}
}