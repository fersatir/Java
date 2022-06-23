package Practice;

public class Q76 {
    //survive monkey
    //It eats 4 bananas in a day
    public static void main(String[] args) {

        int numberOfBananas = 165;
        int survivalDays = 0;
        boolean monkeyAlive = true;
        System.out.println("Monkeys eat 4 bananas in a day");
        do{

            numberOfBananas -= 4;
            survivalDays ++;
            if(numberOfBananas<4){
                monkeyAlive = false;
                System.out.println("Monkey lived " + survivalDays );
            }


        }while(monkeyAlive);











    }

}
