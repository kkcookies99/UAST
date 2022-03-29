 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1) {
			return s;
		}
        int n=s.length();
		char [] b=s.toCharArray();
		int i=0,j=0;
		String [] aStrings=new String[numRows];
		for(int q=0;q<numRows;q++) {
			aStrings[q]="";
		}
		boolean flag=true;
		while(i<n) {
			if(flag) {
				
				while(j<numRows&&i<n) {
					aStrings[j]=aStrings[j]+b[i];
					j++;
					i++;
				}
				flag=false;
			}else {
				j--;
				while(j>0&&i<n) {
					j--;
					aStrings[j]=aStrings[j]+b[i];
					i++;
				}
				j++;
				flag=true;
			}
		}
		s="";
		for(int q=0;q<numRows;q++) {
			s=s+aStrings[q];
		}
		return s;
    }
}

