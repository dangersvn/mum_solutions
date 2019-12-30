
public class Inertial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {11,12, 7, 6,5};
		Inertial in = new Inertial();
		
		System.out.println("Inertial:" + in.isInertial(a));
		

	}
	boolean isInertial(int[] a)
	{
		if (a.length <=1)
			return false;
		int maxEven = -1;
		int maxOdd = 0;
		
		for (int i = 0;i<a.length;i++)
		{
			int n = a[i] % 2;
			if (n == 0 )
			{
				if (maxEven == -1)
					maxEven = a[i];
				else 
				{
					if (maxEven < a[i])
						maxEven = a[i];
				}
			}
			else
			{
				if (maxOdd == 0)
					maxOdd = a[i];
				else 
				{
					if (maxOdd < a[i])
						maxOdd = a[i];
				}
								
			}
		}
		
		if (maxOdd == 0 || maxEven == -1 || maxOdd >= maxEven)
			return false;

		int minOdd = 0;
		int maxSubEven = -1;

		for (int i =0;i<a.length;i++)
		{
			if (a[i] != maxOdd && a[i]!= maxEven)
			{
				if(a[i] % 2 ==0)
				{
					if (maxSubEven == -1)
					{
						maxSubEven = a[i];
					}
					else
					{
						if (maxSubEven < a[i])
							maxSubEven = a[i];
					}
				}
				else
				{
					if (minOdd == 0)
					{
						minOdd = a[i];
					}
					else
					{
						if (minOdd > a[i])
							minOdd = a[i];
					}
				}
				
			}
			if (maxSubEven!= -1 && minOdd < maxSubEven)
				return false;

		}
	
		return true;
	}

}
