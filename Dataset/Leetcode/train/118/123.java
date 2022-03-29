 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i = 0; i < numRows; i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){//1
        	    list.add(1);
        	}else{//a[i][j] = a[i-1][j-1] + a[i-1][j]
        	    list.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
        	}
            }
            ans.add(list);
        }
        
        return ans;
    }
}

