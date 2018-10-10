

/** Calculates the gross income of everything*/
/** also takes care of calculating Adjusted Gross Income (AGI) and Modified Adjusted Gross Income (MAGI) ??*/
public class GrossIncome {
    private long grossIncome;
    private long adjustedGrossIncome;
    private long modifiedAdjustedGrossIncome; //only useful for calculations




    private long wagesSalayTips;
    private long taxableInterest;
    private long ordinaryDvidends;
    private long capitalGainsOrLosses;
    private long totalIRADistributions;
    private long pensionsAnnuities;
    /**any other income that you got:
     * business, alimony, unemployment compensation, rental real estate,
     * royalites, partnerships, corporations ans trusts, farm income,
     * taxable social security benefits
     */
    private long other;
    /**gross income does not include gifts and inheritances*/

    /**default gross income is 0*/
    public GrossIncome() {
        this.grossIncome = 0;
        wagesSalayTips = 0;
        taxableInterest = 0;
        ordinaryDvidends = 0;
        capitalGainsOrLosses = 0;
        totalIRADistributions = 0;
        pensionsAnnuities = 0;
    }
    public void setAdjustedGrossIncome(long wagesSalayTips) {
        this.wagesSalayTips = wagesSalayTips;
        grossIncome += wagesSalayTips;
    }
    /**sets each income type and then adds to gross income*/
    public void setTaxableInterest(long taxableInterest) {
        this.taxableInterest = taxableInterest;
        grossIncome += taxableInterest;
    }
    public void setOrdinaryDvidends(long ordinaryDvidends) {
        this.ordinaryDvidends = ordinaryDvidends;
        grossIncome += taxableInterest;
    }
    public void setCapitalGainsOrLosses(long capitalGainsOrLosses) {
        this.capitalGainsOrLosses = capitalGainsOrLosses;
        grossIncome += taxableInterest;
    }
    public void setTotalIRADistributions(long totalIRADistributions) {
        this.totalIRADistributions = totalIRADistributions;
        grossIncome += taxableInterest;
    }
    public void setPensionsAnnuities(long pensionsAnnuities) {
        this.pensionsAnnuities = pensionsAnnuities;
        grossIncome += taxableInterest;
    }
    public void setOther(long other) {
        this.other = other;
        grossIncome += taxableInterest;
    }

    public long getGrossIncome() {
        return grossIncome;
    }
    public void setGrossIncome(long income) {
        grossIncome = income;
    }

//<<<<<<< HEAD
//=======


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
