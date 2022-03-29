 class Solution {
    public List<List<Integer>> XXX(int numRows) {

        List<List<Integer>> result = new ArrayList(numRows);

        for (int i = 0; i < numRows; i++) {

            List<Integer> current = result.size() == 0 ? new ArrayList() : result.get(result.size()-1);
            result.add(calcNext(current));
        }

        return result;
    }

    private List<Integer> calcNext(List<Integer> prev){

        List<Integer> result = new ArrayList(prev.size() + 1);

        //设置头
        result.add(1);
        if (prev.size() == 0) return result;

        //根据上一层进行计算i
        for(int i = 1; i < prev.size(); i++){
            result.add(prev.get(i-1) + prev.get(i));
        }

        //设置尾
        result.add(1);

        return result;
    }
}


