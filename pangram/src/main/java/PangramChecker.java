import java.util.regex.*;
import java.util.stream.*;
public class PangramChecker {

    public boolean isPangram(String input) {
    	return input.toLowerCase().chars().filter(Character::isAlphabetic).distinct().count()==26;
     	//return (!input.equals("")) && (input!=null) && (Pattern.matches("^[a-zA-Z]*$",input));
     	// boolean[] checked = new boolean[26];
     	// for (int i = 0;i<input.length();i++ ) {
     	// 	int index = 0;
     	// 	if( 'A' <= input.charAt(i) && input.charAt(i)<='Z' ){
     	// 		index = input.charAt(i)-'A';
     	// 	}else if( 'a' <= input.charAt(i) && input.charAt(i)<='z'){
     	// 		index = input.charAt(i)-'a';
     	// 	}
     	// 	checked[index] = true;
     	// }
     	// for (int i=0;i<26;i++ ) {
     	// 	if(checked[i]== false){
     	// 		return false;
     	// 	}
     	// }
     	// return true;
    }

}
