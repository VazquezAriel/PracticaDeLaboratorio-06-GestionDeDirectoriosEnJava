# PracticaDeLaboratorio-06-GestionDeDirectoriosEnJava
En esta practica se desarrollo un sistema en JAVA que me permita gestionar directorios desde una interfaz gráfica

### Lenguaje

+ Java = JDK 1.8
+ IDE = NetBeans Apache 11.3

### Librerias

+ java.io.File;
+ java.util.Date;
+ javax.swing.DefaultListModel;
+ javax.swing.JOptionPane;

## Realizacion de la practica

+ Se creo un nuevo proyecto en NetBeans con el nombre de Practica03-VazquezAriel
En el cual se crearon 2 paquetes (ec.edu.ups.controlador y ec.edu.ups.vista).

+ En el paquete ec.edu.ups.controlador se creo una clase con el nombre de ControladorDirectorio:

+ En el paquete ec.edu.ups.vista se creó una ventana con el nombre de VentanaPrincipal:

![](https://github.com/VazquezAriel/PracticaDeLaboratorio-06-GestionDeDirectoriosEnJava/blob/master/VentanaCreada.png)

+ En la clase ControladorDirectorio se crearon los métodos:

### listarArchivos():
Este método nos devuelve un DefaultListModel el cual se seteeara en el jList de la ventana. 
Primero pregunta si el directorio existe; si esto es verdad crea un nuevo DefaultListModel y se recorre los elementos que existan dentro del directorio y estos se agregaran a el DefaultListModel solo si el elemento es un archivo y no esta oculto. 
Retorna null si el directorio no existe

### listarDirectorios():
Este método nos devuelve un DefaultListModel el cual se seteeara en el jList de la ventana. 
Primero pregunta si el directorio existe; si esto es verdad crea un nuevo DefaultListModel y se recorre los elementos que existan dentro del directorio y estos se agregaran a el DefaultListModel solo si el elemento es un directorio y no esta oculto. 
Retorna null si el directorio no existe

### listarArchivosOcultos():
Este método nos devuelve un DefaultListModel el cual se seteeara en el jList de la ventana. 
Primero pregunta si el directorio existe; si esto es verdad crea un nuevo DefaultListModel y se recorre los elementos que existan dentro del directorio y estos se agregaran a el DefaultListModel solo si el elemento es un archivo y esta oculto. 
Retorna null si el directorio no existe

### listarDirectoriosOcultos():
Este método nos devuelve un DefaultListModel el cual se seteeara en el jList de la ventana. 
Primero pregunta si el directorio existe; si esto es verdad crea un nuevo DefaultListModel y se recorre los elementos que existan dentro del directorio y estos se agregaran a el DefaultListModel solo si el elemento es un directorio y  esta oculto. 
Retorna null si el directorio no existe

### CrearDirectorio(): 
Recibe el nombre del directorio a crear y lo concatena con la ruta ingresada anteriormente si este nombre ya esta en uso retorna falso sino crea el directorio y retorno verdadero

### EliminarDirectorio():
Recibe la ruta del directorio a eliminar  crea un nuevo File con dicha ruta y genera un array con los elementos que estén dentro; pregunta si el array no esta vacío, si no lo esta recorre dicho array y pregunta si es un archivo lo elimina en cambio si es un directorio llama de nuevo al método.

### mostrarInformacion():
Recibe la ruta del directorio escogido crea un Fila con dicha ruta y accede a los datos solicitados.

## Ejecucion del programa:

![](https://github.com/VazquezAriel/PracticaDeLaboratorio-06-GestionDeDirectoriosEnJava/blob/master/image.png)

Se recomienda descargar la practica para ejecutar todas las acciones posibles
