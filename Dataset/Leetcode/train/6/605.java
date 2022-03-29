 public String XXX(String s, int numRows) {
        int len=s.length();
        int row=1;
        int nowIndex=1;
        List<List<Character>> lists=new ArrayList<List<Character>>();
        for(int i=0;i<numRows;i++) {
        	lists.add(new ArrayList<Character>());
        }
        for(int i=0;i<len;i++) {
        	if(nowIndex<=2*numRows-2) {
        		if(row<=numRows) {
        			lists.get(row-1).add(s.charAt(i));
        		}else {
        			lists.get(numRows-(row-numRows)-1).add(s.charAt(i));
        		}
        		row++;
        		nowIndex++;
        	}else {
        		nowIndex=1;
        		row=1;
        		lists.get(row-1).add(s.charAt(i));
        		nowIndex++;
        		row++;
        	}
        }
        StringBuffer sb=new StringBuffer();
        for(List<Character> list:lists) {
        	for(Character c:list) {
        		sb.append(c);
        	}
        }
		return sb.toString();
    }

