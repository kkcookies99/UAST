 class Solution {
    public int XXX(String s) {
        char[] arr = s.toCharArray();
        int index = 0;
        int result = 0;
        while(index < s.length()){
            if(arr[index] == 'M'){
                result +=1000;
                index++;
            }else if(arr[index] == 'C' && index != s.length() - 1 && arr[index + 1] == 'M'){
                result += 900;
                index += 2;
            }else if(arr[index] == 'D'){
                result += 500;
                index++;
            }else if(arr[index] == 'C' && index != s.length() - 1 && arr[index + 1] == 'D'){
                result += 400;
                index += 2;
            }else if(arr[index] == 'C'){
                result += 100;
                index++;
            }else if(arr[index] == 'X' && index != s.length() - 1 && arr[index + 1] == 'C'){
                result += 90;
                index += 2;
            }else if(arr[index] == 'L'){
                result += 50;
                index += 1;
            }else if(arr[index] == 'X' && index != s.length() - 1 && arr[index + 1] == 'L'){
                result += 40;
                index += 2;
            }else if(arr[index] == 'X'){
                result += 10;
                index += 1;
            }else if(arr[index] == 'I' && index != s.length() - 1 && arr[index + 1] == 'X'){
                result += 9;
                index += 2;
            }else if(arr[index] == 'V'){
                result += 5;
                index += 1;
            }else if(arr[index] == 'I'  && index != s.length() - 1 && arr[index + 1] == 'V'){
                result += 4;
                index += 2;
            }else if(arr[index] == 'I'){
                result += 1;
                index += 1;
            }
        }
        return result;
    }
}

