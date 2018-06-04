import java.util.Scanner;

public class Zaproszenia {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner inPut = new Scanner(System.in);
        System.out.println("podaj 5 imion:");
        names[0] = inPut.nextLine();
        names[1] = inPut.nextLine();
        names[2] = inPut.nextLine();
        names[3] = inPut.nextLine();
        names[4] = inPut.nextLine();
        int a = 4;
       while (a!=-1){
           System.out.println("Cześć "+ names[a]);
           a--;

       }



    }
}
