 class Solution {
    public String XXX(String s) {
        int i,j,z,x;
		String max=String.valueOf(s.charAt(0)),str;
		for(i=0;i<s.length();i++) {
			for(j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					z=i;x=j;
					while(s.charAt(z)==s.charAt(x)&&z<x) {
						z++;
						x--;
					}
					if(z>=x) {
						str=s.substring(i,j+1);
						if(str.length()>max.length()) {
							max=str;
						}
					}
					
				}
			}
		}
		
		
		 return max;
    }
}

