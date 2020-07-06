/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.File;
import java.util.Date;
import javax.swing.DefaultListModel;

/**
 *
 * @author ariel
 */
public class ControladorDirectorio {

    private String ruta;
    private File archivo;
    private DefaultListModel archivos;

    public ControladorDirectorio(String ruta) {
        this.ruta = ruta;
        this.archivo = new File(this.ruta);
    }

    public File getArchivo() {
        if (archivo.exists()) {
            return archivo;
        } else {
            return null;
        }
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public DefaultListModel listarArchivos() {
        if (archivo.exists()) {
            archivos = new DefaultListModel();
            for (File archivo : archivo.listFiles()) {
                if (archivo.isFile() && archivo.isHidden() == false) {
                    archivos.addElement(archivo.getName());
                }
            }
            return archivos;
        } else {
            return null;
        }
    }

    public DefaultListModel listarDirectorios() {
        if (archivo.exists()) {
            archivos = new DefaultListModel();
            for (File archivo : archivo.listFiles()) {
                if (archivo.isDirectory() && archivo.isHidden() == false) {
                    archivos.addElement(archivo.getName());
                }
            }
            return archivos;
        } else {
            return null;
        }
    }

    public DefaultListModel listarArchivosOcultos() {
        if (archivo.exists()) {
            archivos = new DefaultListModel();
            for (File archivo : archivo.listFiles()) {
                if (archivo.isFile() && archivo.isHidden()) {
                    archivos.addElement(archivo.getName());
                }
            }
            return archivos;
        } else {
            return null;
        }
    }

    public DefaultListModel listarDirectoriosOcultos() {
        if (archivo.exists()) {
            archivos = new DefaultListModel();
            for (File archivo : archivo.listFiles()) {
                if (archivo.isDirectory() && archivo.isHidden()) {
                    archivos.addElement(archivo.getName());
                }
            }
            return archivos;
        } else {
            return null;
        }
    }

    public boolean crearDirectorio(String nombre) {
        if (!ruta.substring(ruta.length()-1).equals("/")) {
            ruta += "/";
        }
        File nuevo = new File(ruta + nombre);

        if (nuevo.exists()) {
            return false;
            
        } else {
            nuevo.mkdir();
            return true;
            
        }
    }

    public void eliminarDirectorio(String nombre) {
        File archivo = new File(nombre);
        File[] archivos = archivo.listFiles();

        if (archivos.length != 0) {
            for (File elemento : archivos) {
                if (elemento.isFile()) {
                    elemento.delete();
                } else if (elemento.isDirectory()) {
                    eliminarDirectorio(elemento.getAbsolutePath());
                }
            }
            archivo.delete();

        } else {
            archivo.delete();
        }

    }

    public void renombrarDirectorio(String nombre, String nuevoNombre) {
        File archivoSeleccionado = new File(nombre);
        archivoSeleccionado.renameTo(new File(nuevoNombre));

    }

    public String mostrarInformacion(String nombre) {
        //se instancia un nuevo directorio con el seleccionado por el usuario
        File archivo = new File(nombre);

        //Obtenemos el AbsolutePath del directorio seleccionado
        String pathAbsoluto = "       " + archivo.getAbsolutePath();

        //Obtenemos el tamaño del directorio seleccionado
        String tamañoArchivo = "\n\n       " + (archivo.length() / 1024) + " KBytes";

        //Verificamos si el directorio seleccionado tiene permisos de lectura
        String permisoLectura = "\n\n       ";
        if (archivo.canRead()) {
            permisoLectura += "Tiene permiso para lectura";
        } else {
            permisoLectura += "No tiene permiso para lectura";
        }

        //Verificamos si el directorio seleccionado tiene permisos de escritura
        String permisoEscritura = "\n\n       ";
        if (archivo.canWrite()) {
            permisoEscritura += "Tiene permiso para escritura";
        } else {
            permisoEscritura += "No tiene permiso para escritura";
        }

        //Obtenemos la fecha de modificacion del directorio seleccionado
        String fechaModificacion = "\n\n       " + new Date(archivo.lastModified());

        //Agregamos los datos al jTextArea
        return pathAbsoluto + tamañoArchivo + permisoLectura + permisoEscritura + fechaModificacion;
    }
}
