 var XXX = function(array1, array2) {
    	var len1=array1.length,len2=array2.length;
		if(array1.length+array2.length>2&&array1.length>0&&array2.length>0){
			var min,max;
			if(array1[0]<=array2[0]){
				min=array1[0];
				array1=array1.splice(1,array1.length-1);
			}
			else
			{	min=array2[0];
				array2=array2.splice(1,array2.length-1);
			}
			console.log(min);
			
			if(array1[array1.length-1]>=array2[array2.length-1]){
				max=array1[array1.length-1];
				array1=array1.splice(0,array1.length-1);
			}
			else
			{	max=array2[array2.length-1];
				array2=array2.splice(0,array2.length-1);
			}
			console.log(max);
			return XXX(array1,array2);
		}
		if(array1.length<1){	
			if(array2.length%2==1)
			{
				return  array2[(array2.length-1)/2];
			}
			else{
				return  (array2[(array2.length-1)/2]+array2[array2.length/2])/2;
			}
		}
		if(array2.length<1){
			if(array1.length%2==1)
				{
					return  array1[(array1.length-1)/2];
				}
				else{
					return  (array1[(array1.length-1)/2]+array1[array1.length/2])/2;
				}
		}
		if(array1.length+array2.length==2){
			return (array1[0]+array2[0])/2;
		}
	

};

