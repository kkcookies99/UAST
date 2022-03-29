 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        res.add(temp);

        if(numRows==1){
            return res;
        }else{
            for(int j=2;j<=numRows;j++){
                List<Integer> temp1 = new ArrayList<Integer>();
                List<Integer> tt = res.get(j-2);
                int size = tt.size();
                int[] pre = new int[size];
                for(int i=0;i<size;i++){
                    pre[i] = tt.get(i);
                }
                for(int i=0;i<j;i++){
                    if(i==0||i==j-1){
                        temp1.add(1);
                    }else{
                        temp1.add(pre[i-1] + pre[i]);
                    }
                }
                res.add(temp1);
            }
        }
        return res;
    }
}

