 public String XXX(int num) {
        // Map<Integer,String> map = new HashMap<>();
        // map.put(1,"I");
        // map.put(2,"II");
        // map.put(3,"III");
        // map.put(4,"IV");
        // map.put(5,"V");
        // map.put(6,"VI");
        // map.put(7,"VII");
        // map.put(8,"VIII");
        // map.put(9,"IX");
        StringBuilder sb = new StringBuilder();
        int m=0;
        int left=0;
        if((m=num/1000)>0){
            while(m>0){
                sb.append("M");
                m--;
            }
            
        }
        left = num%1000;
        if((m=left/900)>0){
            sb.append("CM");
            left -= 900;
        }else if((m=left/500)>0){
            sb.append("D");
            left -= 500;
        }else if((m=left/400)>0){
            sb.append("CD");
            left -= 400;
        }
        if((m=left/100)>0){
            while(m>0){
                sb.append("C");
                m--;
            }
        }
        left = num%100;
        if((m=left/90)>0){
            sb.append("XC");
            left -= 90;
        }else if((m=left/50)>0){
            sb.append("L");
            left -= 50;
        }else if((m=left/40)>0){
            sb.append("XL");
            left -= 40;
        }
        if((m=left/10)>0){
            while(m>0){
                sb.append("X");
                m--;
            }
        }

        left = num%10;
        if((m=left/9)>0){
            sb.append("IX");
            left -= 9;

        }else if((m=left/5)>0){
            sb.append("V");
            left -= 5;
        }else if((m=left/4)>0){
            sb.append("IV");
            left -= 4;
        }
        if((m=left/1)>0){
            while(m>0){
                sb.append("I");
                m--;
            }
        }

        return new String(sb);
        
    }

