class Solution {
    int[] arr;
    List<List<Integer>> ls=new ArrayList();
    public List<List<Integer>> XXX(int[] nums) {
        this.arr=nums;
        int n=nums.length;
        for(int i=0;i<=n;i++){
            dfs(0,0,i,new ArrayList<Integer>());
        }
        return ls;
    }
    public void dfs(int idx,int k,int n,List<Integer> temp){
        if(k==n){
            ls.add(new ArrayList(temp));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            temp.add(arr[i]);
            dfs(i+1,k+1,n,temp);
            temp.remove(temp.size()-1);
        }
    }
}

