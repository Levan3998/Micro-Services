package bgu.spl.mics;

import java.util.concurrent.TimeUnit;

/**
 * A Future object represents a promised result - an object that will
 * eventually be resolved to hold a result of some operation. The class allows
 * Retrieving the result once it is available.
 *
 * Only private methods may be added to this class.
 * No public constructor is allowed except for the empty constructor.
 */
public class Future<T> {

	private T res;
	/**
	 * This should be the the only public constructor in this class.
	 */
	public Future() {
		//TODO: implement this
		res = null;
	}

	/**
     * retrieves the result the Future object holds if it has been resolved.
     * This is a blocking method! It waits for the computation in case it has
     * not been completed.
     * <p>
     * @return return the result of type T if it is available, if not wait until it is available.
     *
	 * @ pre 	res == null
	 * @ inv 	res== null && get().State == Waiting
	 * @ post 	this.res != null
     */
	public T get() {
		//TODO: implement this.
		return null;
	}

	/**
     * Resolves the result of this Future object.
	 * @ param result    the result of the action
	 * @ pre 	res == null
	 * @ post 	res == result
     */
	public void resolve (T result) {
		//TODO: implement this.
		res = result;

	}

	/**
     * @return true if this object has been resolved, false otherwise
	 * @ pre 	none
	 * @ post 	true if res != null
	 * @ post 	false if res == null
     */
	public boolean isDone() {
		//TODO: implement this.
		return (res != null);
	}

	/**
     * retrieves the result the Future object holds if it has been resolved,
     * This method is non-blocking, it has a limited amount of time determined
     * by {@code timeout}
     * <p>
     * @param timeout 	the maximal amount of time units to wait for the result.
     * @param unit		the {@link TimeUnit} time units to wait.
     * @return return the result of type T if it is available, if not,
     * 	       wait for {@code timeout} TimeUnits {@code unit}. If time has
     *         elapsed, return null.
	 *
	 * @ pre 	timeout > 0
	 * @ inv 	res == null
	 * @ inv 	count < timeout
	 * @ post 	res == null || type(res) == T
	 * @ post  	count <= timeout
     */
	public T get(long timeout, TimeUnit unit) {
		//TODO: implement this.
		int count=0;
		return null;
	}

}
