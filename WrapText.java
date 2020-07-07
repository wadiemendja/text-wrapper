import java.util.Scanner;

public class WrapText {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Input:\n");
        String base64 = read.nextLine();
        String code=""; int track = 0 ;
        int lineLength=50;
        for(int i=0 ;i<base64.length();i++){
            if (track!=lineLength){
                code += base64.charAt(i);
                track++;
            }else {
                code += base64.charAt(i);
                code +="\n";
                track=0;
            }
        }
         System.out.println("\nOutput:\n\n"+code);
    } 
}
