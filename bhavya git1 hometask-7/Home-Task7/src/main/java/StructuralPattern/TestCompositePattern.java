package StructuralPattern;

public class TestCompositePattern {
		public static void test() {
			Shape tri = (Shape) new Triangle();
			Shape tri1 = (Shape) new Triangle();
			Shape rect = new Rectangle();
			
			Drawing drawing = new Drawing();
			drawing.add(tri1);
			drawing.add(tri1);
			drawing.add(rect);
			
			drawing.draw("Red");
			
			drawing.clear();
			
			drawing.add(tri);
			drawing.add(rect);
			drawing.draw("Green");
		}
	}
	