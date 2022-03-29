 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        //int level = 1;
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows == 0) return ans;
        List<Integer> preList = new ArrayList<>(){{add(1);}};//保留上一层的状态
        ans.add(preList);
        for(int i = 2 ; i <= numRows ; i++) {
            List<Integer> curList = new ArrayList<>();
            curList.add(1);
            for(int j = 0 ; j < i - 2 ; j++) {
                curList.add(preList.get(j) + preList.get(j+1));
            }
            curList.add(1);
            ans.add(curList);
            preList = curList;
        }
        return ans;
    }
}

