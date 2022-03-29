 class Solution {
    public List<List<Integer>> XXX(int numRows) {
     List<List<Integer>> yangTriangle = new  ArrayList<List<Integer>>();
     List<Integer> rowList = new ArrayList<Integer>();
     List<Integer> beforeRowList = new  ArrayList<Integer>();
     int elementValue = 0;
     int colum = 0;
     for(int r = 0; r < numRows; r++) {
          for(int c = 0; c < r + 1; c++) {
               //System.out.println(c);
               if (c == 0 || c == r) {
                        elementValue = 1;
                        rowList.add(elementValue);
                   }else {
                        beforeRowList =  yangTriangle.get(r-1);
                        elementValue =  beforeRowList.get(c - 1) + beforeRowList.get(c);
                        rowList.add(elementValue);
                   }
               colum = c;
          }
          yangTriangle.add(rowList.subList(r*colum,  r*colum+colum+1));//添加的范围
     }
     
     return yangTriangle;
    }
}

