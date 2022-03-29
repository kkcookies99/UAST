 class Solution {
public:
    int XXX(string s) {
        int lens=s.length();
        if(lens==0)
        return 0;
        const char *first=s.c_str();
        const char *last=first;
        const char *check=first;
        const char *check2=check;
        const char *end=first;
        for(int i=0;i<lens-1;i++)
            end++;
        int max=0;
        int count=0;
        while(last!=end){
            last++;
            while(check2<last){
                check2++;
                if(*check2==*check){ 
                    //count;
                    last--;
                    first++;
                    break;
                }
                else if(*check==*last){
                    last--;
                    first++;
                    break;
                }
                else{
                    count++;
                    check++;
                }
            }
            if(count>=max)
                max=count;
            count=0;
            check2=first;
            check=first;
        }
        return max+1;
    }
};

