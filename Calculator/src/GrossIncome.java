

/** Calculates the gross income of everything*/
/** also takes care of calculating Adjusted Gross Income (AGI) and Modified Adjusted Gross Income (MAGI) ??*/
public class GrossIncome {
    private long grossIncome;
    private long adjustedGrossIncome;
    private long modifiedAdjustedGrossIncome; //only useful for calculations


    /**default gross income is 0*/
    public GrossIncome() {
        this.grossIncome = 0;
    }

    public long getGrossIncome() {
        return grossIncome;
    }
    public void setGrossIncome(long income) {
        grossIncome = income;
    }

//<<<<<<< HEAD
//=======
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

        adjustedGrossIncome = grossIncome;
    }

    public long getModifiedAdjustedGrossIncome() {
        return modifiedAdjustedGrossIncome;
    }
    public void setModifiedAdjustedGrossIncome() {

        //there's no form for this so you have to calculate it on your own
        modifiedAdjustedGrossIncome = grossIncome;
    }
    public static void main(String[] args) {
        System.out.println("hello world");

    }
//>>>>>>> b1427be18c3721253e858e97605883e211b0cad9
}
