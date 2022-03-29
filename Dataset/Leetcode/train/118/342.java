 class Solution {
    public List<List<Integer>> XXX(int numRows) {

        List<List<Integer>> yh = new ArrayList();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList();
            yh.add(row);
            List<Integer> preRow = i != 0 ? yh.get(i-1):null;
            for (int j = 0; j <= i; j++) { 
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(preRow.get(j-1) + preRow.get(j));
                }
            }
            
        }
        return yh;

    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


