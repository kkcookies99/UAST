 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        if(numRows==0){
            return list;
        }
        list.add(Arrays.asList(new Integer(1)));
        for (int i = 1; i < numRows; i++) {
            List<Integer> temp=new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                temp.add(get(list,i-1,j)+get(list,i-1,j-1));
            }
            list.add(temp);
        }
        return list;
    }

    public int get(List<List<Integer>> list,int i,int j){
        if(i<0||j<0||j>=list.get(i).size()){
            return 0;
        }
        return list.get(i).get(j);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


