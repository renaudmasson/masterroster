package opt4all.roster.datastructures.interfaces;

import java.util.Date;

/**
 * An interface for a periode.
 * @author renaud
 *
 */
public interface IPeriod {
		
	/**
	 * 
	 * @param other an other period with which we want to check if it intersect.
	 * @return true if the two periods intersect.
	 */
	public boolean intersect(IPeriod other);

}
