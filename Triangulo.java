public class Triangulo implements FiguraGeometrica {
    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;
    private int ladoC;
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getLadoA() {
        return ladoA;
    }
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }
    public int getLadoB() {
        return ladoB;
    }
    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
    public int getLadoC() {
        return ladoC;
    }
    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }
    @Override
    public int getArea() {
        int area;
        area = (this.base*this.altura)/2; 
        return 0;
    }
    @Override
    public String getNomeFigura() {
        return "Triangulo";
    }
    @Override
    public int getPerimetro() {
        return this.ladoA+this.ladoB+this.ladoC;
    }

    
}

