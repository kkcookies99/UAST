 class Solution {
    public String XXX(int n) {
        if ( n == 1 ){
            return "1";
        }
        String lastStr = XXX(n - 1);
        List< strFre > list = new ArrayList<>();
        String cur = lastStr.substring( 0 , 1);
        list.add( new strFre( cur , 1 ) );
        int len = lastStr.length() ; 
        for (int i = 1 ; i < len ; i ++){
            // 相同 
            if ( lastStr.substring( i , i + 1 ).equals( lastStr.substring( i - 1 , i ) ) ){
                list.get( list.size() - 1 ).fre++;
            }
            else{
                list.add( new strFre( lastStr.substring( i , i + 1) , 1  ) );
            }
        }
        StringBuffer sb = new StringBuffer();
     //   System.out.println( "第 " + n + "个 结果：" );
        for ( strFre sf : list ){
    //        System.out.println( sf.fre + "个" + sf.s );
            int times = sf.fre;
            String subs = sf.s;
            sb.append( times );
            sb.append( subs );

        }
    //    System.out.println( sb.toString() );
        return sb.toString() ; 


    }
}

class strFre{
    String s;
    int fre;
    public strFre(String s , int fre){
        this.s = s;
        this.fre = fre;
    }

}

