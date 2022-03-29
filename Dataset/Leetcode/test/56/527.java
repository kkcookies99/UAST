 class Solution {
    public int[][] XXX(int[][] intervals) {
        List<int[]> list = Arrays.asList(intervals);
        list.sort((a, b) -> a[0]-b[0]);
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < list.size();) {
            int t = list.get(i)[1];
            int j = i+1;
            while (j < list.size() && list.get(j)[0] <= t) {
                t = Math.max(list.get(j)[1], t);
                j++;
            }
            res.add(new int[]{list.get(i)[0], t});
            i = j;
        }
        return res.toArray(new int[res.size()][2]);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


