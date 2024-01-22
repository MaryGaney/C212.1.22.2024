public class TaxCalculator {
    public static void main(String[] args) {

        //constants
        final double RATE1 = 0.1;
        final double RATE2 = 0.25;
        final double SINGLE_LIMIT = 32000;
        final double MARRIED_LIMIT = 64000;

        double tax = 0.0;

        Scanner in = new Scanner(System.in);
        //take input from user
        System.out.println("enter filing status: s for single, m for married");
        String status = in.next();
        System.out.println("enter taxable income");
        double income = in.nextDouble();

        //if status is single
        if(status.equals("s")){
            //if income is less than or equal to 32000
            if(income <= SINGLE_LIMIT){
                //tax is 10% of the income
                tax = 0.1 * income;
            }else{
                //tax is 3200 + 25% of the amount over income
                tax = 0.1 * SINGLE_LIMIT + 0.25 * (income - SINGLE_LIMIT);
            }
        }else if (status.equals("m")){
            if(income <= MARRIED_LIMIT){
                //tax is 10% of the income
                tax = 0.1 * income;
            }else{
                //tax is 3200 + 25% of the amount over income
                tax = 0.1 * MARRIED_LIMIT + 0.25 * (income - MARRIED_LIMIT);
            }
        }
        System.out.println("tax is " + tax);

    }
}
