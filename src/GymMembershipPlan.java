public class GymMembershipPlan {
    //Required Subclasses
    //Create four classes extending MembershipPlan:
    //
    //GymMembershipPlan, added
    //PersonalTrainingPlan, added
    //OnlineCoachingPlan, added
    //CorporateWellnessPlan. added
    //Each subclass must:
    //
    //call the base class constructor using super(...),
    //implement getPlanType(),
    //implement calculateMonthlyNetPrice(),
    //extend toString() with fields specific to that plan.
    //Detailed Business Logic
    //1. GymMembershipPlan
    //This type represents a standard gym membership. The client pays a base monthly fee and the price is then adjusted depending on the number of entries and additional services.
    //
    //The class should have the following additional fields:
    //
    //entriesPerMonth - planned number of entries per month,
    //saunaAccess - whether the client has access to the sauna.
    //The class should implement Freezable.
    //
    //Calculate the monthly net price exactly as follows:
    //
    //Start with baseMonthlyFee.
    //Add entriesPerMonth * 4.
    //If saunaAccess is true, add 25 PLN.
    //If autoRenew is true, subtract a 10 PLN discount.
    //The plan can be frozen only if the duration is at least 3 months.
}
