 public int XXX(int x) {
    boolean flag = false ;
    if ( x < 0 ) {
      flag = true ;
      x = 0 - x ;   
    }
    StringBuffer temp = new StringBuffer( x + "") ;
    if ( flag ) {
        temp.append("-") ;
    }
    temp.XXX() ;
    try {
        x = Integer.parseInt( temp.toString()) ;
    }catch ( Exception e){
        return 0 ;
    }
    return x ;
}

