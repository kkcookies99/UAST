 class Solution {
    public int[][] XXX(int[][] intervals) {
        List<int[]> list=new ArrayList<>();
        for(int[] a:intervals){
            list.add(a);
        }
        Collections.sort(list,(int[] a,int[] b)->{return a[0]==b[0]?(a[1]-b[1]):(a[0]-b[0]);});
        ArrayList<int[]> res=new ArrayList<>();
        res.add(list.get(0));
        for(int i=1;i<list.size();i++){
            int[] cur=list.get(i);
            int[] last=res.get(res.size()-1);
            res.remove(res.get(res.size()-1));
            List<int[]> temp=XXX(last,cur);
           for(int[] a:temp){
               res.add(a);
           }
        }
        int[][] ans=new int[res.size()][2];
        int i=0;
        for(int[] a:res){
            ans[i++]=a;
        }
        return ans;
    }
    private List<int[]> XXX(int[] a,int[] b){
        List<int[]> list=new ArrayList<>();
        if(a[1]<b[0]){
            list.add(a);
            list.add(b);
        }else{
            list.add(new int[]{a[0],Math.max(a[1],b[1])});
        }
        return list;
    }
}

