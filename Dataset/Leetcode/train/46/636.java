 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
      List<List<Integer>> res = new ArrayList<>();
      if(nums.length == 0) return res;
      preHelper(nums,0,res);
      return res;
    }
    public void preHelper(int[] arr,int i,List<List<Integer>> res){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int k=0;k<arr.length;k++){
            list.add(arr[k]);
        }
    
          if(i==arr.length-1){
           if(!res.contains(list)) res.add(list);
       }else{
           for(int j = i;j<arr.length;j++){
           swap(i,j,arr);
           preHelper(arr,i+1,res);
           swap(i,j,arr);
           }
       }
    }
    public void swap(int a,int b, int[] arrs){
        int temp = arrs[a];
        arrs[a] = arrs[b];
        arrs[b] = temp;
    }
}

