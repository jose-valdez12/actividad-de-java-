
package calculadora.java;


public class CalculadoraJava {
    
    //atributos 
private int operacion1;
private int operacion2;



public CalculadoraJava(){

}
    
public CalculadoraJava (int operacion1, int operacion2){
        
this.operacion1 = operacion1;
this.operacion2 = operacion2;
        
}
//operaciones basicas 
public int sumar (){
    int suma = this.operacion1+this.operacion2;
    return suma;
}

public int restar (){
    int restar = this.operacion1-this.operacion2;
    return restar;
}

public int multiplicar (){
    int multiplicar = this.operacion1*this.operacion2;
    return multiplicar;
}


public double dividir (){
    double dividir =(double)this.operacion1/(double)this.operacion2;
    return dividir;
}



    public int getOperacion1() {
        return operacion1;
    }

    public void setOperacion1(int operacion1) {
        this.operacion1 = operacion1;
    }

    public int getOperacion2() {
        return operacion2;
    }

    public void setOperacion2(int operacion2) {
        this.operacion2 = operacion2;
    }


}