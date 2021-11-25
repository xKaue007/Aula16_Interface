public class Quadrado implements FiguraGeometrica{
    
    private int lado;

    public int getLado(){
        return this.lado;
    }

    public void setLado(int lado){
        this.lado = lado;
    }



    @Override
    public int getArea() {
        int area;
        area=this.lado*this.lado;
        return area;
    }
    @Override
    public int getPerimetro(){
        int perimetro;
        perimetro=this.lado*4;
        return perimetro;
    }
    @Override
    public String getNomeFigura(){
        return "quadrado";
    }
}
