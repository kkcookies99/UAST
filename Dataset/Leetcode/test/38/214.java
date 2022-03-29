class Solution {
    public String XXX(int n) {
        if(n==1)
			return new StringBuilder(1+"").toString();
		else {
			
			String s=XXX(n-1);
			StringBuilder temp=new StringBuilder();
			if(s.length()==1) {
				return new StringBuilder("1").append(s).toString();
			}
			for(int i=0;i<s.length();i++) {
				int countNum=1;
				while(i<s.length()-1&&s.charAt(i)==s.charAt(i+1)) {
					countNum++;
					i++;
				}
				temp.append(countNum).append(s.charAt(i));		
			}
			return temp.toString();
		}
    }
}

