 class Solution {
    public List<List<Integer>> XXX(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1;i <= numRows;i++){
            List<Integer> rec = new ArrayList<>();
            List<Integer> last = null;
            if(i != 1){
                last = ans.get(i-2);
            }
            for(int j = 1;j <= i;j++){
                if(j == 1 || j == i){
                    rec.add(1);
                }
                else if(j <= last.size()){
                    rec.add(last.get(j-1) + last.get(j-2));
                }
            }
            ans.add(rec);
        }
        return ans;
    }
}

