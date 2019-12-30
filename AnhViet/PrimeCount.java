package com.test;

public class PrimeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		PrimeCount pc = new PrimeCount();
		System.out.println("is Prime:" + pc.primeCount(start,end));
		
	}
	int primeCount(int start, int end)
	{
		int count=0;
		if (start > end)
			return count;
		if(end ==1)
			return count;
		if (end == 2)
		{
			count++;
			return count;
		}
		
		for (int i = start;i<= end;i++)
		{
			if(isPrime(i))
				count++;
		}
		
		return count;
	}
	boolean isPrime(int n)
	{
		if (n <=1) 
			return false;
		if(n==2)
			return true;
		
		for (int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		
		return true;
	}
}
