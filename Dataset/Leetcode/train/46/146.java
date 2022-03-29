class Solution {
    List<List<Integer>> ListB=new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        int n=nums.length;
        perm(nums,0,n-1);
        return ListB;
    }
    public void swap(int[] A,int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    
    public void perm(int[] a,int q,int p){
        if(q==p){
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<=p;i++){
                list.add(a[i]);
            }
            this.ListB.add(list);
        }
        for(int i=q;i<=p;i++){
            swap(a,q,i);
            perm(a,q+1,p);
            swap(a,q,i);
        }
    }
}

