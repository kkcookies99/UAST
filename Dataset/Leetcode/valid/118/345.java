 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result = new LinkedList<>();
        if (numRows < 1) {
            return result;
        }
        List<Integer> last = new ArrayList<>(1), temp;
        last.add(1);
        result.add(last);
        for (int i = 2; i <= numRows; i++) {
            temp = new ArrayList<>(i);
            temp.add(1);
            for (int j = 0; j < i - 2; j++) {
                temp.add(last.get(j) + last.get(j + 1));
            }
            temp.add(1);
            result.add(temp);
            last = temp;
        }
        return result;
    }
}

