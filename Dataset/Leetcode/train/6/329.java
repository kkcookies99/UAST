 class Solution {
    public String XXX(String s, int numRows) {
        int direction=1;//0上 1下
		int count=0;
        if(numRows==1 || s.length()<numRows)
            return s;
        
		String [] strs=new String[numRows];
		for(int i=0;i<s.length();i++) {
			if(strs[count]==null)
				strs[count]="";
			if(direction==1) {
				strs[count++]+=s.charAt(i);
				if(count==numRows-1) {
					direction=0;
				}
			}else if(direction==0) {
				strs[count--]+=s.charAt(i);
				if(count==0) {
					direction=1;
				}
			}
		}
		StringBuffer buffer=new StringBuffer();
		
		for(int i=0;i<numRows;i++) 
			buffer.append(strs[i]);
        return buffer.toString();
    }
}

