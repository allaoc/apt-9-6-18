public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
	int borders = 0;
	int in1;
	int in2;
	for (int c=0;c<r.length;c++)
	{
		if (Math.sqrt(Math.pow((x1-x[c]),2)+Math.pow((y1-y[c]),2))<r[c]){
			in1=1;}
		else{
			in1=0;}
		if (Math.sqrt(Math.pow((x2-x[c]),2)+Math.pow((y2-y[c]),2))<r[c]){
			in2=1;}
		else{
			in2=0;}
		if (in1!=in2){
			borders++;
		}
	}
	return borders;
    }
 }
