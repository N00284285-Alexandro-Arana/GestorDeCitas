/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitass;

import entidades.Cita;
import entidades.Medico;
import entidades.Paciente;
import gestordecitas.pantallas.JFrameGestorDeCitas;
import java.util.ArrayList;

import java.util.List;

/**
 * 
 * @author PierooA.S
 */
public class GestorDeCitas {
    
    //Se crean la Listas 
    public static List<Cita> citasEnElSistema;
    public static List<Paciente> listaDePacientes;
    public static List<Medico> listaDeMedicos;
    public static List<String> horasDisponibles=new ArrayList<>();
    public static List<String> fechasDisponibles=new ArrayList<>();
    
    
    public static void main(String[] args){
        
        //Genero las listas en blanco para todo el sistema hasta que se cierre
        citasEnElSistema=new ArrayList<>();
        listaDePacientes=new ArrayList<>();
        listaDeMedicos=new ArrayList<>();
        
        horasDisponibles.add("9:00am");
        horasDisponibles.add("9:30am");
        horasDisponibles.add("10:00am");
        horasDisponibles.add("10:30am");
        horasDisponibles.add("11:00am");
        horasDisponibles.add("11:30am");
        horasDisponibles.add("12:00am");
        
        
        fechasDisponibles.add("05/05/2023");
        fechasDisponibles.add("06/05/2023");
        fechasDisponibles.add("07/05/2023");
        fechasDisponibles.add("08/05/2023");
        fechasDisponibles.add("09/05/2023");
        
        
        //Inicio la ventana principal de gestor de citas.
        
        JFrameGestorDeCitas framePrincipal= new JFrameGestorDeCitas();
        framePrincipal.setLocationRelativeTo(null); //Centra el Formulario
        framePrincipal.setVisible(true);//Propiedad que me permite mostrar la pantalla
                                         
        
        
    }
    
}
