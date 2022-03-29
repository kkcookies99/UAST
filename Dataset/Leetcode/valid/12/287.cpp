 class Solution {
public:
    string XXX(int num) {
      //  unordered_map<int,string> m = {{1,"I"},{4,"IV"},{5,"V"},{9,"IX"},{10,"X"},{40,"XL"},{50,"L"},{90,"XC"},
      //                                 {100,"C"},{400,"CD"},{500,"D"},{900,"CM"},{1000,"M"}};
        int val[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1},idx = 0;
        string m[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        string str;

        while(num){
            while(num < val[idx]) idx++;
            str = str + m[idx], num -= val[idx];
        }
        return str;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


