 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>>list=new LinkedList<List<Integer>>();
        if(numRows==0){
            return list;
        }
        List<Integer>templist1=new LinkedList<Integer>();
        List<Integer>templist2=new LinkedList<Integer>();
        templist1.add(1);
        list.add(templist1);
          if(numRows==1){
            return list;
        }
        templist2.add(1);
        templist2.add(1);
        list.add(templist2);
          if(numRows==2){
            return list;
        }
        for(int n=2;n<numRows;n++){
            List<Integer>templist=new LinkedList<Integer>();
            templist.clear();
            templist.add(1);
            for(int i=1;i<n;i++){
                int tempint=list.get(n-1).get(i-1)+list.get(n-1).get(i);
                templist.add(tempint);
            }//end for i
            templist.add(1);
            list.add(templist);
        }//end for n
        return list;


    }//end method
}//end class

