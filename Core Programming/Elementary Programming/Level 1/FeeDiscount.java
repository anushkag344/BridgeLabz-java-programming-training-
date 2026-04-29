public class FeeDiscount {
    public static void main(String[] args){
        int fee=12500;
        int discountPercent=10;
        int discountAmount=(fee*discountPercent)/100;
        int finalfee=fee-discountAmount;
        System.out.println("The discount amount is INR " + discountPercent +
        " and final discounted fee is INR " + finalfee);

    }
    
}
