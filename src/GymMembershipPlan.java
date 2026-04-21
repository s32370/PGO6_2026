public class GymMembershipPlan {
    //Abstract Class
    //Create an abstract base class named MembershipPlan. It should represent a general membership plan that should not be instantiated directly, because the concept of a generic “membership plan” is too broad on its own.
    //
    //The MembershipPlan class should store:
    //
    //planCode - unique plan code,
    //clientName - client name or company name,
    //months - plan duration in months,
    //baseMonthlyFee - base monthly fee,
    //autoRenew - information whether the plan is renewed automatically.
    //In the MembershipPlan class, prepare:
    //
    //a constructor initializing the shared fields,
    //getters for fields needed in subclasses and in the main method,
    //an abstract method String getPlanType(),
    //an abstract method double calculateMonthlyNetPrice(),
    //a method double calculateMonthlyGrossPrice() returning the gross price for one month,
    //a method double calculateTotalNetPrice() returning the net value of the whole contract,
    //a method final void printSummary() printing the basic data, monthly net price, monthly gross price, and full contract value,
    //a toString() method returning a readable object description.
    //Important. MembershipPlan must be an abstract class and it must implement the Billable interface.

}
