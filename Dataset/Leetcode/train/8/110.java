class Solution {
    public int XXX(String str) {
        char flag=0;
        String mid="";
        int o=0;
    for(int i=0;i<str.length();i++)
{
if(o==2) {break;}
char h=str.charAt(i);
if(o==0) {
if(str.charAt(i)=='-') {flag=str.charAt(i);o=1;continue;}
if(str.charAt(i)=='+') {flag=str.charAt(i);o=1;continue;}}
long k =(long)h-48;
if(o==0&&(k>9||k<0)&&k!=-16)return 0;
if(k<=9&&k>=0){
o=1;
mid=mid+String.valueOf(k);
}
else {
	if(o==1)o=2;
	continue;}
}
try{
if(mid=="") return 0;
int t=Integer.parseInt(mid);
if(flag=='-') return -t;
else return t;
}
catch(Exception e){
if(flag=='-') {return -2147483648;}
else return 2147483647;
}
    }
}


