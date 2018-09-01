public class SandwichBar
   {
      public int whichOrder(String[] available, String[] orders){
         for (int c=0;c<orders.length;c++)
	 {
		 String[] ingredients = orders[c].split(" ");
		 int in = 1;
		 for (String ingredient : ingredients)
		 {
			for (String stock : available)
			{
				if (stock.equals(ingredient))
				{
					in = 1;
					break;
				}
				else
				{
					in = 0;
				}
			}
			if (in==0)
			{
				break;
			}
		}
		if (in==1)
		{
			return c;
		}
	 }
	 return -1;
      }
   }
