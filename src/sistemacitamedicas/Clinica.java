/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacitamedicas;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class Clinica {
    private ArrayList<Paciente> pacientes;
    private ArrayList<Doctor> doctores;
    private ArrayList<Cita> citas;
    
    public Clinica(){
        pacientes = new ArrayList<>();
        doctores = new ArrayList<>();
        citas = new ArrayList<>();
    }
    
    public void agregarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }
    
    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }
    
    public void agregarCita(Cita cita) {
        citas.add(cita);
    }
    
    public void mostrarPacientes() {
        for (Paciente paciente : pacientes){
            paciente.mostrarDatos();
            System.out.println();
        }
    }
    
    public void mostrarDoctores() {
        for (Doctor doctor : doctores){
            doctor.mostrarDatos();
            System.out.println();
        }
    }
    
    public void mostrarCitas() {
        for (Cita cita : citas){
            cita.mostrarDatos();
            System.out.println();
        }
    }
}
