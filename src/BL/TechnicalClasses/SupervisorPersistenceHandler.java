
package BL.TechnicalClasses;

import java.util.Collection;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm469a]
 */
public interface SupervisorPersistenceHandler {
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm469b]
 * @param user 
 * @return 
 */
    public BL.ModelClasses.Supervisor insertSupervisor(BL.ModelClasses.User user);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm46a0]
 * @param supervisor 
 * @return 
 */
    public boolean updateSupervisor(BL.ModelClasses.Supervisor supervisor);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm46a5]
 * @return 
 */
    public Collection<BL.ModelClasses.Supervisor> selectAllSupervisors();
}


