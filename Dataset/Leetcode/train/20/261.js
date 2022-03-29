 var XXX = function(s) {
   var reg = /(\(\))+|(\[\])+|(\{\})+/g,
       replaceReg = /[^(\(|\)|\[|\]|\{|\})]*/g,
       newStr = s.replace(replaceReg,'').replace(reg,'');
   while(reg.test(newStr)){
       newStr = newStr.replace(reg,'');
   }
   if(newStr != ''){
       return false;
   }
   return true;
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

