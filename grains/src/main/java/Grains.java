import java.math.BigInteger;
class Grains {
	private static final String wrongSquareMessage = "square must be between 1 and 64";

    BigInteger grainsOnSquare(final int square) {
    		if(square<=64 && square>=1){
    			BigInteger b = new BigInteger("2");
    			b = b.pow(square-1);
    			return b;		
    		}else{
    			throw new IllegalArgumentException(wrongSquareMessage);
    		}
       
    }

    BigInteger grainsOnBoard() {
       BigInteger sum = new BigInteger("0");

       for (int i = 1;i<65;i++) {
       		sum = sum.add(this.grainsOnSquare(i));
       }
       return sum;
    }

}
