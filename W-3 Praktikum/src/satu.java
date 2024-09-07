import java.util.Scanner;

public class satu {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        System.out.println("Input Kalimat :");
        String kalimat = in.nextLine();
        String[] string = kalimat.split("[^A-Za-z]+");
        int itung = 0;

        for (String box : string){
            if (!box.isEmpty()){
                itung++;
            }
        }

        System.out.println(itung);

        for (String box : string){
            if(!box.isEmpty()){
                System.out.println(box);
            }
        }
    }
}
