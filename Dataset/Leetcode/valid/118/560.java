 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        ArrayList<List<Integer>> list1=new ArrayList<>();
		for(int i=0;i<numRows;i++){
			ArrayList list=new ArrayList();			
			if(i==0){
				list.add(1);
				list1.add(list);				
				
			}else{
			for(int j=0;j<=i;j++){
				if(j==0||j==i){
					list.add(1);
					
					}else{
		list.add(j, list1.get(i-1).get(j-1)+list1.get(i-1).get(j));
					}
			}
			list1.add(list);
			}
		}
		return list1;
    }
}

