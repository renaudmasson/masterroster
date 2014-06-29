package opt4all.roster.datastructures.interfaces;

/**
 * An interface for a group of skills.
 * @author renaud
 *
 */
public interface ISkillsSet {

	/**
	 * Check if this SkillsSet contains certains skills.
	 * @param other the skills that we want to check that this SkillsSet has.
	 * @return true if all skills of other are contained by the current SkillsSet.
	 */
	public boolean contains(ISkillsSet other);
	
}
