 class Solution {
    public int XXX(String s) {
        int num = 0;
        int len = s.length();
        for(int i = 0; i < len; i++){
            switch (s.charAt(i)){
                case 'I':
                    if(i + 1 < len){
                        switch (s.charAt(i + 1)){
                            case 'V':
                                num += 4;
                                i++;
                                break;
                            case 'X':
                                num += 9;
                                i++;
                                break;
                            default:
                                num += 1;
                        }
                    } else num += 1;
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    if(i + 1 < len){
                        switch (s.charAt(i + 1)){
                            case 'L':
                                num += 40;
                                i++;
                                break;
                            case 'C':
                                num += 90;
                                i++;
                                break;
                            default:
                                num += 10;
                        }
                    } else num += 10;
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    if(i + 1 < len){
                        switch (s.charAt(i + 1)){
                            case 'D':
                                num += 400;
                                i++;
                                break;
                            case 'M':
                                num += 900;
                                i++;
                                break;
                            default:
                                num += 100;
                        }
                    } else num += 100;
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
            }
        }
        return num;
    }
}

