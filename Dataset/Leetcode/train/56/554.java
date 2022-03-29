 class Solution {
    public int[][] XXX(int[][] intervals) {
        int n=intervals.length;
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++) set.add(i);//初始化所有的区间都需要保留
        int i1,i2,j1,j2;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                i1=intervals[i][0];j1=intervals[i][1];
                i2=intervals[j][0];j2=intervals[j][1];
                if(!(j1<i2||j2<i1)){ //判断两个区间是否重叠
                   set.remove(i);//合并后删去前面的区间
                   if(i1<i2) {i2=i1;intervals[j][0]=i2;}
                   if(j1>j2) {j2=j1;intervals[j][1]=j2;}
                   break;//当前区间i不需要继续访问了
                }
            }
        }
        //最后仍然保留的是结果集
        int size=set.size();
        int[][]res=new int[size][2];
        int i=0;
        for(Integer x: set){
            res[i]=intervals[x];
            i++;
        }
        return res;

    }
}

