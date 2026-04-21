//The class should implement RemoteAccess and Freezable.
public class CorporateWellnessPlan extends MembershipPlan implements Freezable,RemoteAccess {
    //The class should have the following additional fields:
    //
    private int employeeCount;// - number of employees covered by the plan,
    private int workshopsPerMonth;// - number of workshops delivered each month,
    private boolean onlineDashboard;// - whether the company has access to an online dashboard.
    //call the base class constructor using super(...),




    public CorporateWellnessPlan(String planCode, String clientName, int months,
                                 double baseMonthlyFee, boolean autoRenew,
                                 int employeeCount, int workshopsPerMonth, boolean onlineDashboard){
        super(String planCode, String clientName, int months,
        double baseMonthlyFee, boolean autoRenew);
        this.employeeCount=employeeCount;
        this.workshopsPerMonth=workshopsPerMonth;
        this.onlineDashboard=onlineDashboard;
    } //implement getPlanType(),

    @Override
    public String getPlanType(){
        return 'CorporateWellnessPlan';
    }//implement calculateMonthlyNetPrice(),

    @Override
    public double calculateMonthlyNerPrice(){
        double price = getBaseMonthlyFee()+(employeeCount*18)+(workshopsPerMonth*220);
        //Calculate the monthly net price exactly as follows:
        //
        //Start with baseMonthlyFee.
        //Add employeeCount * 18.
        //Add workshopsPerMonth * 220.
        if(employeeCount>=20) price -= price*0.12;
        if (onlineDashboard) price+=80;
        return price;
        //If employeeCount is greater than or equal to 20, reduce the current price by 12%.
        //If onlineDashboard is true, add 80 PLN.
        //The hasOnlineAccess() method should return the value of the onlineDashboard field.
    }
    @Override
    public boolean hasOnlineAccess(){
        return onlineDashboard;
    }
    //This type represents a company wellness package. The price depends on the number of employees, the number of workshops, and whether the company uses an online dashboard.
    //


    @Override
    public boolean canFreeze(){//The plan can be frozen only if the duration is at least 6 months and the number of monthly workshops equals 0.
        return (getMonths() >=6 && workshopsPerMonth=0);
    }

    @Override
    public String toString(){//extend toString() with fields specific to that plan.
        return super.toString()+', employee count ='+employeeCount+', workshops a month = '+workshopsPerMonth+', online dashboard ='+onlineDashboard;//.....
    }
    //
    //
    }
