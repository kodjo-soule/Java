public class Point{
    private double m_abs;
    private double m_ord;
    //Les Methodes
    public Point(){
       m_abs=0;
       m_ord=0;
    }
    public Point(double x, double y){
       this.m_abs = x ;
       this.m_ord = y ;
    }
    double distance(Point p1 , Point p2){
        double dx , dy;
        dx = p1.m_abs - p2.m_abs ;
        dy = p2.m_ord - p1.m_abs ;
        return Math.sqrt(dx*dx + dy*dy);
    }
     Point milieu(Point p1 , Point p2){
        Point M = new Point();
       M.m_abs = (p1.m_abs+p2.m_abs)/2;
       M.m_ord = (p1.m_ord+p2.m_ord)/2;
        return M;
    }
    //Getteurs
    public double getAbs(){
        return this.m_abs;
    }
    public double getOrd(){
        return this.m_ord ;
    }
    // Setteur
    public void setAbs(double x){
        this.m_abs = x ;
    }
    public void setObs(double y){
        this.m_ord = y ;
    }
    //Afficher
    public void affiche(){
        System.out.println("Point "+ getClass() ) ;
        System.out.println("Abscisse : "+this.m_abs);
        System.out.println("Ordonne : "+this.m_ord);
    }
    
}