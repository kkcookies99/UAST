public int XXX(String s) {
		HashMap<String, Integer> hmap= new HashMap<String, Integer>();
		hmap.put("I",1);
		hmap.put("V",5);
		hmap.put("X",10);
		hmap.put("L",50);
		hmap.put("C",100);
		hmap.put("D",500);
		hmap.put("M",1000);
		hmap.put("IV",4);
		hmap.put("IX",9);
		hmap.put("XL",40);
		hmap.put("XC",90);
		hmap.put("CD",400);
		hmap.put("CM",900);
		int x = 0;
		if(s.indexOf("IV") != -1){
			x = x+4;
			s = s.replaceAll("IV", "");
		}
		if(s.indexOf("IX") != -1){
			x = x+9;
			s = s.replaceAll("IX", "");
		}
		if(s.indexOf("XL") != -1){
			x = x+40;
			s = s.replaceAll("XL", "");
		}
		if(s.indexOf("XC") != -1){
			x = x+90;
			s = s.replaceAll("XC", "");
		}
		if(s.indexOf("CD") != -1){
			x = x+400;
			s = s.replaceAll("CD", "");
		}
		if(s.indexOf("CM") != -1){
			x = x+900;
			s = s.replaceAll("CM", "");
		}
		for(int i = 0; i < s.length(); i++){
			x = x + hmap.get(String.valueOf(s.charAt(i)));
			
		}
		return x;
		
    }

