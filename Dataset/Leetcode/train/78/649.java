 public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            list.addAll(combine(nums.length,i,nums));
        }
        List<Integer> it = new ArrayList<>();
        list.add(it);
        return list;
    }
    
    public static List<List<Integer>> combine(int n, int k,int[] num) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> now=new ArrayList<Integer>();
        find(1,now,list,n,k,num);
        return list;
    }
    
    public static void find(int start,List<Integer> now,
                            List<List<Integer>> list,int n, int k,int[] num){
        if(k==0){
            list.add(new ArrayList(now));
            return;
        }
        for(int i=start;i<=n-k+1;i++){
            now.add(num[i-1]);
            find(i+1,now,list,n,k-1,num);
            now.remove(now.size()-1);
        }
    }

