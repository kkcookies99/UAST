 class Solution {
    public List<List<Integer>> XXX(int numRows) {
          	if(numRows==1) {
    		List<List<Integer>> list=new ArrayList<List<Integer>>();
        	List<Integer> list0=new ArrayList<Integer>();
        	list0.add(1);
    		list.add(list0);
    		return list;
    	}else if(numRows==2){
        	List<Integer> list1=new ArrayList<Integer>();
        	list1.add(1);
        	list1.add(1);
        	List<List<Integer>> list=XXX(1);
        	list.add(list1);
        	return list;
    	}else {
    		List<List<Integer>> list=XXX(numRows-1);
    		List<Integer> listx=new ArrayList<Integer>();
    		for(int i=0;i<numRows;i++) {
    			if(i==0 || i==numRows-1) {
    				listx.add(1);
    			}else {
    				listx.add(list.get(numRows-2).get(i-1)+list.get(numRows-2).get(i));
    			}
    		}
    		list.add(listx);
    		return list;
    		
    	}
    }
}

