 class Solution {
    public String XXX(int nums) {
        String res = "";
        if(nums /1000 > 0){
            for(int i = 0;i<nums /1000;i++){
                res += "M";
            }
        }
        if(nums%1000/100 == 9)
            res+="CM";
        else if(nums%1000/100 == 4)
            res+="CD";
        else if(nums%1000/500 > 0){
            res+="D";
            for(int i = 0;i<(nums%1000 - 500)/100;i++){
                res += "C";
            }
        }
        else {
            for(int i = 0;i<nums%1000/100;i++){
                res += "C";
            }
        }

        if(nums%100/10 == 9)
            res+="XC";
        else if(nums%100/10 == 4)
            res+="XL";
        else if(nums%100/50 > 0){
            res+="L";
            for(int i = 0;i<(nums%100-50)/10;i++){
                res += "X";
            }
        }
        else {
            for(int i = 0;i<nums%100/10;i++){
                res += "X";
            }
        }

        if(nums%10 == 9)
            res+="IX";
        else if(nums%10 == 4)
            res+="IV";
        else if(nums%10/5 > 0){
            res+="V";
            for(int i = 0;i<nums%10 - 5;i++){
                res += "I";
            }
        }
        else {
            for(int i = 0;i<nums%10;i++){
                res += "I";
            }
        }
        return res;
    }
}

