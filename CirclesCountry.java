public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
	int borders = 0;
	boolean in1;
	boolean in2;
	for (int c=0;c<r.length;c++)
	{
		in1 = (Math.sqrt(Math.pow((x1-x[c]),2)+Math.pow((y1-y[c]),2))<r[c]);
		in2 = (Math.sqrt(Math.pow((x2-x[c]),2)+Math.pow((y2-y[c]),2))<r[c]);
		if (in1!=in2){
			borders++;
		}
	}
	return borders;
    }
 }