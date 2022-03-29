 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> triangle = new ArrayList(numRows);
        if(numRows == 0) {
            return triangle;
        }
        triangle.add(new ArrayList(1));
        triangle.get(0).add(1);
        for(int i = 1; i < numRows; ++i) {
            triangle.add(new ArrayList(i + 1));
            List<Integer> preLevel = triangle.get(i - 1);
            List<Integer> currLevel = triangle.get(i);
            currLevel.add(1);
            int j = 1, mid = i / 2;
            while(j <= mid) {
                currLevel.add(preLevel.get(j - 1) + preLevel.get(j));
                ++j;
            }
            while(j <= i) {
                currLevel.add(currLevel.get(i - j));
                ++j;
            }        
        }
        return triangle;
    }
}

