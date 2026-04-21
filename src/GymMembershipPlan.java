import java.lang.annotation.Inherited;

public class GymMembershipPlan extends MembershipPlan implements Freezable{
    //The class should have the following additional fields:
    private int entriesPerMonth;// - planned number of entries per month,
    private boolean saunaAccess;// - whether the client has access to the sauna.

    //call the base class constructor using super(...),
    public GymMembershipPlan(String planCode, String clientName, int months,
                             double baseMonthlyFee, boolean autoRenew, int entriesPerMonth, boolean saunaAccess){
        super(String planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew);
        this.entriesPerMonth=entriesPerMonth;
        this.saunaAccess=saunaAccess;
    }
    //implement getPlanType(),
    @Override
    public String getPlanType(){
        return 'GymMembershipPlan';
    }
    //implement calculateMonthlyNetPrice(),
    @Override
    public double calculateMonthlyNetPrice(){
        double price = getBaseMonthlyFee() + (entriesPerMonth*4);//Add entriesPerMonth * 4.
        if(saunaAccess) price += 25;
        if(isAutoRenew()) price -= 10;
        return price;
    }
    //extend toString() with fields specific to that plan.

    @Override
    public String toString(){
        return super.toString() + ',entries per month ='+entriesPerMonth+', Sauna Access ='+saunaAccess;
    }
    //Detailed Business Logic
    @Override
    public boolean canFreeze(){
        //The plan can be frozen only if the duration is at least 3 months.
        return getMonths() >=3;
    }
    // GymMembershipPlan
    //This type represents a standard gym membership. The client pays a base monthly fee
    // and the price is then adjusted depending on the number of entries and additional services.
    //

    //The class should implement Freezable.
    //
    //Calculate the monthly net price exactly as follows:
    //
    //Start with baseMonthlyFee.

    //If saunaAccess is true, add 25 PLN.
    //If autoRenew is true, subtract a 10 PLN discount.


}
