class Twofer {
    String twofer(String name) {
        String start = "One for ";
       	String end = ", one for me.";
       	if(name == null){
       		return start+"you"+end;
       	}
       	return start+name+end;
    }
}
