public class App{
	 // Distance
    public static double distance(Point p1, Point p2 ){
        double dx, dy;
        dx = p1.getAbs() - p2.getAbs() ;
        dy = p1.getOrd() - p2.getOrd() ;
		return Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2)) ;
    }
	//Milieu
    public static Point milieu( Point p1, Point p2 ){
        Point m = new Point() ;
        double x = ( p1.getAbs() + p2.getAbs() )/2 ;
        double y= ( p1.getOrd() + p2.getOrd() )/2 ;
        m.setAbs(x);m.setObs(y);
		return m ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(4,8);
		Point p2 = new Point(20,40);
		p1.affiche();
		System.out.println(distance(p1,p2) ) ;
		Point m1 = milieu(p1, p2);
		m1.affiche() ;
		System.out.println("La constante PI est : "+ Math.E);
	}

}
