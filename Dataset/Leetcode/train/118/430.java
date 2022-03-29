 class Solution {
    public List<List<Integer>> XXX(int numRows) {
                     List<List<Integer>> lists =new ArrayList<>(numRows);
            for(int i=1;i<=numRows;i++){
                List<Integer> list =new ArrayList<>(i);
                for(int j=1;j<=i;j++){
                    if(j==1||j==i){
                        list.add(1);
                        }else {
                            if(i>1){
                                List<Integer> list1 = lists.get(i-2);

                                    list.add(list1.get(j-2)+list1.get(j-1)); 
                            }

                    }
                }
                lists.add(list);
            }
            return lists;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


