 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List list=new ArrayList();
        //type[]用于存储上一层的数组信息
        int[] type =new int[numRows];
        for(int i=0;i<numRows;i++){
            int[] arr=new int[i+1];
            for(int j=i;j>=0;j--){
                //将数组的头和尾都改成1
                if(j==i || j==0){arr[j]=1;}
                else{
                    //当前数组从后往前，除了尾部，倒数第二个等于上一层同一下标的值加该数之前的值（第四层第三个的值=第三层第三个+第三层第二个）
                    arr[j]=type[j]+type[j-1];
                }

            }
            //将改好的这一层数据存入链表的第i层
            list.add(arr);
            //因为已经存储，所以更新上层数组信息用于下一层的计算
            for(int k=0;k<arr.length;k++){
                type[k]=arr[k];
            }
        }
        return list;
    }
}

