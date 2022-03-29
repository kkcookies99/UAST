 class Solution {
    public String XXX(int num) {
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        List<String> ans = new ArrayList<String>();
        int index = 12;
        int yushu = 0;
        while(num>0){
            yushu = num%10;
            if(yushu==4){
                ans.add(roman[index-1]);
            }else if(yushu==5){
                ans.add(roman[index-2]);
            }else if(yushu==9){
                ans.add(roman[index-3]);
            }else if(yushu>5){
                for(int i=yushu-5;i>0;i--){
                    ans.add(roman[index]);
                }
                ans.add(roman[index-2]);
            }else if(yushu>0){
                 for(int i=yushu;i>0;i--){
                    ans.add(roman[index]);
                }
            }
            num = num/10;
            index = index-4;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=ans.size()-1;i>=0;i--){
            sb.append(ans.get(i));
        }
        return sb.toString();
    }
}

