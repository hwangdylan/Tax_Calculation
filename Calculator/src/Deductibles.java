import java.util.Scanner; //actually we'll take care of user input later

/** calculates the deductibles*/
public class Deductibles {
    private Double totalDeductions;


    public Double calculateDependents() { //calculate deductions due to dependents
        return 0.0;
    }

    //also have a function for retirement plan/IRA deductions, since those are also not itemized

    public Double calculateItemizedDeductions(Double AGI, Double MAGI) {
        double rtn = 0;
        Integer val = 10;
        Double lols = 100.0;
        rtn = lols;
        int integerasdfa = val;

        //From charitable donations:
        //percentage limit for charitable donations is 60% of user's AGI


        //From medical/dental expenses:
        //calculate the "floor" amount based on AGI; we can only deduct amounts that exceed the floor

        //From state and local taxes:
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
