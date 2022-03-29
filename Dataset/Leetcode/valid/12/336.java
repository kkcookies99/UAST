     public String XXX(int num) {

        int[] bases={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        StringBuilder sb=new StringBuilder();
        int index=bases.length-1;
        while(num>0){

            for(int i=index;i>=0;i--){
                if(num>=bases[i]){
                    sb.append(getBasicRoman(bases[i]));
                    num-=bases[i];
                    break;
                }
            }
        }
        return sb.toString();
    }

    private String getBasicRoman(int num){
        switch (num){
            case 1:
                return "I";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 40:
                return "XL";
            case 50:
                return "L";
            case 90:
                return "XC";
            case 100:
                return "C";
            case 400:
                return "CD";
            case 500:
                return "D";
            case 900:
                return "CM";
            case 1000:
                return "M";
            default:
                return "?";
        }
    }

