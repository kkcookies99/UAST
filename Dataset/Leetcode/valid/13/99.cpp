class Solution {
public:
    int XXX(string s) {
        // pad 2 extra space for the last digit
        string digitSymbol = "IVXLCDM  ";
        int result = 0;
        int curPosi = 0;
        int mult = 1;
        bool digitLargeSet = false;
        bool moveNext = false;

        for(int i=s.size()-1;i>=0;i--){
            if(moveNext==true){
                curPosi+=2;
                mult*=10;
                digitLargeSet = false;
                moveNext = false;
            }

            // process 5
            if(s[i]==digitSymbol[curPosi+1]){
                result+=5*mult;
                digitLargeSet = true;
            }
            // process 10
            else if(s[i]==digitSymbol[curPosi+2]){
                result+=10*mult;
                digitLargeSet = true;
            }
            // process 1
            else if(s[i]==digitSymbol[curPosi]){
                // minus 1 if current 1 is on the left of 5 or 10
                if(digitLargeSet==true){
                    result -= 1*mult;
                }
                // add 1 if current 1 is on the left of 5 or 10
                else{
                    result += 1*mult;
                }
            }
            // if no proper digit fit on current position,
            // move to next one
            else{
                moveNext = true;
                i++;
            }
        }

        return result;

    }
};

