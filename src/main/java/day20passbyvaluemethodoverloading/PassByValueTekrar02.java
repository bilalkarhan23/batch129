package day20passbyvaluemethodoverloading;

public class PassByValueTekrar02 {
    public static void main(String[] args) {


        String name = "Tom Hanks";

        String updatedName = updateName(name, "Jr");
        System.out.println(name);
        System.out.println(updatedName);

    }

    public static String updateName(String name, String add){
        name = name + " " +add;
        return name;
    }
}
