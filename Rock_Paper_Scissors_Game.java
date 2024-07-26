import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors_Game {

    public static void main(String[] args) {
        int min=1;
        int max=3;
        int Count1=0,Count2=0,ch;
        String Choice2;
        String Name;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock Paper Scissor Game.");
        System.out.print("Enter Your name :: ");
        Name = sc.nextLine();
        System.out.println("\n\n5 Rounds Game.\nYou vs Computer.");
        for(int i=0;i<5;i++){
            System.out.println("Rock -> R\nPaper -> P\nScissors -> S");
            System.out.print("Enter Your Choice :: ");
            Choice2 = sc.nextLine();
            ch = random.nextInt(max - min + 1) + min;

            if((ch==1 && Choice2.equals("R")) || (ch==2 && Choice2.equals("P")) || (ch==3 && Choice2.equals("S"))){
                System.out.println("Its a Tie");
            }
            else if(ch==1 && Choice2.equals("P")){
                System.out.println("+1 Point to "+Name);
                Count2++;
            }
            else if(ch==1 && Choice2.equals("S")){
                System.out.println("+1 Point to Computer");
                Count1++;
            }
            else if(ch==2 && Choice2.equals("R")){
                System.out.println("+1 Point to Computer");
                Count1++;
            }
            else if(ch==2 && Choice2.equals("S")){
                System.out.println("+1 Point to "+Name);
                Count2++;
            }
            else if(ch==3 && Choice2.equals("P")){
                System.out.println("+1 Point to Computer");
                Count2++;
            }
            else if(ch==3 && Choice2.equals("R")){
                System.out.println("+1 Point to "+Name);
                Count2++;
            }
            else{
                System.out.println("Invalid");
            }
        }
        if(Count1<Count2){
            System.out.println("\n\nCongratulations !!\n"+Name+" Wins the Game.");
        }
        else if(Count1==Count2){
            System.out.println("\n\nNoBody Wins");
        }
        else{
            System.out.println("\n\nComputer Wins.\n Better Luck Next Time.");
        }
    }
}
