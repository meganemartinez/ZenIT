
package BL.TechnicalClasses;
/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm46b9]
 */
public interface CategoryPersistenceHandler {
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm46ba]
 * @param superCategory 
 * @param label 
 * @return 
 */
    public BL.ModelClasses.Category insertCategory(BL.ModelClasses.Category superCategory, String label);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm46c0]
 * @param category 
 * @return 
 */
    public boolean deleteCategory(BL.ModelClasses.Category category);
}

