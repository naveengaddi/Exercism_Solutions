class ReverseString {

    String reverse(String inputString) {
        StringBuilder  s = new StringBuilder(inputString);
        s.reverse();
        return new String(s);
    }
  
}