/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacitamedicas;

/**
 *
 * @author LENOVO
 */
public class Cita {
    private Paciente paciente;
    private Doctor doctor;
    private String fecha;
    private String hora;
    
    public Cita(Paciente paciente, Doctor doctor, String fecha, String hora) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public void mostrarDatos() {
        System.out.println("===== CITA =====");
        System.out.println("Paciente: " + paciente.getNombre());
        System.out.println("Doctor: " + doctor.getNombre());
        System.out.println("Especialidad: " + doctor.getEspecialidad());
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);

    }
}
