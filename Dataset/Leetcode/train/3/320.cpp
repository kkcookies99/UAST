 class Solution {
public:
    int XXX(string s) {
        int i=0;int j=1;
        int temp=1;
        int len=1;
        if(s==""){
            return 0;
        }
        while(i<s.size()-len){
            int flag=0;
            for(int n=0;n<j-i;n++){
                if(s[i+n]==s[j]){
                    i=i+n+1;
                    flag=1;
                    temp=j-i+1;
                    break;
                }
            }
            if(flag==0){
               temp++;
               if(temp>=len){
                   len=temp;
               }
            }
            j++;   
        }
        return len;
    }
};

