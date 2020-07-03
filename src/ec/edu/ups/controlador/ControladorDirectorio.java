/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariel
 */
public class ControladorDirectorio {
    
    private String ruta;
    private File archivo;
    private File[] archivos;

    public ControladorDirectorio(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public File[] getArchivos() {
        return archivos;
    }

    public void setArchivos(File[] archivos) {
        this.archivos = archivos;
    }
    
    public List<String> listarArchivos() {
        List archivos = new ArrayList();
        return archivos;
    }
    
    public List<String> listarDirectorios() {
        List directorios = new ArrayList();
        return directorios;
    } 
    
    public List<String> listarArchivosOcultos() {
        List archivosOcultos = new ArrayList();
        return archivosOcultos;
    }
    
    public List<String> listarDirectoriosOcultos() {
        List directoriosOcultos = new ArrayList();
        return directoriosOcultos;
    }
    
    public void crearDirectorio(String nombre) {
        
    }
    
    public void eliminarDirectorio(String nombre) {
        
    }
    
    public void renombrarDirectorio(String nombre) {
        
    }
    
    public String mostrarInformacion(String nombre) {
        return null;
    }
}
