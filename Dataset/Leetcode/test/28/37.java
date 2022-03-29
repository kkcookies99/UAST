 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle.equals("")) return 0;
        int n1=haystack.length(),n2=needle.length();
        for(int i=0;i<=n1-n2;i++){
            if(haystack.substring(i).startsWith(needle))
                return i;
        }
        return -1;
    }
}
2、暴力求解法
public int XXX(String haystack, String needle) {
        if(needle.equals("")) return 0;
        int n1=haystack.length(),n2=needle.length();
        int i=0,j=0;
        while(i<n1-n2+1){
            while(j<n2&&haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            if(j==n2) return i-j;
            else {
                i=i-j+1;
                j=0;
            }
        }
        return -1;
    }
3、KMP算法
    public int XXX(String haystack, String needle) {
        if(needle.equals("")) return 0;
        int n1=haystack.length(),n2=needle.length();
        int[]next=new int[n2];
        getNext(next,needle);//计算子串中回退的位置
        int i=0,j=0;
        while(i<n1&&j<n2){
            if(j==-1||haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            else {
                j=next[j];//j回退
            }
            if(j==n2) return i-n2;
  
        }
        return -1;
    }
    public void getNext(int [] next, String t){
        //找到每个字符的前一个匹配位置
        int j=0,k=-1;
        next[0]=-1;
        while(j<t.length()-1){
            if(k==-1||t.charAt(j)==t.charAt(k)){
                k++;
                j++;
                next[j]=k;//如果匹配则前一个匹配位置为k,否则说明k在开头，则next[j]=0
            }
            else{
                k=next[k];//k调到上一个位置重新匹配
            }
        }

    }


