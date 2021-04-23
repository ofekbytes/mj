//package jsm.utility.temp;

//public class ShapeIt {
//
//	public ShapeIt() {
//		// TODO Auto-generated constructor stub
//	}
//
//}

// jron - fix the bug 

import java.util.*;

public class ShapeIt {
	public static void main(String[] args) {
		Random r = new Random();
		Cmap c;
		int l, w, choice = r.nextInt(6);
		System.out.println("What u see is Random Draws in X-Y plane");
		l = r.nextInt(100) + 4;
		w = r.nextInt(100) + 4;
		// choice=5;
		switch (choice) {
		case 1:
			c = new Quadilateral(l, w);
			c.Draw();
			break;

		case 2:
			c = new Ellipse(l, w);
			c.Draw();
			break;

		case 3:
			c = new Diamond(l);
			c.Draw();
			break;

		case 4:

		case 5:
			c = new Heart(l);
			c.Draw();
			System.out.println("\nI know you are single so\nYOU + YOU =100% chance of Love");
			break;

		default:
			c = new Cmap();
			c.Draw();
			break;
		}

		System.out.println("\nRun Again?");
	}
}

class Cmap {
	final static int[][][] xy = { { { 20, 20 }, { 38, 24 } }, { { 16, 20 }, { 32, 25 } } };
	static int X, Y, x, y;
	int a, b;
	protected static boolean scr, gfx, lock = true;
	protected final static char[] ch = { 176, 32, 219, '*', 'O', '#', '$', 'I', 'L', 'U' };
	String name;

	public Cmap() {
		Random r = new Random();
		scr = r.nextBoolean();
		gfx = r.nextBoolean();
		scr = true;
		// gfx=false;
		init();
	}

	public Cmap(int a, int b, String name) {
		this();
		this.a = a;
		this.b = b;
		checksrc();
		this.name = name;
	}

	public Cmap(int a, int b, String name, boolean sc, boolean gf) {
		this();
		this.a = a;
		this.b = b;
		this.name = name;
		scr = sc;
		gfx = gf;
	}

	public void init() {
		if (gfx) {
			if (scr) {
				X = xy[1][0][0];
				Y = xy[1][0][1];
			} else {
				X = xy[1][1][0];
				Y = xy[1][1][1];
			}
		} else {
			if (scr) {
				X = xy[0][0][0];
				Y = xy[0][0][1];
			} else {
				X = xy[0][1][0];
				Y = xy[0][1][1];
			}
		}

	}

	protected void prt(String ch) {
		System.out.print(ch);
	}

	protected void prt(char ch) {
		System.out.print(ch);
	}

	protected void bprt(boolean t) {
		Random r = new Random();
		int n = ch.length;
		int i = r.nextInt(n);

		if (t) {
			if (gfx)
				prt(ch[2]);
			else
				prt(ch[i % 4 + 3]);
		} else {
			if (gfx)
				prt(ch[0]);
			else
				prt(ch[1]);
		}
	}

	protected void Draw() {
		if (scr)
			prt("Screen mode potrait\n");
		else
			prt("**SCREEN MODE LANDSCAPE\nPLEASE ROTATE YOUR PHONE**\n\n");

		prt("\n" + this.name + " of rx=" + a + " and ry=" + b + "\n");
		for (y = b + 1; y >= (-b - 1); y--) {
			prt("\n");
			for (x = (-X); x <= X; x++) {
				bprt(ForXY(x, y));
			}
		}
		lock = true;
	}

	private void checksrc() {
		a = a % (X + 1);
		b = b % (Y + 1);
		a = a < 3 ? 3 : a;
		b = b < 3 ? 3 : b;
	}

	protected boolean ForXY(int x, int y) {
		return (x == y);
	}

}

class Heart extends Diamond {
	int mx, my;
	Cmap c1;

	public Heart(int a) {
		super(a, "Heart");
		mx = this.a / 2;
		my = this.b / 3;
		c1 = new Ellipse(mx, 2 * my, scr, gfx);
	}

	protected void bprt(boolean t) {
		Random r = new Random();
		int n = ch.length;
		int i = r.nextInt(n) % 3;
		if (gfx)
			super.bprt(t);
		else if (t)
			prt(ch[i + 7]);
		else
			prt(ch[1]);
	}

	public boolean ForXY(int x, int y) {
		if (y >= b / 3) {
			if (x < 0)
				x = x + mx;
			else
				x = x - mx;
			y = y - my;
			return c1.ForXY(x, y);
		} else if (y < b / 3 && y > 0)
			return Math.abs(x) == a;
		else
			return super.ForXY(x, y);
	}

}

class Line extends Cmap {

	public void Draw(int ax, int ay, int bx, int by) {
		super.Draw();
	}

	protected boolean ForXY(int x, int y, int a, int b) {
		return false;
	}

}

class Ellipse extends Cmap {
	public Ellipse(int a, int b) {
		super(a, b, "Ellipse");
	}

	public Ellipse(int a, int b, boolean sc, boolean gf) {
		super(a, b, "Ellipse", sc, gf);
	}

	protected boolean ForXY(int x, int y) {
		x = x * x;
		y = y * y;
		int rx = a * a, ry = b * b;
		double xx = 1.0 * x / rx;
		double yy = 1.0 * y / ry;
		double sum = xx + yy;
		return (sum >= 0.84 && sum <= 1.16);
	}
}

class Diamond extends Cmap {
	public Diamond(int a) {
		super(a, a, "Diamond");
	}

	public Diamond(int a, String name) {
		super(a, a, name);
	}

	protected boolean ForXY(int x, int y) {
		x = Math.abs(x);
		y = Math.abs(y);
		int s = (x + y);
		int r = (a + b) / 2;
		// double m=Math.abs(a-b)/0.5;
		return (s == r);
	}
}

class Quadilateral extends Cmap {

	public Quadilateral(int a, int b) {
		super(a, b, "Rectangle");
	}

	protected boolean ForXY(int x, int y) {
		x = Math.abs(x);
		y = Math.abs(y);
		return (x <= a && y == b) || (y <= b && x == a);
	}

}