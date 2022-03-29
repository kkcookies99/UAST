 class Solution {
public:
    bool inRange(char k){
        return (k>='a' && k<='z') || (k>='A' && k<='Z') || (k>='0' && k<='9');
    }

    bool checkIgnoreCase(char a1, char a2){
        char temp = a1 ^ a2;
        return temp==0 || ((temp&(~('a'^'A')))==0);
    }

    bool XXX(string s) {
        int head=0, tail=s.size()-1;
        int size = s.size();

        while(true){
            if(head>=tail){
                break;
            }

            while(!inRange(s[head])){
                if(head+1>=size){
                    break;
                }
                head++;
            }

            while(!inRange(s[tail])){
                if(tail-1<0){
                    break;
                }
                tail--;
            }


            if(head>=tail){
                break;
            }

            if(!checkIgnoreCase(s[head], s[tail])){
                return false;
            }

            head++, tail--;

        }

        return true;

    }
};

