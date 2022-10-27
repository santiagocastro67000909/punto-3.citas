/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pto6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {
     public static void main(String[] args) {
         boolean terminar =false ;
         Scanner sc = new Scanner(System.in);
         Agenda citamedica = new Agenda (3);
         Agenda disponibilidadmedicos = new Agenda (3);
         String nombre,sucursal,especialista,direccion;
         int op=0,opcita = 0, telefono;
         Cita c ;
         Medico m ;
         m = new Medico ("Cardiologo ", true, "8:00am", "Camilo Hernandez ", "Clinica Colombia", "Carrera 66 #23-46", 7777);
         disponibilidadmedicos.aniadirDisponibilidadMedico(m);
         m = new Medico ("Anestesiologo", true, "12:00 am", "Cristian rincon ", "Clinica nueva eps", "Carrera 14 #5241", 1234);
         disponibilidadmedicos.aniadirDisponibilidadMedico(m);
         while (!terminar)
         {      
                System.out.println("1. añadir usuario");
                System.out.println("2. Mostrar disponibilidad de los medicos");
                System.out.println("3. Añadir cita o cancelar cita ");
                System.out.println("4. Ver el estado de la cita");
                System.out.println("Escribe una de las opciones");
                op = sc.nextInt();
            
              switch (op){
                  case 1:
                      System.out.println("Ingrese un nombre: ");
                      nombre = sc.next();
                      System.out.println("Ingrese una sucursal: ");
                      sucursal= sc.next();
                      System.out.println("Ingrese una direccion: ");
                      direccion = sc.next();
                      System.out.println("Ingrese un telefono: ");
                      telefono = sc.nextInt();
                      break;
                  case 2:
                      System.out.println("--Estas son las citas disponibles--");
                      disponibilidadmedicos.listarDisponibilidadMedica();
                      break;
                     
                  case 3:
                      System.out.println("Ingrese" + "1. Cita ortopedista"+ "\n 2. Cita Pediatria");
                      opcita = sc.nextInt();
                      if (opcita==1){
                          c= new Cita ("Camilo Hernandez", "Clinica Colombia", "Cardiologo" );
                          citamedica.aniadirCita(c);
                      }else{
                      c= new Cita ("Cristian rincon", "Clinica nueva eps", "Anestesiologo" );
                      citamedica.aniadirCita(c);
                      break;
                      }
                  case 4 :
                      2
                  case 5 :
                      terminar = true ;
                      break;
                      
              }
         }
    
             
         
     }
     
}
