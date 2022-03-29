 class Solution {
public:
    int XXX(string s) {
        int size=s.size();
        int i=size-1;
        int count=0;
        int flag=0;
        while(i>=0){
            if(flag){
                if(s[i]==' ')
                    return count;
                else
                    i--;
                    count++;
            }
            if(!flag){
                if((s[i]>='A'&&s[i]<='Z')||(s[i]>='a'&&s[i]<='z')){
                    flag=1;
                    count++;
                }
                i--;
            }
        }
        return count;
    }

