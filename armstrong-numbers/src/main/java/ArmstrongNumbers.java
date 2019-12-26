import java.util.*;
class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int length = String.valueOf(numberToCheck).length();
		int num = numberToCheck;
		int sum = 0;
		while(num>0){
			sum += Math.pow(num%10,length);
			num = num/10;
		}
		if(numberToCheck == sum )
			return true;
		return false;
	}

}
