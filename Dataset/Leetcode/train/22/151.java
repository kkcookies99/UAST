 class Solution {
    public List<String> XXX(int n) {
	    	ArrayList<String> results=new ArrayList<String>();
	    	int leftnum=n,rightnum=n;
			parentheses("", results, leftnum, rightnum);
			return results;
	    }
		public static void parentheses(String sublist, ArrayList<String> results, int leftnum, int rightnum){
			if(leftnum==0&&rightnum==0)
				results.add(sublist);
			if(rightnum>leftnum)
				parentheses(sublist+")", results, leftnum, rightnum-1);
			if(leftnum>0)
				parentheses(sublist+"(", results, leftnum-1, rightnum);
		}
}

