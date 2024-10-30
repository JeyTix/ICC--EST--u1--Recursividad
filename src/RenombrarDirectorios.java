import java.io.File;

/**
 * RenombrarDirectorios
 */
public class RenombrarDirectorios {

    public void renombrarDirec(String path){
        // Valida path sea directorio
        File direct=  new File(path);
        if (!direct.exists() || !direct.isDirectory()){
            System.out.println("La ruta path no es directorio valido");
            return;
        }
        System.out.println("La ruta path es valida");
        renombrarDirecInternos(direct);
    }

    private void renombrarDirecInternos(File direct) {
        // Listar todos los archivos y/o carpetas hijas
        File[] directoriosArchInter = direct.listFiles();
        if (directoriosArchInter== null) {
            return;
        }
        for (File directorioArch : directoriosArchInter) {
            if (directorioArch.isDirectory()) {
                String nombreOriginal= directorioArch.getName();
                
            }
        }

    }
    
}