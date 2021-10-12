package mathObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Math math=new Math();
        System.out.println(math.sum(5, 13));
		System.out.println(math.sub(5, 13));
		System.out.println(math.divide(12,4));
		System.out.println(math.getPi());
		// pi*r*r areaOFCircle
		System.out.println(math.areaOFCircle(5));
		//pi*r*r*r*4/3  volumeOFSphere(3)
		System.out.println(math.areaOfRectangularPrism(3, 4, 5));
		System.out.println(math.areaOfRectangularPrism1(4, 5));
		System.out.println(math.areaOfRectangularPrism2(4, 5,6));
		System.out.println(math.areaOFCircle(8.7));
		System.out.println(math.faktoriyel(5));
	}

}
