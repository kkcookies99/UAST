 class Solution {
    public int[][] XXX(int[][] intervals) {
        if (intervals.length<=1 || intervals==null){
            return intervals;
        }
        Stack<Integer> stack = new Stack<>();

        //排序
       Arrays.sort(intervals, new Comparator<int[]>() {
           @Override
           public int compare(int[] a, int[] b) {
               if (a[0]==b[0]){
                   return a[1]-b[1];
               }
               return a[0]-b[0];
           }
       });

       //初始化栈，将第一个和第二个数字入栈
        stack.push(intervals[0][0]);
        stack.push(intervals[0][1]);
        int n=intervals.length;//行数
        for (int i=1;i<n;i++){
            for (int j=0;j<2;j++){
                if (intervals[i][0]<=stack.peek()){//如果第一个数字小于栈顶元素
                    if(intervals[i][1]<=stack.peek()){//并且第二个数字也小于栈顶元素，说明当前得区间已经包含在上一个区间里了
                        break;//比如[1,4][2,3]
                    }
                    stack.pop();//否则更换栈顶元素
                    stack.push(intervals[i][1]);
                    break;
                }else {//如果第一个数字大于栈顶元素，则将这行得两个数字都入栈
                    stack.push(intervals[i][0]);
                    stack.push(intervals[i][1]);
                    break;
                }

            }
        }

        int size=stack.size();
        int [][] result= new int[size/2][2];
        for (int i=size/2-1;i>=0;i--){
            for (int j=1;j>=0;j--){
                result[i][j]=stack.pop();
            }
        }
        return result;
    }
}

