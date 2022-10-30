

public class Main {
    public static void main(String[] args) {

        String string = "Spring is beautiful and so is winter";

        String word = "is";

        String [] temp = string.split(" ") ;
        int count = 0;

        for (int i=0; i< temp.length; i++){
            if(word.equals(temp[i])){
                //System.out.println("count= "+count);
                count++;
            }
        }
        System.out.println("\n\nThe String: "+string+"\nThe word '"+word+"' occurs "+count+" times in the above sentence.");

        int [] numbers = new int[] {1,2,3,4,5,3,6};

        int search =3;
        int counter = 0;

        for(int i=0;i< numbers.length;i++){
            if(numbers[i] == search){
                counter++;
            }
        }
        System.out.println("\n\nNumber of occurence of 3 are = "+counter);
    }

}
