class Hamming {
	String leftStrand,rightStrand;
    Hamming(String leftStrand, String rightStrand) {

    	if(leftStrand == "" && rightStrand!=""){
    		throw new IllegalArgumentException("left strand must not be empty.");
    	} 
    	if(rightStrand == "" && leftStrand!=""){
    		throw new IllegalArgumentException("right strand must not be empty.");
    	}
    	if( leftStrand.length() != rightStrand.length() ){
      		throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
      int diff = 0;
      for(int i= 0;i<leftStrand.length();i++){
      	if(leftStrand.charAt(i)!=rightStrand.charAt(i)){
      		diff++;
      	}
      }
      return diff;
    }

}
