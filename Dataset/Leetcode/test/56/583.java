 class Solution {
    public int[][] XXX(int[][] intervals) {

        List<int[]> source = new ArrayList<>(Arrays.asList(intervals));
        
        while (true) {
            boolean XXXDone = true;
            for (int i = 0; i < source.size() - 1; i++) {
                for (int j = i + 1; j < source.size(); j++) {
                    if (source.get(i)[1] < source.get(j)[0] || source.get(i)[0] > source.get(j)[1]) {
                        continue;
                    }

                    source.get(i)[0] = Math.min(source.get(i)[0], source.get(j)[0]);
                    source.get(i)[1] = Math.max(source.get(i)[1], source.get(j)[1]);
                    source.remove(j--);
                    XXXDone = false;
                }
            }

            if (XXXDone) {
                break;
            }
        }

        int[][] ret = new int[source.size()][2];
        for (int i = 0; i < source.size(); i++) {
            ret[i][0] = source.get(i)[0];
            ret[i][1] = source.get(i)[1];
        }

        return ret;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


