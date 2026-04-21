public class OnlineCoachingPlan extends MembershipPlan implements RemoteAccess{
    //call the base class constructor using super(...),

    private int videoConsultations;// - number of video consultations per month,
    private boolean mealPlanIncluded;// - whether a meal plan is included,
    private boolean recordedLibraryAccess;// - whether the client has access to a recording library.

    public OnlineCoachingPlan(String planCode, String clientName, int months,
                              double baseMonthlyFee, boolean autoRenew,int videoConsultations,
                              boolean mealPlanIncluded, boolean recordedLibraryAccess){
        super(String planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew);
        this.videoConsultations=videoConsultations;
        this.mealPlanIncluded=mealPlanIncluded;
        this.recordedLibraryAccess=recordedLibraryAccess;
    }
    //implement getPlanType(),
    @Override
    public String getPlanType(){
        return 'Online coaching plan'
    }

    //implement calculateMonthlyNetPrice(),

    @Override
    public double calculateMonthlyNetPrice(){
        double price = getBaseMonthlyFee()+(videoConsultations*45);
        if (mealPlanIncluded) price += 60;
        if (recordedLibraryAccess) price +=20;
        if(isAutoRenew()) price -= 12;
        return price;
        //Calculate the monthly net price exactly as follows:
        //
        //Start with baseMonthlyFee.
        //Add videoConsultations * 45.
        //If mealPlanIncluded is true, add 60 PLN.
        //If recordedLibraryAccess is true, add 20 PLN.
        //If autoRenew is true, subtract 12 PLN.
    }
    //The hasOnlineAccess() method should always return true.
    @Override
    public boolean hasOnlineAccess(){
        return true;
    }
    //extend toString() with fields specific to that plan.
    @Override
    public String toString(){
        //private int videoConsultations;// - number of video consultations per month,
        //    private boolean mealPlanIncluded;// - whether a meal plan is included,
        //    private boolean recordedLibraryAccess
    }
    //The class should have the following additional fields:
    //
    //The class should implement RemoteAccess.
    //


}
