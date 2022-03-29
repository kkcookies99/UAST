class Solution {
public:
    string XXX(int n) {
        string pre = "1";
        if(n==1)return pre;
        while(--n){
            int num = 1,i = 0,length = pre.length();
            string temp = "";
            while(i<length){
               if(i==0){
                   i++;continue;
               }
               if(pre[i-1]!=pre[i]){
                   temp+=to_string(num)+pre[i-1];
                   num = 1;
               }else{
                   num++;
               }
               i++;
            }
            temp+=to_string(num)+pre[length-1];
            pre = temp;
        }
        return pre;
    }
};

