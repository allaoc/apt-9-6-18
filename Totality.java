public class Totality
{
	public int sum(int[] a, String stype)
	{
		int summation = 0;
		for(int c=0;c<a.length;c+=1)
		{
			if((stype.equals("odd") && c%2==1) || (stype.equals("even") && c%2==0) || (stype.equals("all")))
			{
				summation+=a[c];
			}
		}
		
		return summation;
	}
}
