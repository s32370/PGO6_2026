//Important. MembershipPlan must be an abstract class and it must implement the Billable interface.
public abstract class GymMembershipPlan implements Billable{

    //The MembershipPlan class should store:

    private String planCode;
    private String clientName - client name or company name,
    private int months - plan duration in months,
    private double baseMonthlyFee - base monthly fee,
    private boolean autoRenew - information whether the plan is renewed automatically.

    //In the MembershipPlan class, prepare:
    //
    //a constructor initializing the shared fields,
    //getters for fields needed in subclasses and in the main method,



    //an abstract method String getPlanType(),
    public abstract String getPlanType(){

    }

    public abstract double calculateMonthlyNetPrice(){

    }

    public double calculateMonthlyGrossPrice(){

    } //returning the gross price for one month,

    public double calculateTotalNetPrice(){

    } //returning the net value of the whole contract,

    final void printSummary(){

    } //printing the basic data, monthly net price, monthly gross price, and full contract value,

    //toString() method returning a readable object description.
    @Override
    public String toString(){

    }
}
