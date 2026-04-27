package org.example;

public class Membership {

    private  String memberName;
    private String planType;
    private int monthlyFee;

    public Membership(String memberName){
        this.memberName = memberName;
        this.planType = "Basic";
        this.monthlyFee = 200;

    }
    public Membership(String memberName,String planType){
        this.memberName = memberName;
        this.planType = planType;
        this.monthlyFee = monthlyFee;

    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getPlanType() {
        return planType;
    }

    public int gymMembership(String planType){
        if(planType.equalsIgnoreCase("Gold")){
            return monthlyFee = 500;
        }
        return 200;
    }

    public String getSummary(){
        return "Mamber name "+memberName +"\nMembership Type "+planType+"\nMembership fee "+gymMembership(planType);
    }
}
