 class Solution {
    public int XXX(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(i != s.length()-1 && s.charAt(i) == 'I'){
                if(s.charAt(i+1) == 'V'){
                    i++;
                    sum += 4;
                    continue;
                }else if(s.charAt(i+1) == 'X'){
                    i++;
                    sum += 9;
                    continue;
                }
            }else if(i != s.length()-1 && s.charAt(i) == 'X'){
                if(s.charAt(i+1) == 'L'){
                    i++;
                    sum += 40;
                    continue;
                }else if(s.charAt(i+1) == 'C'){
                    i++;
                    sum += 90;
                    continue;
                }
            }else if(i != s.length()-1 && s.charAt(i) == 'C'){
                if(s.charAt(i+1) == 'D'){
                    i++;
                    sum += 400;
                    continue;
                }else if(s.charAt(i+1) == 'M'){
                    i++;
                    sum += 900;
                    continue;
                }
            }
            if(s.charAt(i) == 'I'){
                sum += 1;
            }else if(s.charAt(i) == 'V'){
                sum += 5;
            }else if(s.charAt(i) == 'X'){
                sum += 10;
            }else if(s.charAt(i) == 'L'){
                sum += 50;
            }else if(s.charAt(i) == 'C'){
                sum += 100;
            }else if(s.charAt(i) == 'D'){
                sum += 500;
            }else if(s.charAt(i) == 'M'){
                sum += 1000;
            }   
        }
        return sum;
    }
}

