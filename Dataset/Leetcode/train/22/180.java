 public List<String> XXX(int n) {
   List<String> temp=new ArrayList<>();
	 if(n==1) {
		 temp.add("()");
		 return temp;
	 } 

	 List<String> preList=XXX(n-1);

	for(int i=0;i<preList.size();i++) {
		String tp= preList.get(i);
		// 插入
		for(int j=0;j<tp.length();j++) {
			String newStr=tp.substring(0, j)+"()"+tp.substring(j, tp.length());
			if(!temp.contains(newStr)) {
				temp.add(newStr);
			}
		}
	 }
	 
	 return temp;