 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        XXX(nums, 0, nums.length-1,res);
        return res;
    
    }
    
    private void XXX( int[] A,int low, int high, List<List<Integer>> res){
        if(low==high){
            res.add(copy(A));
        }else {
            for(int i=low; i<=high; i++){
                swap(A,i,low);
                XXX(A,low+1,high,res);
                swap(A,low,i);
            }
        }
    }

    public static void swap(int[] A,int a,int b){
        int tem = A[a];
        A[a] = A[b];
        A[b] = tem;
    }

    public static List<Integer> copy(int [] A){
        List<Integer> lst = new ArrayList<>();
        for(int i: A){
            lst.add(i);
        }
        return lst;
    }
}
code block

