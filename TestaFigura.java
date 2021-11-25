public class TestaFigura {
    
    public static void main(String[] args){
        Quadrado quadrado=new Quadrado();
        Triangulo triangulo=new Triangulo();

        triangulo.setLadoA(5);
        triangulo.setLadoB(6);
        triangulo.setLadoC(7);
        triangulo.setBase(5);
        triangulo.setAltura(8);

        System.out.println(triangulo.getNomeFigura());
        System.out.println(triangulo.getPerimetro());

        quadrado.setLado(4);
        System.out.println(quadrado.getPerimetro());
        System.out.println(quadrado.getArea());
        System.out.println(quadrado.getNomeFigura());
    }
}
