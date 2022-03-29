 class Solution {
    public void XXX(int[] nums) {
        //partition排序，target为1的话，一次就可以完成
        //额外空间,遍历一遍，记录0,1,2出现次数后再遍历一遍赋值
        partition(nums,0,nums.length-1,1);
        
    }
    
    //荷兰国旗，对tar进行快排
    //核心思想，左中右三块区域，碰到小的换前面去，碰到大的换后面去，碰到相等的不动
    private void partition(int[] arr,int l,int r,int tar){
        int less = l-1,more = r+1;
        int i = l;
        while(i<more){
            if(arr[i] == tar){
                ++i;
            }else if(arr[i] < tar){
                swap(arr,i++,++less);
            }else{
                swap(arr,i,--more);
            }
        }
    }
    
    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

