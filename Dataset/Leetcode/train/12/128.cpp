 class Solution {
public:
    string XXX(int num) {
        string res = "";
        while(num!=0)
        {
            if(1000<=num){res+='M';num = num-1000; continue;} 
            if(900<=num&&num<1000) {res+="CM";num = num-900; continue;} 
            if(500<=num&&num<900) {res+='D';num = num-500; continue;} 
            if(400<=num&&num<500) {res+="CD";num = num-400; continue;} 
            if(100<=num&&num<400) {res+='C';num = num-100; continue;} 
            if(90<=num&&num<100) {res+="XC";num = num-90; continue;} 
            if(50<=num&&num<90) {res+="L";num = num-50; continue;} 
            if(40<=num&&num<50) {res+="XL";num = num-40; continue;} 
            if(10<=num&&num<40) {res+="X";num = num-10; continue;} 
            if(9<=num&&num<10) {res+="IX";num = num-9; continue;} 
            if(5<=num&&num<9) {res+="V";num = num-5; continue;} 
            if(4<=num&&num<5) {res+="IV";num = num-4; continue;} 
            if(1<=num&&num<4) {res+="I";num = num-1; continue;} 
        }
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


