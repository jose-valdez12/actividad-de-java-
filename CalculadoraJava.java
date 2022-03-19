
package calculadora.java;


public class CalculadoraJava {
    
    //atributos 
private double operacion1;
private double operacion2;



public CalculadoraJava(){

}
    
public CalculadoraJava (double operacion1, double  operacion2){
        
this.operacion1 = operacion1;
this.operacion2 = operacion2;
        
}
//operaciones basicas 
public double  sumar (){
    double suma = this.operacion1+this.operacion2;
    return suma;
}

public double  restar (){
    double restar = this.operacion1-this.operacion2;
    return restar;
}

public double  multiplicar (){
    double  multiplicar = this.operacion1*this.operacion2;
    return multiplicar;
}


public double dividir (){
    double dividir =this.operacion1/this.operacion2;
    return dividir;
}



    public double getOperacion1() {
        return operacion1;
    }

    public void setOperacion1(double operacion1) {
        this.operacion1 = operacion1;
    }

    public double getOperacion2() {
        return operacion2;
    }

    public void setOperacion2(double  operacion2) {
        this.operacion2 = operacion2;
    }


}