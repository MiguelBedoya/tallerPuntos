package punto;

/**
 * Esta clase representa un punto en 3D
 * @Author Miguel Angel
 */

public class P3 extends P2 {
    //Atributos
    private int z;

    //Constructores

    /**
     * Crea un objeto (instancia) de tipo P3
     */
    public P3(){
        super();
        this.z = 0;
    }

    /**
     * Crea un objeto de tipo P3
     * @param x coordenada X del constructor de la clase padre
     * @param y coordenada Y del constructor de la clase padre
     * @param z coordenada Z del constructor de la clase P3
     */
    public P3 (int x, int y, int z){
        super(x,y);
        this.z=z;
    }

    /**
     * Crea un objeto de tipo P3
     * @param p2 objeto tipo P2
     * @param z coordenada Z
     */
    public P3 (P2 p2, int z){
        super(p2);
        this.z = z;
    }

    /**
     * Crea un objeto de tipo P3
     * @param p3 un objeto de 3 coordenadas
     */
    public P3(P3 p3){
        this(p3.getX(), p3.getY(), p3.getZ());
    }

    /**
     * Retorna coordenada Z
     * @return coordenada z
     */
    public int getZ(){
        return this.z;
    }

    /**
     * Asigna el valor de Z
     * @param z coordenada z
     */
    public void setZ(int z){
        this.z = z;
    }
    /**
     * Calcula la distancia entre 2 puntos de 3D
     *
     * @param x coordenada X del otro punto
     * @param y coordenada Y del otro punto
     * @param z coordenada Z del otro punto
     * @return distancia
     */
    public double calcularDistancia(int x, int y, int z){
        double distancia;
        double diferenciaCuadradosX = Math.pow(getX() - x, 2);
        double diferenciaCuadradosY = Math.pow(getY() - y, 2);
        double diferenciaCuadradosZ = Math.pow(this.z - z, 2);

        distancia = Math.sqrt(diferenciaCuadradosX +
                diferenciaCuadradosY +
                diferenciaCuadradosZ);

        return distancia;
    }

    /**
     * Calcular la distancia entre 2 puntos en 3D
     * @param p2 objeto de tipo P2
     * @param z coordenada Z
     * @return distancia
     */
    public double calcularDistancia(P2 p2, int z){
        return calcularDistancia(p2.getX(), p2.getY(), z);
    }

    /**
     * Calcula la distancia entre 2 puntos en 3D
     * @param p3 objeto de tipo P3
     * @return distancia
     */
    public double calcularDistancia(P3 p3){
        return calcularDistancia(p3.getX(), p3.getY(), p3.getZ());
    }
    public String toString(){
        String s = super.toString() + " Z: "+this.z;
        return s;
    }
}
