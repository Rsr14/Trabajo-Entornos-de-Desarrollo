/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor..
 */

/**
 * 
 * 
 * @author rober
 *
 */

public class CCuenta {
	/**
     *variables privadas y dobles
     */


    private String nombre;
    
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    


    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)//Comentario 1
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public void asignarNombre(String nom)//Comentario 2
    {
        setNombre(nom);
    }

    public String obtenerNombre()/**
    
    Más comentarios en javadoc
    */
    {
        return getNombre();
    }


    public double estado()
    {
        return saldo;
    }

    /**
    @param parametros
    @throws excepciones
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }


    public String obtenerCuenta()
    {
        return cuenta;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getTipoInteres() {
        return tipoInteres;
    }


    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
