 class Solution {
public:
    string XXX(int num) {
        // required sysmbol list
        string digitSymbol = "IVXLCDM";

        // final result
        string result = "";

        // current digit position in sysmbol list
        int digitPosi = 0;

        while(num!=0){
            // retrieve digit
            int remain = (num%10);
            string digitString = "";
            // if it's 9, process it immediately
            if(remain==9){
                digitString = digitString+digitSymbol[digitPosi]+digitSymbol[digitPosi+2];
            }
            // if it's 4, process it immediately
            else if(remain==4){
                digitString = digitString+digitSymbol[digitPosi]+digitSymbol[digitPosi+1];
            }
            else{
                // first check whether it is larger than 5
                if(remain>=5){
                    digitString=digitString+digitSymbol[digitPosi+1];
                    remain-=5;
                }
                // pad 1 for the remaining value
                for(int i=0;i<remain;i++){
                    digitString+=digitSymbol[digitPosi];
                }
            }
            // add subresult to total result
            result = digitString + result;
            // move to the next digit position in symbol list
            digitPosi+=2;
            // strip the last digit
            num/=10;
        }

        return result;
    }
};

