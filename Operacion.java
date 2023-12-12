
public class Operacion {
    int n;
    int n2; 
    int n3;
    double num;
    double num2;
    double resultado;
    
    public Operacion(){
        this.n = n;
        this.n2 = n2;
        this.resultado = n + n2;
    }
    
    public Operacion(int n, int n2, int n3){
        this.n = n;
        this.n2 = n2;
        this.n3= n3;
        this.resultado = n + n2 + n3 + 5;
    }
    
    public Operacion(double num, double num2){
        this.num = num;
        this.num2 = num2;
        this.resultado = num + num2 + 2;
    }
    
    public void Resultado(){
        System.out.println("El resultado es: "+this.resultado);
    }
    
    public static void main(String[] args) {
        Operacion op = new Operacion(5, 6);
        System.out.println("Suma del primer metodo");
        op.Resultado();
        Operacion op1 = new Operacion(7, 9, 8);
        System.out.println("Suma del segundo metodo");
        op1.Resultado();
        Operacion op2 = new Operacion(16.5,7.2);
        System.out.println("Suma del tercer metodo");
        op2.Resultado();
        
    }
    
}
