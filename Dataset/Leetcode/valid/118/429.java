 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        int [][] arr=new int [numRows][numRows];
        List<List<Integer>> ls = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i){
                    arr[i][j] = 1;
                    list.add(arr[i][j]);
                }else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                    list.add(arr[i][j]);
                }
            }
            ls.add(list);
        }
        return ls;
    }
}

