 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        Integer [][]num=new Integer[numRows][];
        for(int i=0;i<numRows;i++){
            num[i]=new Integer[i+1];
            num[i][0]=1;
            for(int j=1;j<i;j++)
            num[i][j]=num[i-1][j]+num[i-1][j-1];
            num[i][i]=1;
        }
        List<List<Integer>>list=new ArrayList();
        for(Integer []n:num){
            list.add(Arrays.asList(n));
        }
        return list;
    }
}

