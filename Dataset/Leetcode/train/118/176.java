 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i < numRows;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0;j < i+1;j++){
                //前后部分为1
                if(j == 0 || j == i){
                    temp.add(1);
                    continue;
                }
                //当前值会等于list.get(i-1).get(j)+list.get(i-1).get(j-1)
                temp.add(list.get(i-1).get(j)+list.get(i-1).get(j-1));
            }
            list.add(temp);
        }
        return list;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


