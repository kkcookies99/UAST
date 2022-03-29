 class Solution {
     int [] range=new int[2];//起始位置

    public String XXX(String s) {
        int n=s.length();
        if (n==0 || n==1){
            return s;
        }
        char [] ss =s.toCharArray();//转化为字符数组
        for (int i=1;i<n;i++){
            ishui(ss,n,i,i);
            ishui(ss,n,i-1,i);//两种情况，一是像abc这种以一个为中心，二是像abba、abbc这种，以两个为中心
            //
        }

return s.substring(range[0],range[1]);
    }

    public void ishui(char [] ss,int n,int start,int end){
        while (start>=0 && end<=n-1){//start和end满足条件就继续两边变扩散
            if (ss[start]==ss[end]){//第一种情况，b=b 时，往两边扩散。a=a，继续执行直到break
                //第二种情况，b=b，继续扩散，a！=c，继续执行直到break
                //两种情况同时执行，取其中最大者
                start--;
                end++;
            }else {
                break;
            }//break后start和end的值会往两边多扩散一步
        }
        if (end-(start+1)>range[1]-range[0]){//更新range
            range[0]=start+1;
            range[1]=end;
        }
    }
}

