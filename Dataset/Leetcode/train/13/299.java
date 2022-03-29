class Solution {
    public int XXX(String s) {
        int resultNum = 0;
        for (int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if (c == 'I'){
                resultNum = resultNum + 1;
            }else if(c == 'V'){
                if (i > 0){
                    if (s.charAt(i - 1) == 'I'){
                        resultNum = resultNum - 1 + 4;
                    }else{
                        resultNum = resultNum + 5;
                    }
                }else{
                    resultNum = resultNum + 5;
                }
            }
            else if(c == 'X'){
                if (i > 0){
                    if (s.charAt(i - 1) == 'I'){
                        resultNum = resultNum - 1 + 9;
                    }else{
                        resultNum = resultNum + 10;
                    }
                }else{
                    resultNum = resultNum + 10;
                }
            }
            else if(c == 'L'){
                if (i > 0){
                    if (s.charAt(i - 1) == 'X'){
                        resultNum = resultNum - 10 + 40;
                    }else{
                        resultNum = resultNum + 50;
                    }
                }else{
                    resultNum = resultNum + 50;
                }
            }
            else if(c == 'C'){
                if (i > 0){
                    if (s.charAt(i - 1) == 'X'){
                        resultNum = resultNum - 10 + 90;
                    }else{
                        resultNum = resultNum + 100;
                    }
                }else{
                    resultNum = resultNum + 100;
                }
            }
            else if(c == 'D'){
                if (i > 0){
                    if (s.charAt(i - 1) == 'C'){
                        resultNum = resultNum - 100 + 400;
                    }else{
                        resultNum = resultNum + 500;
                    }
                }else{
                    resultNum = resultNum + 500;
                }
            }
            else if(c == 'M'){
                if (i > 0){
                    if (s.charAt(i - 1) == 'C'){
                        resultNum = resultNum - 100 + 900;
                    }else{
                        resultNum = resultNum + 1000;
                    }
                }else{
                    resultNum = resultNum + 1000;
                }
            }
        }
        return resultNum;
    }
}

