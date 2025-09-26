let str="stole now noch";
 let map= new Map();
  for(let i=97;i<=122;i++){
     map.set(String.fromCharCode(i),0);
  }
  for(let i=str.length-1;i>=0;i--){
    let ch=str.charAt(i);
    if(map.has(ch)){
        map.set(ch,map.get(ch) +1);
    }
  }
  let frq="";
for (let [key, value] of map) {
    frq+=value;
    frq+=" ";
}
console.log(frq);
 
