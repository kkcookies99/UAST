 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        int len=numRows;
        int[][] res=new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) res[i][j]=1;
                else res[i][j]=res[i-1][j-1]+res[i-1][j];
            }
        }
        List<List<Integer>> lists=new ArrayList<>();
        for(int i=0;i<len;i++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                list.add(res[i][j]);
            }
            lists.add(list);
        }
        return lists;
    }
}

