 class Solution {
public:
    int XXX(string str){
        if(str.size() ==0)
            return 0;
        int i=0 ,number =0;
        while(i< str.size() && str[i] ==' ')
            i++;
        if(i == str.size())
            return 0;
        if(isdigit(str[i])){
            number= number*10 +(str[i] -'0');
            i++;
            while(i<str.size() && isdigit(str[i])){
                int v = str[i] -'0';
                
                if(number > INT_MAX/10 || (number == INT_MAX/10 && v >7))
                    return INT_MAX;
                if(number < INT_MIN/10 || (number == INT_MIN/10 && v<-8))
                    return INT_MIN;
                
                number = number*10 + (str[i]-'0');
                i++;
            }
        }else if(str[i] == '+' || str[i] =='-'){
            bool flag= false;
            if(str[i] =='-')
                flag =true;
            i++;
            while(i<str.size() && isdigit(str[i])){
                int v = str[i] -'0';
                if(flag){
                    v= -v;
                }
                    
                if(number > INT_MAX/10 || (number == INT_MAX/10 && v >7))
                    return INT_MAX;
                if(number < INT_MIN/10 || (number == INT_MIN/10 && v<-8))
                    return INT_MIN;
                
                number = number*10 + v;
                i++;
            }
        }
        
        return number;
          
    }
        
   
};

