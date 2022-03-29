 class Solution {
    public int XXX(String str) {
		 StringBuffer buffer=new StringBuffer();
		 str=str.trim();//去空格
		 if(str.length()==0)
			 return 0;
		 if(str.charAt(0)=='-' || str.charAt(0)=='+' || (str.charAt(0)>='0' && str.charAt(0)<='9')) {
			 int i = 0;
			 int flag=0;//用来区分正负数 1负
			 if(str.charAt(0)=='-') {
				 if(str.length()<2)
					 return 0;	
				 flag=1;//置1
				 i=1;
			 }else if(str.charAt(0)=='+'){
				 if(str.length()<2)
					 return 0;
				 i=1;
			 }
			 for(;i<str.length();i++) {
				 if(str.charAt(i)>='0' && str.charAt(i)<='9') {
					 buffer.append(str.charAt(i));
				 }else {
					 break;
				 }
			 }
			 if(buffer.toString().length()==0)
				 return 0;
			 double b=Double.parseDouble(buffer.toString());
			 if(flag==1)
				 b=-b;
			 if(b>Integer.MAX_VALUE) {
				 return Integer.MAX_VALUE;
			 }else if(b<Integer.MIN_VALUE) {
				 return Integer.MIN_VALUE;
			 }else {
				 return (int)b;
			 }
		 }else {
			 return 0;
		 }
	 }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


