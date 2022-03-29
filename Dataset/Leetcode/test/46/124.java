class Solution {
    public List<List<Integer>> ans = new ArrayList<>();

    public int len = 0;

    public void swap(int[] number,int a,int b){
        int temp = number[a];
        number[a] = number[b];
        number[b] = temp;
    }
    public List<List<Integer>> XXX(int[] nums) {
        len = nums.length;
        sonSolve(nums,0);
        return ans;
    }

    public void sonSolve(int[] nums,int N){
        if(N == len){
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<len;i++){
                temp.add(nums[i]);
            }
            ans.add(temp);
            return ;
        }
        for(int i=N;i<len;i++){
            swap(nums,N,i);
            sonSolve(nums,N+1);
            swap(nums,N,i);
        }
    }
}

