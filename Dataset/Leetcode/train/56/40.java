class Solution {
    public int[][] XXX(int[][] intervals) {
        BitSet bitSet = new BitSet();
        for (int[] interval : intervals) {
            int left = 2*interval[0];
            int right = 2*interval[1]+1;
            bitSet.set(left, right);
        }
        int idx = 0;
        List<int[]> list = new ArrayList<>();
        while (idx < bitSet.length()) {
            int start = bitSet.nextSetBit(idx);
            int end = bitSet.nextClearBit(start);
            idx = end;
            list.add(new int[]{start/2, end/2});
        }
        return list.toArray(new int[][]{});
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


