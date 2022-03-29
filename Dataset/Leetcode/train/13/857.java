 class Solution {
    public int XXX(String s) {
        String[] ls=new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] ps=new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};

        int ret=0;
        int max=ps.length-1;
        while(!"".equals(s)){
            if(s.startsWith(ls[max])){
                ret+=ps[max];
                s=s.substring(ls[max].length());
            }else{
                max--;
            }
        }
        return ret;
    }
}

