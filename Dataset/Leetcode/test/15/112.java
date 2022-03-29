 class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> XXX(int[] num){
        boolean[] isVisited = new boolean[num.length];
        Arrays.sort(num);
        dfs(num,0,0,new ArrayList<>(),isVisited);
        return res;
    }
    void dfs(int[] num,int sum,int cur,List<Integer> list,boolean[] isVisited){
        if (list.size()!=0 && list.get(0) >0)return;
        if (list.size() > 3) return;
        if (list.size() == 3 && sum == 0){
            res.add(list);
            return;
        }
        for (int i = cur; i < num.length; i++) {
            //需要去重
            if (i >0 && !isVisited[i-1] && num[i] == num[i-1]) continue;
            if (isVisited[i]) continue;
            isVisited[i] = true;
            List<Integer> tempList = new ArrayList<>(list);
            tempList.add(num[i]);
            dfs(num,sum-num[i],i,tempList,isVisited);
            isVisited[i] = false;
        }
    }
}

