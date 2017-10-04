/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf2ejer1;

/**
 *
 * @author Gonzalo
 */
public class Cuenta {
    //Atributos
    String Nombre;
    int Monto;
    
    //Metodos
    public void ingreso(){}
    public void reintegro(){}
    public void transferencia(){}
    
    //Contructores
    //Por defecto
    public Cuenta() {
    }
     //Con parametros
    public Cuenta(String Nomb, int Mont) {
        this.Nombre = Nomb;
        this.Monto = Mont;
    }
    //Copia
    public Cuenta(Cuenta cuentas){
        this.Nombre = cuentas.Nombre;
        this.Monto = cuentas.Monto;
    }
    
    
    // Setters y Getters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

}
