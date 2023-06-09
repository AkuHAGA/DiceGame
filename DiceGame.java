import java.util.Random;
class DiceGame{
    public static void main(String[] args){
	Random random = new Random();
	int die1 = random.nextInt(6) + 1;
	int die2 = random.nextInt(6) + 1;
	int sum = die1 + die2;
	System.out.println("Rolling dice...");
	System.out.println("Die 1 : " + die1);
	System.out.println("Die 2 : " + die2);
	System.out.println("Total value: " + sum);
    }
}
