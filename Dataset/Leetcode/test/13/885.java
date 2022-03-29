 class Solution {
    public int XXX(String s) {
        int sum = 0;
        int count = 0;
        int len = s.length();
        char data[] = s.toCharArray();

        while(count < len){
            switch(data[count]){
                case 'I':
                    sum += 1;
                    break;

                case 'V':
                    
                    if(count >= 1 && data[count - 1] == 'I'){
                        sum += 3;
                        break;
                    }
                    else{
                        sum += 5;
                    }
                    break;
                
                case 'X':
                    if(count >= 1 && data[count - 1] == 'I' ){
                        sum += 8;
                        break;
                    }
                    else{
                        sum += 10;
                    }
                    break;

                case 'L':
                    if(count >= 1 && data[count - 1] == 'X' ){
                        sum += 30;
                        break;
                    }
                    else{
                        sum += 50;
                    }
                    break;

                case 'C':
                    if(count >= 1 && data[count - 1] == 'X' ){
                        sum += 80;
                        break;
                    }
                    else{
                        sum += 100;
                    }
                    break;

                case 'D':
                    if(count >= 1 && data[count - 1] == 'C' ){
                        sum += 300;
                        break;
                    }
                    else{
                        sum += 500;
                    }
                    break;

                case 'M':
                    if(count >= 1 && data[count - 1] == 'C' ){
                        sum += 800;
                        break;
                    }
                    else{
                        sum += 1000;
                    }
                    break;
            }
            count++;
        }

        return sum;
    }
}

