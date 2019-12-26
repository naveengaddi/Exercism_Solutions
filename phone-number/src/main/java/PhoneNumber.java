/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
class PhoneNumber{
	String number;
	PhoneNumber(String number){
		this.number = number;
	}
	 String getNumber(){
	 	String ret ="";
	 	for (int i = 0;i<this.number.length() ;i++ ) {
	 		if( Character.isDigit(this.number.charAt(i))){
	 			ret += this.number.charAt(i);
	 		}
	 	}
	 	if(ret.length()==11){
	 		return ret.substring(1,ret.length());
	 	}else{
	 		return ret;
	 	}
	}
}
