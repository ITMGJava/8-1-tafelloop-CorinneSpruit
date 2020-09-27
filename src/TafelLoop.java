import java.util.Scanner;

public class TafelLoop {
    public static void main (String [] arg){

        System.out.println("Hallo, van welk getal wil je de tafel weten?");

        var s = new Scanner(System.in);

                var getalx = s.nextInt();

        System.out.println("Dat is een mooi getal! De tafel van "+getalx+" is:");

                for (int i=1;i<=10;i++) {

                    System.out.println(i + " x " + getalx + " = " + getalx * i);
                }

        System.out.println();

    System.out.println("Laten we er nog een doen! Noem nog eens een getal");

                   var getaly = s.nextInt();

                    System.out.println("Nog zo'n mooi getal! Houd je vast, hier komt de tafel van " + getaly);

        for (int i=1;i<=10;i++) {
            System.out.println(i + " x " + getaly + " = " + getaly * i);

        }

    }
}
