 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            result.add(new ArrayList<>());
        }
        result.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i || j==0){
                    result.get(i).add(1);
                }else{
                    result.get(i).add(result.get(i-1).get(j) +result.get(i-1).get(j-1));
                }
            }
        }
        return result;
    }
}

