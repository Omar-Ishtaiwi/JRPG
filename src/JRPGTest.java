import java.util.Scanner;

public class JRPGTest {

	public static void main(String[] args) {
		
		System.out.println("Choose your character: ");
		System.out.println("(1)*Normal \n(2)*Fire \n(3)*Water \n(4)*Dark");
		
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		
		Actor p1 = null ;
		switch (choice){
		case 1:  p1 = new Actor(); break;
		case 2:  p1 = new Fire(); break;
		case 3:  p1 = new Water(); break;
		case 4:  p1 = new Dark(); break;
		}
		
		int rand= (int) (Math.random()*(4));
		Actor p2 = null;
		switch (rand){
		case 1:  p2 = new Actor(); break;
		case 2:  p2 = new Fire(); break;
		case 3:  p2 = new Water(); break;
		case 4:  p2 = new Dark(); break;
		}
		
		System.out.println("You chose "+p1.type);
		System.out.println("Enemy is "+p2.type);
		battle(p1,p2);
		
		

	}
	
	
	static void battle(Actor a , Actor b){
		int i =1;
		
		// Alternates between who is attacking this turn
		while(a.hp>0&&b.hp>0) {
			if(i%2 !=0){
			
			attack(a , b);
			
			i++;
			}
			else{
			attack(b, a);
			i++;
			}
			}

		}	
	//Attack Formula and Messages
	//Final Damage done is the damage of the move * type multiplier + level difference + random integer between 1 to 20.
	static void attack(Actor one , Actor two) {
		double movedamage= one.moveDamage;
				int leveldifference=one.level-two.level;
				boolean supermsg =false;
				boolean notmsg=false;
				
				if( one.strongType.contains(two.type)){
				 movedamage= one.moveDamage*2;
				 supermsg=true;
				}
				
				if(one.weakType.contains( two.type)){
				 movedamage=one.moveDamage*0.5;
				 notmsg=true;
				}

				 movedamage+=leveldifference +(int)Math.random()*(20);

				two.hp= (int)(two.hp-movedamage);
				
				System.out.println(one.type + " did " +movedamage +" of damage to "+ two.type);
				if(supermsg) {
					System.out.println("Super effective!");
				}
				
				if(notmsg) {
					System.out.println("Not effective..");
				}
				
				
				System.out.println(two.type+" has "+two.hp+ " of hp");
				
				if(two.hp<=0) {
					System.out.println(two.type+ " has died. Battle Ended");
				}
				
				System.out.println("***");
				}
}
