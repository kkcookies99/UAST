 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list1=new ArrayList<List<Integer>>();
        //定义二维数组
        int[][] arr=new int[numRows][numRows];
        for(int i=0;i<numRows;i++){
            List<Integer> list2=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    arr[i][j]=1;
                }else{
                   arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
                list2.add(arr[i][j]);
            }
            list1.add(list2);
        }
        return list1;
    }
}

