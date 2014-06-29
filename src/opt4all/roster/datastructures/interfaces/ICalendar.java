package opt4all.roster.datastructures.interfaces;

import java.util.Iterator;
import java.util.Set;

public interface ICalendar {
	
	
	
	/**
	 * 
	 * @return a copy of the current calendar.
	 */
	public ICalendar copy();
	
	/**
	 * Add unavailabilities to a calendar.
	 * @param unavailabilities an iterator to the container of unavailabilities to add.
	 */
	public void addUnavailabilities(Iterator<IPeriod> unavailabilities);

	/**
	 * Add one unavailability to a calendar.
	 * @param unavailability the unavailability to add.
	 */
	public void addUnavailability(IPeriod unavailability);

	/**
	 * Remove an unavailability from the calendar.
	 * @param p
	 */
	public void removeUnavailability(IPeriod p);
	
	/**
	 * Compute if the period is available in this calendar.
	 * @param p the period for which we want to check the availability.
	 * @return true if there is no unavailability in this calendar during this period.
	 */
	public boolean isAvailableDuringPeriod(IPeriod p);
	
	
}
