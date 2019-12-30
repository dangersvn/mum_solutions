
public class Madhav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Madhav");
		Madhav m=new Madhav();
		int []arr = {3,1,2,3,0,0};
		System.out.println("Madhav:" + m.isMadhavArray(arr));
	}
	

	boolean isMadhavArray(int[]a)
	{

		if (a.length==1)
			return true;
		
		int start =1;
		int firstVal = a[0];
		int sublen = 2;
		int sublen1 = 3;

		
		while(true)
		{
			if(a.length<sublen1)
				return false;
			int sum = 0;
			for (int i = start;i<start + sublen; i++)
					sum += a[i];

			if(sum !=firstVal)
				return false;

			if (sublen1==a.length)
				break;

			start =sublen1;
			sublen++;
			sublen1 +=sublen;
			
		}
		
		return true;
		
	}
}
