package test;

public class TestUtil {

	public static void sleep(final long millis) throws IllegalArgumentException {
		try {
			Thread.sleep(millis);
		} catch (final InterruptedException e) {

		}
	}
	
}
