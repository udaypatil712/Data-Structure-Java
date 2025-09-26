{
    let n=9;
    let isPrime=true;
    for(let i=2;i<=Math.sqrt(n);i++){
         if(n%i===0){
            isPrime=false;
            break;              
         }
    }
    if(isPrime){
        console.log("is prime"+n)
    }else{
        console.log("is not prime"+n)
    }
}