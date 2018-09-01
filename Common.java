public class Common {
     public int count (String a, String b) {
	int k = 0;
        for (int c=0;c<a.length();c++)
	{
		int cont=0;
		char compa = a.charAt(c);
		for (int c2=0;c2<c;c2++)
		{
			if (a.charAt(c2)==compa)
			{
				cont++;
			}
		}
		for (int c1=0;c1<b.length();c1++)
		{
			char compb = b.charAt(c1);
			if (compa == compb)
			{
				int cont1=0;

			for (int c2=0;c2<c1;c2++)
			{
				if (b.charAt(c2)==compb)
				{
					cont1++;
				}
			}
				if (cont==cont1){
				k++;
				break;
				}
			}
		}
	}
	return k;
     }
  }
