/**
 * Represents the "Lamduan 8" dormitory, a new premium dormitory with a special rental condition.
 * This class extends {@link GeneralDorm} and enforces the rule that only senior students
 * (i.e., 4th-year students) are eligible to rent a room. It provides specific information
 * such as the dormitory name, price, and capacity, and overrides the eligibility logic
 * to implement its unique restriction.
 *
 * @see GeneralDorm
 */
public class L8Info extends GeneralDorm {

    /**
     * The required academic year for a student to be eligible to rent a room.
     * For Lamduan 8, this is strictly limited to seniors (4th year).
     */
    private static final int REQUIRED_STUDENT_YEAR = 4;

    /**
     * Constructs a new {@code L8Info} object, initializing the properties for the "Lamduan 8" dormitory.
     * It sets the name to "Lamduan 8", assigns a premium price, and defines its total capacity.
     * This constructor calls the parent {@link GeneralDorm} constructor to set up the basic dormitory attributes.
     */
    public L8Info() {
        // Initialize with specific details for Lamduan 8.
        // Assuming the parent constructor is GeneralDorm(String name, double price, int capacity).
        // We set a premium price of 3500 and a capacity of 80 for this exclusive dorm.
        super("Lamduan 8", 3500.0, 80);
    }

    /**
     * Checks if a student is eligible to rent a room in Lamduan 8.
     * This method overrides the general eligibility check from {@link GeneralDorm} to enforce
     * the "seniors only" rule.
     *
     * @param studentYear The academic year of the student (e.g., 1 for freshman, 4 for senior).
     * @return {@code true} if the student is a senior (4th year), {@code false} otherwise.
     */
    @Override
    public boolean isEligible(int studentYear) {
        return studentYear == REQUIRED_STUDENT_YEAR;
    }

    /**
     * Provides a human-readable string describing the specific eligibility criteria for this dormitory.
     * This message is intended to be displayed to the user if they are found to be ineligible,
     * clarifying why their booking request cannot be processed.
     *
     * @return A string detailing the rental requirements for Lamduan 8.
     */
    @Override
    public String getEligibilityCriteria() {
        return "Only senior (4th year) students are allowed to rent in Lamduan 8.";
    }

    /**
     * Returns a concise string representation of the Lamduan 8 dormitory.
     * This representation includes the dormitory name, its monthly price, and a note
     * about its exclusive "Seniors Only" policy, making it suitable for display in a list
     * of available dormitories.
     *
     * @return A descriptive string for the dormitory, e.g., "Lamduan 8 - Price: 3500.00 Baht/month (For Seniors Only)".
     */
    @Override
    public String toString() {
        return String.format("%s - Price: %.2f Baht/month (For Seniors Only)",
                this.getDormName(), this.getPrice());
    }
}