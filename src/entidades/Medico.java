/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author PierooA.S
 */
public class Medico {
    
    private String nombre;
    private String CMP;
    private List<Especialidad> especialidades;

    public Medico(String nombre, String CMP,List<Especialidad> especialidades) throws Exception {
        this.nombre = nombre;
        this.CMP = CMP;
        this.especialidades = especialidades;
        if(especialidades==null){
            throw new Exception("No se puede crear");
        }
    }
    
    public void agregarEspecialidad(Especialidad especialidad){
        this.especialidades.add(especialidad);
    }
    
    public String getDatosMostrar(){
        return this.getNombre()+" | CMP: " + this.getCMP();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCMP() {
        return CMP;
    }
    public void setCMP(String CMP) {
        this.CMP = CMP;
    }

    
    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }  
}
