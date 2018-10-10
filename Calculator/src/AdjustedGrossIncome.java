public class AdjustedGrossIncome {


    private long totalDeductions;
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
        totalDeductions = 0;
    }


    /**sets each income type and then adds to gross income*/
    public void setiRAContributions(long iRAContributions) {
        this.iRAContributions = iRAContributions;
        adjustedGrossIncome -= iRAContributions;
        totalDeductions += iRAContributions;
    }
    public void setStudentLoanInterest(long studentLoanInterest) {
        this.studentLoanInterest = studentLoanInterest;
        adjustedGrossIncome -= iRAContributions;
        totalDeductions += studentLoanInterest;
    }
    public void setMovingExpenses(long movingExpenses) {
        this.movingExpenses = movingExpenses;
        adjustedGrossIncome -= iRAContributions;
        totalDeductions += movingExpenses;
    }
    public void setHalfSelfEmployment(long halfSelfEmployment) {
        this.halfSelfEmployment = halfSelfEmployment;
        adjustedGrossIncome -= iRAContributions;
        totalDeductions += halfSelfEmployment;
    }
    public void setsEPContributions(long sEPContributions) {
        this.sEPContributions = sEPContributions;
        adjustedGrossIncome -= iRAContributions;
        totalDeductions += sEPContributions;
    }
    public double getAdjustedGrossIncome() {
        return adjustedGrossIncome;
    }
    public void setAdjustedGrossIncome(long adjustedGrossIncome) {
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
        this.adjustedGrossIncome = adjustedGrossIncome;

    }

}
