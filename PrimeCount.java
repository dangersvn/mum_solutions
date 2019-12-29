class PrimeCount {
    public static void main(String []agrs)
    {
        int start = Integer.valueOf(agrs[0]);
        int end = Integer.valueOf(agrs[1]);
        PrimeCount pc = new PrimeCount();

        long tStart = System.currentTimeMillis();

        System.out.println("Count solution 2:" + pc.primeCount(start, end));

        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        System.out.println("Time in seconds:" + elapsedSeconds);

    }
   
    int primeCount(int start, int end)    {
        int count = 0;
        if (end <=1 || start > end)
            return count;
            
        if (end ==2)
        {
            count++;
            return count;
        }

        if (end==3)
        {
            if (start <=2)
                count =count+2;
            else if (start ==3)
                count++;

            return count;
        }

        //end >=5

        if (start <=2)
            count++;
        int i = start > 3 ? start : 3;
        if(i % 2 == 0) {
            i++;
        }
        for (;i<=end;i=i+2)
        {

            if(isPrime(i)) count++;

        }
        
        return count;
    }
/*
    boolean isPrime(int n)
    {
        if (n <=1) return false;

        for (int i = 2;i<n;i++)
        {
            if (n%i==0)
                return false;
        }
        return true;
    }*/
    boolean isPrime(int n)
    {
        if (n <=1) return false;
        
        for (int i = 3;i<n;i = +2)
        {
            if (n%i==0)
                return false;
        }
        return true;
    }
}