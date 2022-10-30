
import java.util.ArrayList; // have to import for arraylist
// Enhanced For Loop Example

public class Main {
    public static void main(String[] args) {

        /*
        char [] vowels = { 'a','e','i','o','u'};
        for(int i=0; i< vowels.length;i++){

            System.out.println("Vowels "+i+" = "+vowels[i]);
        }
        System.out.println("\n\n This is Enhanced For Loop \n");
        int i=1;
        for(char items: vowels){
            System.out.println("Vowels "+i+" = "+items);
            i++;
        }

        System.out.println("This is printing each row Outer and Inner LOOP for rows and colums");
        String Lists[][] = {{"row-0","colume-0"},{"row-1","colume-1"},{"row-2","colume-2"} };

        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(Lists[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n Length of row 1 is:"+ Lists[0].length);
        System.out.println("Length of row 2 is:"+ Lists[1].length);
        System.out.println("Length of row 3 is:"+ Lists[2].length);

         */

        System.out.println("\n\n ArrayList Example");
        // we have to import an arraylist

        //addMethod();
        //isEmpty();
        //setMethod();
        removeMethod();

    }

    public static void addMethod() {
        System.out.println("This Method will add Elements to our ArrayList");
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("tiger");
        animals.add("Cheeta");
        animals.add("Cat");
        System.out.println("using print : "+animals);
        for(String animal: animals){
            System.out.println(animal);
        }
    }

    public static void isEmpty() {
        ArrayList<String> topCompanies = new ArrayList<>();
        System.out.println("\n Is the ArrayList Top Commpanies Empty : "+ topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("ARM");
        topCompanies.add("Facebook");
        System.out.println("\n Is the ArrayList Top Commpanies Empty : "+ topCompanies.isEmpty());
        String BestCompany = topCompanies.get(0);
        System.out.println("\n The worst company is : " + BestCompany);
    }

    public static void setMethod() {
        ArrayList<String> topCompanies = new ArrayList<>();

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("ARM");
        topCompanies.add("Facebook");

        System.out.println(topCompanies);

        topCompanies.set(4,"Walmart");
        System.out.println("\n The worst company is : " + topCompanies);
    }

    public static void removeMethod() {

        ArrayList<String> topCompanies = new ArrayList<>();

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("ARM");
        topCompanies.add("Facebook");

        System.out.println(topCompanies);

        topCompanies.remove(4);
        topCompanies.remove("Amazon");
        topCompanies.remove(new String("Google"));
        System.out.println("\n The worst company is : " + topCompanies);
    }
}
