 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(numRows==0) return res;
        List<Integer> temp= new ArrayList<Integer>();
        temp.add(1);
        res.add(temp);
        if(numRows==1) return res;
        if(numRows>=2) {
	        for(int i=2;i<=numRows;i++){
	            List<Integer> ans=new ArrayList<Integer>();
	            ans.add(1);
	            for(int k=1;k<i-1;k++){ 
	                ans.add(res.get(i-2).get(k-1)+res.get(i-2).get(k));
	            }
	            ans.add(1);
	            res.add(ans);
	        }
	        return res;
    }
       return res;
    }
}

