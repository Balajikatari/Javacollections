
public class Emp {
	int i;
	String j;
	double k;
	public Emp(int i, String j, double k){
		
		this.i=i;
		this.j=j;
		this.k=k;
	}
	@Override
	public String toString() {
	return "Empno  " +i+ " Name  " +j+ " Basic  " +k;
	}
}

