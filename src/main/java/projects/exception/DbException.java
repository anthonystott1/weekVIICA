/**
 * 
 */
package projects.exception;

/**
 * 
 */
public class DbException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public DbException() {
		
	}

	/**
	 * @param message
	 */
	public DbException(String message) {
		super(message);
		
	}

	/**
	 * @param cause
	 */
	public DbException(Throwable cause) {
		super(cause);
		
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DbException(String message, Throwable cause) {
		super(message, cause);

	}

}
