 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 1){
            result.add(List.of(1));
            return result;
        }
        if(numRows == 2){
            result.add(List.of(1));
            result.add(List.of(1,1));
            return result;
        }
        result.add(List.of(1));
        result.add(List.of(1,1));
        while(result.size() != numRows){
            List<Integer> pre = result.get(result.size()-1);
            LinkedList<Integer> next = new LinkedList<>();
            for(int i = 0; i < pre.size()-1; i++){
                next.add(pre.get(i)+pre.get(i+1));
            }
            next.addFirst(1);
            next.addLast(1);
            result.add(next);
        }
        return result;
    }
}

