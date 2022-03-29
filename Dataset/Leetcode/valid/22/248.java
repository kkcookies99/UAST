 class Solution {
    public List<String> XXX(int n) {
        List<String> result = new ArrayList<>();
        char[] condition = new char[n * 2];
        // since the first bracket and the last bracket must be ( and ) respectively, then preset
        condition[0] = '(';
        condition[condition.length - 1] = ')';
        // recursively assign ( to specific positions
        findNext(condition, 1, 0, 0, n, result);
        return result;
    }

    // count: how many ( has been specified
    // remain: how many positions(i.e. empty positions) can ) to fit between current waiting ( and the first (
    // preIndex: index of last (
    // n: input n
    private void findNext(char[] condition, int count, int remain, int preIndex, int n, List<String> result) {
        if (count == n) {
            // fill empty positions with )
            for (int i = 0; i < n * 2; i++) {
                if (condition[i] != '(') {
                    condition[i] = ')';
                }
            }
            result.add(new String(condition));
            return;
        }
        // the choice of current waiting ( must be in a range that
        // the empty positions between current waiting ( and the first ( cannot be larger than
        // the number of previous ('s, or more ) would be produced and violate the rule of valid brackets.
        for (int i = preIndex + 1; i < preIndex + 1 + count - remain + 1; i++) {
            char[] temp = new String(condition).toCharArray();
            temp[i] = '(';
            findNext(temp, count+1, i-count, i, n, result);
        }
    }
}

