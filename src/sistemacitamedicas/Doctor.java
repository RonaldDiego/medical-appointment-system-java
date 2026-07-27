/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacitamedicas;

/**
 *
 * @author LENOVO
 */
public class Doctor {
    
    private String nombre;
    private String especialidad;
    private String codigo;
    
    public Doctor(String nombre, String especialidad, String codigo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void mostrarDatos() {
        System.out.println("===== DOCTOR =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Código: " + codigo);
    }
}
