package opt4all.roster.datastructures.interfaces;

/**
 * An interface for the shift.
 * @author renaud
 *
 */
public interface IShift {

	/**
	 * 
	 * @return the period during which this shift has to be done.
	 */
	public IPeriod getPeriod();
	
	/**
	 * 
	 * @return the skills needed to carryout this Shift.
	 */
	public ISkillsSet getNeededSkills();
	
}
