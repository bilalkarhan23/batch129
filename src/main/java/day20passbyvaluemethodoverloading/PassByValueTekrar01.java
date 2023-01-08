package day20passbyvaluemethodoverloading;

public class PassByValueTekrar01 {
    public static void main(String[] args) {

      double shirt = 100;
      double studentShirtPrice = discount("student",shirt);
      double veteranSirtPrice = discount("veteran",shirt);
      double seniorShirtPrice = discount("senior",shirt);
        System.out.println(shirt);
        System.out.println(studentShirtPrice);
        System.out.println(veteranSirtPrice);
        System.out.println(seniorShirtPrice);

       shirt= discount("veteran",shirt);
        System.out.println(shirt);
    }

    public static double discount(String state, double price){

        switch(state){
            case "student":
                price =price*0.90;
                break;


            case "veteran":
                price = price*0.80;
                break;


            case "senior":
                price = price*0.95;
                break;
            default:
            price = price;
        }
        return price;
    }


}
