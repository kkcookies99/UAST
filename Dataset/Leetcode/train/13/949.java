 class Solution {
    public int XXX(String s) {
		 char[] c=s.toCharArray();
		 int[] ins=new int[c.length];
		 for(int i=0;i<c.length;i++){
			 switch(c[i]){
			 case 'I':
				 ins[i]=1;
				 break;
			 case 'V':
				 ins[i]=5;
				 break;
			 case 'X':
				 ins[i]=10;
				 break;
			 case 'L':
				 ins[i]=50;
				 break;
			 case 'C':
				 ins[i]=100;
				 break;
			 case 'D':
				 ins[i]=500;
				 break;
			 case 'M':
				 ins[i]=1000;
				 break;
			 }
		 }
		 int sum=0;
		 for(int j=0;j<ins.length-1;j++){
			 if(ins[j]<ins[j+1]){
				 sum-=ins[j];
			 }else{
				 sum+=ins[j];
			 }
		 }
		 sum+=ins[ins.length-1];
		 return sum;
	    }
}

