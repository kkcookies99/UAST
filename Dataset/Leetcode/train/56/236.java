 class Solution {
    public int[][] XXX(int[][] intervals) {
        List<int[]> ls = new ArrayList<>();
        int[] f = new int[10005];
        boolean[] v = new boolean[10005];
        for(int[] p:intervals){
            f[p[0]]++;
            f[p[1]]--;
            if(p[0]==p[1]){
                v[p[0]]=true;
            }
        }
        
        int l=-1;
        for(int s=0,i=0;i<10001;++i){
            s+=f[i];
            if(s>0 && l==-1) l = i;
            else if(f[i]<0 && s==0){
                ls.add(new int[]{l,i});
                l=-1;
            }else if(v[i] && l==-1){
                ls.add(new int[]{i,i});
            }

        }
        int[][] rs = new int[ls.size()][2];
        for(int i=0;i<ls.size();++i){
            rs[i]=ls.get(i);
        }
        return rs;
    }
}

