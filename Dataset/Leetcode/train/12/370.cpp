 class Solution {
public:
    
    string XXX(int num) {
        if(num == 0) return "";
        string str1 = "IXCM";
        string str2 = "VLD";
        string res = "";
        int i=0;
        
        do{
            int cur = num%10;
            switch(cur){
                case 0: break;
                case 1: res.insert(0,str1.substr(i,1));break;
                case 2: res.insert(0,str1.substr(i,1));res.insert(0,str1.substr(i,1));break;
                case 3: res.insert(0,str1.substr(i,1));res.insert(0,str1.substr(i,1));
                res.insert(0,str1.substr(i,1));break;
                case 4: res.insert(0,str2.substr(i,1));res.insert(0,str1.substr(i,1));break;
                case 5: res.insert(0,str2.substr(i,1));break;
                case 6: res.insert(0,str1.substr(i,1));res.insert(0,str2.substr(i,1));break;
                case 7: res.insert(0,str1.substr(i,1));res.insert(0,str1.substr(i,1));
                res.insert(0,str2.substr(i,1));break;
                case 8: res.insert(0,str1.substr(i,1));res.insert(0,str1.substr(i,1));
                res.insert(0,str1.substr(i,1));res.insert(0,str2.substr(i,1));break;
                case 9: res.insert(0,str1.substr(i,2));break;
            }
            i++;
            num = num/10;
        }while(num != 0);
        return res;
    }
};

