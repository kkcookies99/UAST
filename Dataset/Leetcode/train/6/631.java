 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1) {return s;}
    	
    	int curRow = 0;
    	boolean goingDown = false;
    	List<StringBuilder> myList = new ArrayList<>();
    	for(int i = 0; i < Math.min(numRows, s.length()); i++) {
    		myList.add(new StringBuilder());
    	}
    	
    	for(char tempC : s.toCharArray()) {
    		myList.get(curRow).append(tempC);
    		if(curRow == 0 || curRow == numRows - 1) {goingDown = !goingDown;}
    		curRow += goingDown == false ? -1 : 1;
    	}
    	
    	StringBuilder resultBuilder = new StringBuilder();
    	for(StringBuilder tempBuilder : myList) {
    		resultBuilder.append(tempBuilder);
    	}
    	return resultBuilder.toString();
    }
}

