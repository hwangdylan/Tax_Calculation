import java.util.Scanner; //actually we'll take care of user input later

/** calculates the deductibles*/
public class Deductibles {
    private Double totalDeductions;


    public Double calculateDependents() { //calculate deductions due to dependents
        return 0.0;
    }

    public Double calculateIRADeduction() { //not itemized: deductions from IRAs
        return 0.0;
    }

    public Double calculateItemizedDeductions(Double AGI, Double MAGI) { //also need filing status parameter
        double rtn = 0;
        Integer val = 10;
        Double lols = 100.0;
        rtn = lols;
        int integerasdfa = val;

        //From charitable donations:
        //percentage limit for charitable donations is 60% of user's AGI


        //From medical/dental expenses:
        //calculate the "floor" amount based on AGI; we can only deduct amounts that exceed the floor

        //From state and local taxes (called SALT deduction):
        //can deduct state individual income, sales and property taxes up to a limit of $10,000 in total

        //Interest deductions:
        //1) student loan interest: if user's MAGI doesn't exceed $80K (or 165K if married joint return), up to $2,500 deductions
        /**2) mortgage loan interest: can deduct interest on up to $750K of mortgage loan debt, or $350K each if married filing separately
         * BUT for mortgages taken out before 2018, the numbers are $1M and $500K, respectively
         */

        //casualty and theft losses: only for a natural disaster so .... later

        //I think that's all (see kellyphillipserb forbes article)

        /**note: a lot of these numbers are different from 2018-2025 because of a tax act.
         * for example, there used to be misc. deductions subject to a 2% floor.
         * that has been repealed for the 2018-2025 period.
         */
        return 0.0;
    }
    public Double getTotalDeductions() {
        //here, determine whether itemized deductions exceed standard deduction based on filing status
        /*possibly: have separate classes for 1. itemized deductions and 2. all other deductions?
        Since the itemized deductions are compared to the standard deduction.
        But that's an organization issue that we can deal with later whatever */
        return totalDeductions;
    }
}
