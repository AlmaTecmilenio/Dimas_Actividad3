/*Autor: Alma Dimas Sanchez
Materia: Taller de productividad basada en herramientas tecnológicas
 */

public class Paciente {
    private String pacienteID;
    private String nombre;
    public Paciente(String n, String id){
        this.nombre=n;
        this.pacienteID=id;
    }

    public String getpacienteID() {
        return pacienteID;
    }
}
