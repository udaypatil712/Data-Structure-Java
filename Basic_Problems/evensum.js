{
    let sum=0;
    let n=3;
    let fact=1;
    let isPrime=true;
    let original=n;

    if(n%2===0){   
        for(let i=0;i<n;i++){
            let rem = Math.floor(n%10);
            sum = sum + rem;
            n=n/10;
        }
        console.log(sum)
    }
    else{
        for(let j=2;j<n;j++){
            if(n%j===0){
                isPrime=false;
                console.log(j)     
            }
        }
        
    }
    if(isPrime){
        for(let i=1;i<=original;i++){
        fact=fact*i;
        }
        console.log(fact)
    }
}