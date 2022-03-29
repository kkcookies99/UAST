 public int XXX(String s) {
        int pre = 0;
        int now = 0;
        int sum = 0;
        for (char c: s.toCharArray()){
            switch (c){
                case 'I': 
                    now = 1;
                    break;
                case 'V': 
                    now = 5;
                    break;
                case 'X': 
                    now = 10;
                    break;
                case 'L': 
                    now = 50;
                    break;
                case 'C': 
                    now = 100;
                    break;
                case 'D': 
                    now = 500;
                    break;
                case 'M': 
                    now = 1000;
                    break;
            }
            if (now <= pre)
                sum += now;
            else 
                sum = now - sum > 0 ? now - sum : sum + now - 2*pre;
            pre = now;
        }
        return sum;
    }

