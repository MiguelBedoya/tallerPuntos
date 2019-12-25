package punto;

public class P4 extends P3 {

    //Atributos
    private int w;

    //Constructores

    public P4(int x, int y, int z){
        super();
        this.w = 0;
    }

    public P4 (int x, int y, int z, int w){
        super(x,y,z);
        this.w=w;
    }

    public P4 (P3 p3, int w){
        super(p3);
        this.w = w;
    }


    public P4(P4 p4){
        this(p4.getX(), p4.getY(), p4.getZ(), p4.getW());
    }

    public int getW(){
        return this.w;
    }


    public void setW(int w){
        this.w = w;
    }


    public double calcularDistancia(int x, int y, int z, int w){
        double distancia;
        double diferenciaCuadradosX = Math.pow(getX() - x, 2);
        double diferenciaCuadradosY = Math.pow(getY() - y, 2);
        double diferenciaCuadradosZ = Math.pow(getZ() - z, 2);
        double diferenciaCuadradosW = Math.pow(this.w - w, 2);

        distancia = Math.sqrt(diferenciaCuadradosX +
                diferenciaCuadradosY +
                diferenciaCuadradosZ +
                diferenciaCuadradosW);

        return distancia;
    }

    public double calcularDistancia(P3 p3, int w){
        return calcularDistancia(p3.getX(), p3.getY(), p3.getZ(), w);
    }


    public double calcularDistancia(P4 p4){
        return calcularDistancia(p4.getX(), p4.getY(), p4.getZ(), getW());
    }
    public String toString(){
        String s = super.toString() + " W: "+this.w;
        return s;
    }


}
