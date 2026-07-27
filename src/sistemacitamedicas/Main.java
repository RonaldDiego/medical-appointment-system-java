/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacitamedicas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Clinica clinica = new Clinica();

        int opcion;

        do {

            System.out.println("\n========= CLÍNICA =========");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Registrar doctor");
            System.out.println("3. Agendar cita");
            System.out.println("4. Mostrar pacientes");
            System.out.println("5. Mostrar doctores");
            System.out.println("6. Mostrar citas");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer

            switch (opcion) {

                case 1: {
                    System.out.println("\n===== REGISTRAR PACIENTE =====");

                    System.out.print("Ingrese nombre: ");
                    String nombre = teclado.nextLine();

                    System.out.print("Ingrese edad: ");
                    int edad = teclado.nextInt();
                    teclado.nextLine();

                    System.out.print("Ingrese DNI: ");
                    String dni = teclado.nextLine();

                    Paciente paciente = new Paciente(nombre, edad, dni);

                    clinica.agregarPaciente(paciente);

                    System.out.println("Paciente registrado correctamente.");

                    break;
                }

                case 2: {
                    System.out.println("\n===== REGISTRAR DOCTOR =====");

                    System.out.print("Ingrese nombre del doctor: ");
                    String nombreDoctor = teclado.nextLine();

                    System.out.print("Ingrese especialidad: ");
                    String especialidad = teclado.nextLine();

                    System.out.print("Ingrese código del doctor: ");
                    String codigo = teclado.nextLine();

                    Doctor doctor = new Doctor(nombreDoctor, especialidad, codigo);

                    clinica.agregarDoctor(doctor);

                    System.out.println("Doctor registrado correctamente.");

                    break;
                }

                case 3: {
                    System.out.println("\n===== AGENDAR CITA =====");

                    System.out.print("Ingrese nombre del paciente: ");
                    String nombrePaciente = teclado.nextLine();

                    System.out.print("Ingrese edad del paciente: ");
                    int edadPaciente = teclado.nextInt();
                    teclado.nextLine();

                    System.out.print("Ingrese DNI del paciente: ");
                    String dniPaciente = teclado.nextLine();

                    Paciente paciente = new Paciente(nombrePaciente, edadPaciente, dniPaciente);

                    System.out.print("Ingrese nombre del doctor: ");
                    String nombreDoctor = teclado.nextLine();

                    System.out.print("Ingrese especialidad: ");
                    String especialidadDoctor = teclado.nextLine();

                    System.out.print("Ingrese código del doctor: ");
                    String codigoDoctor = teclado.nextLine();

                    Doctor doctor = new Doctor(nombreDoctor, especialidadDoctor, codigoDoctor);

                    System.out.print("Ingrese fecha de la cita: ");
                    String fecha = teclado.nextLine();

                    System.out.print("Ingrese hora de la cita: ");
                    String hora = teclado.nextLine();

                    Cita cita = new Cita(paciente, doctor, fecha, hora);

                    clinica.agregarCita(cita);

                    System.out.println("Cita registrada correctamente.");

                    break;

                }

                case 4: {

                    System.out.println("\n===== LISTA DE PACIENTES =====");

                    clinica.mostrarPacientes();

                    break;
                }

                case 5: {

                    System.out.println("\n===== LISTA DE DOCTORES =====");

                    clinica.mostrarDoctores();

                    break;
                }

                case 6: {

                    System.out.println("\n===== LISTA DE CITAS =====");

                    clinica.mostrarCitas();

                    break;
                }

                case 7: {
                    System.out.println("Gracias por usar el sistema.");
                    break;
                }

                default: {
                    System.out.println("Opción inválida.");
                }
            }

        } while (opcion != 7);

        teclado.close();
    }
}
