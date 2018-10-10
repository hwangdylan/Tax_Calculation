public class AdjustedGrossIncome {

    private long adjustedGrossIncome;
    private long iRAContributions;
    private long studentLoanInterest;
    private long movingExpenses;
    private long halfSelfEmployment;
    private long sEPContributions;
    /**include alimony paid, Archer Medical Savings Account,
     * penalties paid on early withdrawal of savings
     */
    private long deductionOthers;

    /**constructor which takes in the grossIncome
     * to be edited
     * @param grossIncome the calculated gross
     */
    public AdjustedGrossIncome(long grossIncome) {
        this.adjustedGrossIncome = grossIncome;
    }
    /**sets each income type and then adds to gross income*/
    public void setiRAContributions(long iRAContributions) {
        this.iRAContributions = iRAContributions;
        adjustedGrossIncome -= iRAContributions;
    }
    public void setStudentLoanInterest(long studentLoanInterest) {
        this.studentLoanInterest = studentLoanInterest;
        adjustedGrossIncome -= iRAContributions;
    }
    public void setMovingExpenses(long movingExpenses) {
        this.movingExpenses = movingExpenses;
        adjustedGrossIncome -= iRAContributions;
    }
    public void setHalfSelfEmployment(long halfSelfEmployment) {
        this.halfSelfEmployment = halfSelfEmployment;
        adjustedGrossIncome -= iRAContributions;
    }
    public void setsEPContributions(long sEPContributions) {
        this.sEPContributions = sEPContributions;
        adjustedGrossIncome -= iRAContributions;
    }


    public double getAdjustedGrossIncome() {
        return adjustedGrossIncome;
    }
    public void setAdjustedGrossIncome() {
        //here, above-the-line deductions ("adjustments") are taken to arrive at user's AGI
        // https://www.irs.gov/pub/irs-pdf/f1040.pdf all adjustments are here

        /**Moving expenses
         * WHy is ira deduction here?? the limit is based on MAGI so ? confused
         * student loan interest
         *
         *
         */

        //taxable income = adjusted gross income - exemptions - itemized deductions (or standard deduction)
        //no such thing as personal exemptions for 2018, standard deduction is just higher

        
    }

}
