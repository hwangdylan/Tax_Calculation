public class Person {

    /**instance of a person who has certain attributes such as
     * income, status, and deductibles. more can be dded later
     */


    private GrossIncome grossIncome;
    private FilingStatus filingStatus;
    private Deductibles deductibles;
    public Person(GrossIncome income, FilingStatus status, Deductibles deductibles) {
        this.grossIncome = income;
        this.filingStatus = status;
        this.deductibles = deductibles;
    }
    /**if no previous stats are already passed in,
     * then sets everything to default values
     */
    public Person() {
        this.grossIncome = new GrossIncome();
        this.deductibles = new Deductibles();
        this.filingStatus = new FilingStatus();
    }
    public GrossIncome getGrossIncome() {
        return grossIncome;
    }
    public FilingStatus getFilingStatus() {
        return filingStatus;
    }
    public Deductibles getDeductibles() {
        return deductibles;
    }
}
