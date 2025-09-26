{
    let n=121;
    let rev=0;
    let original=n;

    while(n>0){

        let rem = n%10;
        rev =rev *10 +rem;
        n = Math.floor(n / 10);
    }
     
    if(original===rev){
        console.log("is palindrome..")
    }else{
        console.log("is not palindrome..")
    }
}