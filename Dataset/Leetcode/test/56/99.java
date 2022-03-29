public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){
            @Override
            public int compare(int[] x,int[] y){
                return x[0]-y[0];
            }
        });
        int n=intervals.length;
        List<int[]> ls=new ArrayList();
        int[] temp=new int[2];
        temp[0]=intervals[0][0];
        temp[1]=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=temp[1]){
                temp[1]=Math.max(temp[1],intervals[i][1]);
            }else{
                ls.add(temp);
                temp=new int[]{intervals[i][0],intervals[i][1]};
            }
        }
        ls.add(temp);
        int[][] res=new int[ls.size()][2];
        for(int i=0;i<ls.size();i++){
            res[i]=ls.get(i);
        }
        return res;
    }

