 class Solution {
    public List<List<Integer>> XXX(int numRows) {
         List<List<Integer>> nums=new ArrayList<>();
         if(numRows==0)return nums;
         int[][] arr=new int[numRows][numRows];
        for(int i=0;i<numRows;i++)
        {
            List<Integer> num=new ArrayList<>();
            for(int j=0;j<i+1;j++)
            {
                if(i<=1||j==0) {
                    arr[i][j] = 1;
                    num.add(1);
                    continue;
                }
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                num.add(arr[i][j]);
            }
            nums.add(num);
        }

        return nums;
    }
}

