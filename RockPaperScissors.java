package Projects;
import java.util.Scanner;
import java.util.Random;
class RPS {
    int n,x;
    int uCount=0;
    int cCount=0;
    public void user(){
        Scanner s=new Scanner(System.in);
        System.out.println("Press 1 for Rock");
        System.out.println("Press 2 for Paper");
        System.out.println("Press 3 for Scissors");
        n=s.nextInt();
        if (n!=1 && n!=2 && n!=3) {
            System.out.println("Give a valid Input !!!");
            user();
        }
    }
    public void computer(){
        Random r= new Random();
        int cpu=r.nextInt(3);
        x = cpu+1;
    }
    public void calculation(){
        if (n==1) {
            System.out.println("You have picked Rock ");
            if (x==1) {
                System.out.println("CPU has also picked Rock");
                System.out.println("So it is a DRAW");
                System.out.println();
                System.out.println("Score -> YOU "+uCount+"-"+cCount+" CPU");
            }
            else if (x==2) {
                System.out.println("CPU has picked Paper");
                System.out.println("CPU has WON this Round !!!");
                cCount++;
                System.out.println();
                System.out.println("Score -> YOU "+uCount+"-"+cCount+" CPU");                
            }
            else{
                System.out.println("CPU has picked Scissors");
                System.out.println("YOU have WON this Round !!!");
                uCount++;
                System.out.println();
                System.out.println("Score -> YOU "+uCount+"-"+cCount+" CPU");
            }
        }
        else if(n==2){
               System.out.println("You have picked Paper");
            if (x==1) {
                System.out.println("CPU has picked Rock");
                System.out.println("YOU have WON this Round !!!");
                uCount++;
                System.out.println();
                System.out.println("Score -> YOU "+uCount+"-"+cCount+" CPU");
            }
            else if (x==2) {
                System.out.println("CPU has picked Paper");
                System.out.println("So it is a DRAW");
                System.out.println();
                System.out.println("Score -> YOU "+uCount+"-"+cCount+" CPU");  
            }
            else{
                System.out.println("CPU has picked Scissors");
                System.out.println("CPU has WON this Round !!!");
                cCount++;
                System.out.println();
                System.out.println("Score -> YOU "+uCount+"-"+cCount+" CPU");
            }
        }
        else{
             System.out.println("You have picked Scissors");
            if (x==1) {
                System.out.println("CPU has picked Rock");
                System.out.println("CPU has WON this Round !!!");
                cCount++;
                System.out.println();
                System.out.println("Score -> YOU "+uCount+"-"+cCount+" CPU");
            }
            else if (x==2) {
                System.out.println("CPU has picked Paper");
                System.out.println("YOU have WON this Round !!!");
                uCount++;
                System.out.println();
                System.out.println("Score -> YOU "+uCount+"-"+cCount+" CPU");
            }
            else{
                System.out.println("CPU has picked Scissors");
                System.out.println("So it is a DRAW");
                System.out.println();
                System.out.println("Score -> YOU "+uCount+"-"+cCount+" CPU");
            }
        }
    }
    public void result(){
        if (uCount>cCount) {
            System.out.println("Congratulations!!! YOU have won this game");
        }
        else if(uCount<cCount){
            System.out.println("Oops!!! YOU have lost this time");
        }
        else{
            System.out.println("Wow It's a Deaw!!!!");
        }
    }
}
public class RockPaperScissors {
    public static void main(String[] args) {
        RPS game=new RPS();
       for(int i=1;i<=5;i++){
            System.out.println();
            System.out.println("Round "+i);
            System.out.println();
            game.user();
            game.computer();
            game.calculation();
        }
        game.result();
    }
    
}