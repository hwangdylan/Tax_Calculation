public class ModifiedAdjustedGrossIncome {


    private long modifiedAGI;
    /**any deductions you took for IRA contributions*/
    private long contributionOfIRA;
    /**any deductions you took for student loan interest or tuition*/
    private long studentLoan_Tuition;
    /**half of your self-employment tax*/
    private long halfSelfEmployment;
    /**passive income or loss*/
    private long passiveIncome;
    /**excluded foreign income*/
    private long excludedForeignIncome;
    /**rental loss*/
    private long rentalLoss;
    /**interest from EE savings bonds used to pay higher education expenses*/
    private long interestFromEESaving;
    /**employer-paid adoption expenses*/
    private long employerPaidAdoption;
    /**losses from a publicly traded partnership*/
    private long lossFromPublicTradedPartnership;

    public ModifiedAdjustedGrossIncome(long adjustedGrossIncome) {
        modifiedAGI = adjustedGrossIncome;
    }

    public void setContributionOfIRA(long contributionOfIRA) {
        this.contributionOfIRA = contributionOfIRA;
        modifiedAGI += contributionOfIRA;
    }
    public void setStudentLoan_Tuition(long studentLoan_Tuition) {
        this.studentLoan_Tuition = studentLoan_Tuition;
        modifiedAGI += studentLoan_Tuition;
    }
    public void setHalfSelfEmployment(long halfSelfEmployment) {
        this.halfSelfEmployment = halfSelfEmployment;
        modifiedAGI += halfSelfEmployment;
    }
    public void setPassiveIncome(long passiveIncome) {
        this.passiveIncome = passiveIncome;
        modifiedAGI += passiveIncome;
    }
    public void setExcludedForeignIncome(long excludedForeignIncome) {
        this.excludedForeignIncome = excludedForeignIncome;
        modifiedAGI += excludedForeignIncome;
    }
    public void setRentalLoss(long rentalLoss) {
        this.rentalLoss = rentalLoss;
        modifiedAGI += rentalLoss;
    }
    public void setInterestFromEESaving(long interestFromEESaving) {
        this.interestFromEESaving = interestFromEESaving;
        modifiedAGI += interestFromEESaving;
    }
    public void setEmployerPaidAdoption(long employerPaidAdoption) {
        this.employerPaidAdoption = employerPaidAdoption;
        modifiedAGI += employerPaidAdoption;
    }
    public void setLossFromPublicTradedPartnership(long lossFromPublicTradedPartnership) {
        this.lossFromPublicTradedPartnership = lossFromPublicTradedPartnership;
        modifiedAGI += lossFromPublicTradedPartnership;
    }
    public void setModifiedAGI(long modifiedAGI) {
        this.modifiedAGI = modifiedAGI;
    }
}
