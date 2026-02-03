class payment{
    void pay(int cardnumber,int cvv){
        System.out.println("paid using card");
    }
    void pay(String accountnumber,String ifsc){
        System.out.println("paid using bank transfer");
    }
    void pay(String upi_id){
        System.out.println("paid using upi");
    }
}
public class paymentgateway{
    public static void main(String[]args){
        payment p = new payment();
        p.pay(96806695,1307);
        p.pay("96806sanchi","indusind1307");
        p.pay("sanchitkaushik1307@oksbi");
    }
}