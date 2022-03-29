 class Solution {
    public int[][] XXX(int[][] intervals) {
        List<int[]> list=new LinkedList<int[]>();
        for(int[] it:intervals){
            for(int i=0;i<list.size();){
                int[] temp=list.get(i);
                if(isInterSect(it,temp)){
                    it=XXX(it,temp);
                    list.remove(i);
                }else{
                    i++;
                }
            }
            list.add(it);
        }
        int[][] res=new int[list.size()][];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
    boolean isInterSect(int[] intv1,int[] intv2){
        if(intv1[1]<intv2[0]) return false;
        if(intv2[1]<intv1[0]) return false;
        return true;
    }
    int[] XXX(int[] iv1,int[] iv2){
            return new int[]{
                Math.min(iv1[0],iv2[0]),Math.max(iv1[1],iv2[1])
        };
    }
}
