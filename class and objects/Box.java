public class Box {
		public int width;
		public int height;
		public int depth;
		public Box(int width, int height, int depth) {
			super();
			this.width = width;
			this.height = height;
			this.depth = depth;
		}
		double volume() {
			return width*height*depth;
		}

public static void main(String []args)
{
	Box b=new Box(100,150,200);
	double vol;
	vol=b.volume();
	System.out.println("volume of the box: " + vol);
}
}