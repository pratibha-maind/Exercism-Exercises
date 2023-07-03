class PrimeCalculator {
    
    int nth(int nth) {
        int num, count, i;
        if(nth <=0)
        {
            throw new IllegalArgumentException("Illegal argument");
        }
    num=1;
    count=0;
 
    while (count < nth){
      num=num+1;
        if(num == 2)
        {
            count++;
            continue;
        }
      for (i = 2; i <= num; i++){ 
        if (num % i == 0) {
          break;
        }
      }
      if ( i == num){
        count = count+1;
      }
    }
    return num;
        
}
}
