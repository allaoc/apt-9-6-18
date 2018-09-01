public class DNAMaxNucleotide {
      public String max(String[] strands, String nuc) {
            char search = nuc.charAt(0);
	    int max = 0;
	    int lenmax = 0;
	    String best = "";
	      for (int c=0;c<strands.length;c++)
	    {
		    int match = 0;
		    for (int c1=0;c1<strands[c].length();c1++)
		    {
			char comp = strands[c].charAt(c1);
			if (comp==search)
			{
				match++;
			}
		    }
		    if (match>max||(match==max&&max>0&&strands[c].length()>lenmax))
		    {
			    max=match;
			    lenmax = strands[c].length();
			    best = strands[c];
    		    }
	    }
	    return best;
      }
   }
