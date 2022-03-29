 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        XXX(0, numRows, result);
        return result;
    }

    public void XXX(int rows, int numRows, List<List<Integer>> result) {
         //最后一层
         if(rows == numRows){
            return;
         }
         result.add(new ArrayList<>());
         //第一个数
         result.get(rows).add(1);
         for(int i = 1; i <= rows; i++){
            //最后一个数
             if(i == rows){
                result.get(rows).add(1);
                break;
             }
             result.get(rows).add(result.get(rows-1).get(i-1)+result.get(rows-1).get(i));
         }
         XXX(rows+1, numRows, result);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


