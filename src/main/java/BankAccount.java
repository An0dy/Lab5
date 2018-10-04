import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * blah.
         */
        CHECKINGS,
        /**
         * blah.
         */
        SAVINGS,
        /**
         * blah.
         */
        STUDENT,
        /**
         * blah.
         */
        WORKPLACE
    }

    /**
     * blah.
     */
    private int accountNumber;
    /**
     * blah.
     */
    private BankAccountType accountType;
    /**
     * blah.
     */
    private double accountBalance;
    /**
     * blah.
     * @param amount set amount.
     */
    public void changeBalance(final double amount) {
        accountBalance += amount;
    }
    /**
     * blah.
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * blah.
     */
    private String ownerName;
    /**
     * blah.
     * @param newName set new name.
     */
    public void changeName(final String newName) {
        ownerName = newName;
    }
    /**
     * blah.
     */
    private double interestRate;
    /**
     * blah.
     */
    private double interestEarned;

    /**
     * blah.
     * @param name ssdf.
     * @param accountCategory sdfsdf.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;

    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
