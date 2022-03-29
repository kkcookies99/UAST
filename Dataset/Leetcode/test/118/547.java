 public List<List<Integer>> XXX(int numRows) {
    List<List<Integer>> res = new ArrayList<>();
    for(int i = 0; i< numRows; i++) {
        List<Integer> thisRow = new ArrayList<>();
	List<Integer> upRow = new ArrayList<>();
	if(i == 0) {
	    thisRow.add(1);
	}else {
	    upRow = res.get(i-1);
	    for(int j = 0; j<=i; j++) {
		if(j == 0) {
	            thisRow.add(1);
		    continue;
		}else if(j == i) {
		    thisRow.add(1);
		    continue;
		}else {
		    thisRow.add(upRow.get(j-1)+upRow.get(j));
		    continue;
		}			
	    }
	}
	res.add(thisRow);		
    }	
    return res;
}

