 class Solution {
    public String XXX(String a, String b) {
        int[] x=change(a);
        int[] y=change(b);
        StringBuilder str=new StringBuilder();
        Boolean flag=false;
        int length=Math.max(x.length,y.length);
        int minlength=Math.min(x.length,y.length);
        int[] res=new int[length];
        for(int i=length-1;i>=0;i--){
            if(x.length>y.length)
	        res[i]=x[i]+((minlength-(length-i)>=0)?y[minlength-(length-i)]:0)+(flag?1:0);
	        else
	        res[i]=y[i]+((minlength-(length-i)>=0)?x[minlength-(length-i)]:0)+(flag?1:0);
            if(res[i]==2){
                flag=true;
                res[i]=0;
            }
            else if(res[i]==3){
                flag=true;
                res[i]=1;
            }
            else flag=false;
        }
     if(flag){
	            int[] res_0=new int[length+1];
	                res_0[0]=1;
	                str.append(res_0[0]);
	            for(int j=1;j<=length;j++) {
	                res_0[j]=res[j-1];
	            	str.append(res_0[j]);
	            	}
	                return str.toString();
	        }
	        else {  for(int k=0;k<length;k++)
	        	str.append(res[k]);
	        return str.toString();
                 }
    }
public int[] change(String s){
    int[] temp=new int[s.length()];
    for(int i=0;i<s.length();i++){
        temp[i]=s.charAt(i)-'0';
    }
    return temp;
        
}
}

