 class Solution {
public:
    int map[256]={0};
    int setmap(){
        for(int i = 0;i<256;i++){
            map[i] = 0;
        }
        return 0;
    }
    int XXX(string s) {

        int ans = 0;
        int temp = 0;
 
        for(int i=0;i<s.length();i++){
            for(int j =i ;j<s.length();j++){
                if(map[s[j]]>0){
                    setmap();
                    temp=0;
                    break;
                }

                if(map[s[j]]==0){
                    temp++;
                    if(temp>ans){
                        ans=temp;
                    }
                    map[s[j]]++;
                }
            }
        }
        return ans;
    }
};

