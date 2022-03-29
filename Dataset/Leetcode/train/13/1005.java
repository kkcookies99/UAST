 class Solution {
    public int XXX(String s) {
       s=s.replaceAll("IV", "A");//4
    	s=s.replaceAll("IX", "B");//9
    	s=s.replaceAll("XL", "P");//40
    	s=s.replaceAll("XC", "Q");//90
    	s=s.replaceAll("CD", "E");//400
    	s=s.replaceAll("CM", "F");//900
    	int num=0;
        char []tem=s.toCharArray();
        for(int i=0;i<tem.length;i++)
        {
        	switch(tem[i]) 
        	{
        	  case 'I':num+=1; break;
        	  case 'V':num+=5;break;
        	  case 'X':num+=10;break;
        	  case 'L':num+=50;break;
        	  case 'C':num+=100;break;
        	  case 'D':num+=500;break;
        	  case 'M':num+=1000;break;
        	  case 'A':num+=4;break;
        	  case 'B':num+=9;break;
        	  case 'P':num+=40;break;
        	  case 'Q':num+=90;break;
        	  case 'E':num+=400;break;
        	  case 'F':num+=900;break;
        	
        	}
        }
    	return num;
    }
}

