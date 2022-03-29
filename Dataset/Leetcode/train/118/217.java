 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        for (int i=0;i<numRows;i++){
            List<Integer> list=new ArrayList<>();
            for (int j=0;j<=i;j++){
                list.add(combination(i,j));
            }
            result.add(list);
        }
        return result;
    }
    public int combination(int numerator,int denominator){
        double numeratorProduct=1;
        double denominatorProduct=1;
        double differProduct=1;
        if (denominator==0){
            return 1;
        }
        if (denominator==1){
            return numerator;
        }
        for (int i=1;i<=numerator;i++){
            numeratorProduct=numeratorProduct*i;
        }
        for (int i=1;i<=denominator;i++){
            denominatorProduct=denominatorProduct*i;
        }
        for (int i=1;i<=numerator-denominator;i++){
            differProduct=differProduct*i;
        }
        double division=numeratorProduct/(denominatorProduct*differProduct);
        return (int)division;
    }
}

