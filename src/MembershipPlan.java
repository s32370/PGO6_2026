//Important. MembershipPlan must be an abstract class and it must implement the Billable interface.
public abstract class MembershipPlan implements Billable{

    //The MembershipPlan class should store:

    private String planCode;
    private String clientName;
    private int months;
    private double baseMonthlyFee;
    private boolean autoRenew;// - information whether the plan is renewed automatically.

    //In the MembershipPlan class, prepare:
    //
    //a constructor initializing the shared fields,

    public MembershipPlan(String planCode, String clientName, int months,
                          double baseMonthlyFee, boolean autoRenew){
        this.planCode=planCode;
        this.clientName=clientName;
        this.months=months;
        this.baseMonthlyFee=baseMonthlyFee;
        this.autoRenew=autoRenew;
    }

    //getters for fields needed in subclasses and in the main method,
    public String getPlanCode(){
        return planCode;
    }

    public String getClientName(){
        return clientName;
    }

    public int getMonths(){
        return months;
    }

    public double getBaseMonthlyFee(){
        return  baseMonthlyFee;
    }

    public boolean isAutoRenew(){
        return autoRenew;
    }


    //an abstract method String getPlanType(),
    public abstract String getPlanType(){

    }

    public abstract double calculateMonthlyNetPrice(){

    }

    public double calculateMonthlyGrossPrice(){

    } //returning the gross price for one month,

    public double calculateTotalNetPrice(){
            return calculateMonthlyNetPrice() * months;
    } //returning the net value of the whole contract,

    final void printSummary(){
        System.out.println("Plan Code: " + planCode);
        System.out.println("Client Name: " + clientName);
        System.out.println("Plan Type: " + getPlanType());
        System.out.println("Monthly Net Price: " + calculateMonthlyNetPrice());
        System.out.println("Monthly Gross Price: " + calculateMonthlyGrossPrice());
        System.out.println("Total Net Price: " + calculateTotalNetPrice());

    } //printing the basic data, monthly net price, monthly gross price, and full contract value,

    //toString() method returning a readable object description.
    @Override
    public String toString(){
        return "MembershipPlan:" + "planCode='" + planCode + '\'' + ", clientName='" + clientName + '\'' + ", months=" + months + ", baseMonthlyFee=" + baseMonthlyFee + ", autoRenew=" + autoRenew;
    }
}
