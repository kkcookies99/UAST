 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> ans=new LinkedList<>();
        int i,j;
        int[] tmp=new int[numRows];
        int[] cur=new int[numRows];
        for(i=1;i<numRows+1;i++){
            List<Integer> res=new LinkedList<>();
            cur[0]=1;
            cur[i-1]=1;
            for(j=1;j<i-1;j++){
                cur[j]=tmp[j-1]+tmp[j];
            }
            for(j=0;j<i;j++){
                res.add(cur[j]);
                tmp[j]=cur[j];
            }
            ans.add(new LinkedList<Integer>(res));
        }
        return ans;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


