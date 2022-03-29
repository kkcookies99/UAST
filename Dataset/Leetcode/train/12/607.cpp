 class Solution {
public:

    int romanToInt(string romanString)
    {
        int targetNumbers[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        std::string sourceRomanString[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int resultNumber = 0;
        for(int index = 0; index < 13; index++)
        {
            while(romanString.find( sourceRomanString[index] ) == 0)
            {
                resultNumber += targetNumbers[index];
                romanString = romanString.substr( sourceRomanString[index].length() );
            }
        }
        return resultNumber;
    }

    string XXX(int number)
    {
        int sourceNumbers[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        std::string targetRomanString[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        std::string resultRomanString;

        for(int index = 0; index < 13; index++)
        {
            while(number >= sourceNumbers[index])
            {
                number -= sourceNumbers[index];
                resultRomanString.append( targetRomanString[index] );
            }
        }
        return resultRomanString;
    }
};

