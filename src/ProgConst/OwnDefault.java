package progConst;


class rect{
	int len, bre;
	rect(){
		len = 10; bre=23;
		}
	int area() {
		int recArea= (len*bre);
			return recArea;

}
}
public class OwnDefault {
	public static void main (String[] args) {
		rect r = new rect();
		System.out.println("area of a rectangle :" + r.area());
	}

}
