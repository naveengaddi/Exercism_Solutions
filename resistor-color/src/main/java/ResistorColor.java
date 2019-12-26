class ResistorColor {
	String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    int colorCode(String color) {
    	int i;
        for (i = 0 ; i<colors.length ;i++ ) {
        	if(colors[i].equals(color)){
        		return i;
        		
        	}
        }
        return i;
    }

    String[] colors() {
        return colors;
    }
}
