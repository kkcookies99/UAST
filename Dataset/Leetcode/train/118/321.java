 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        Integer[] arr = new Integer[numRows];
        List<List<Integer>> res = new LinkedList<>();

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j >= 0; j--) {
                if (j == 0 || j == i) {
                    arr[j] = 1;
                } else {
                    arr[j] += arr[j - 1];
                }
            }
            res.add(Arrays.asList(Arrays.copyOfRange(arr, 0, i + 1)));
        }

        return res;
    }
}

