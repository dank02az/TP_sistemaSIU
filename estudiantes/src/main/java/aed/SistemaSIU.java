package aed;
import java.util.ArrayList;

public class SistemaSIU {

    public class Estudiante {
        int cantInscripciones = 0;
    }    
    
    public class Materia {
        ArrayList<Integer> cantidadDocentes;
        ArrayList<String> libretas;
        ArrayList<String> nombres;

        public ArrayList<String> getEquivanlentes() {
            return this.nombres;
        }
        public ArrayList<String> getLibretas() {
            return this.libretas;
        }
        public ArrayList<Integer> getCantDocentes() {
            return this.cantidadDocentes;
        }
    }
    public class Carrera {
         String nombreCarrera;
         Trie<Materia> materia;   

         public Carrera(String nombre, Trie<Materia>  mTrie){
            nombreCarrera = nombre;
            materia = mTrie;
         }
         
    }

    public Materia[] materias;
    public Trie<Carrera> carreras;
    public Trie<Estudiante> inscripciones;

    enum CargoDocente{
        AY2,
        AY1,
        JTP,
        PROF
    }

    public void agregarMateria(Materia m) {
        Materia[] copiaMaterias = new Materia[materias.length+1];
        int i = 0;            
        while (i <  materias.length) { 
            copiaMaterias[i] = materias[i];
            i++;       
        }
        copiaMaterias[i] = m;
        materias = copiaMaterias;  
    }

    public void quitarMaterias() {
        
        int longitud = 0;

        if (materias.length > 0){
            longitud =materias.length-1;
        }

        Materia[] _copiaMaterias = new Materia [longitud];

        int k = 0;
        while (k < materias.length-1) {
            _copiaMaterias[k] = materias[k];
            k=k+1;
        }
         materias = _copiaMaterias;
    }

    public SistemaSIU(InfoMateria[] infoMaterias, String[] libretasUniversitarias){
        Carrera carrera = new Carrera(); 
        Materia materia = new Materia();
        
        for(InfoMateria infoMateria : infoMaterias){
           for(ParCarreraMateria parCarreraMateria : infoMateria.getParesCarreraMateria()){
                String carrera = parCarreraMateria.getCarrera();
                String nombreMateria = parCarreraMateria.getNombreMateria();
                materia.nombres.add(nombreMateria);
                carrera.
                agregarMateria(materia);

              }
           }
        }
    }

    public void inscribir(String estudiante, String carrera, String materia){
        throw new UnsupportedOperationException("Método no implementado aún");
    }

    public void agregarDocente(CargoDocente cargo, String carrera, String materia){
        throw new UnsupportedOperationException("Método no implementado aún");	    
    }

    public int[] plantelDocente(String materia, String carrera){
        throw new UnsupportedOperationException("Método no implementado aún");	    
    }

    public void cerrarMateria(String materia, String carrera){
        throw new UnsupportedOperationException("Método no implementado aún");	    
    }

    public int inscriptos(String materia, String carrera){
        throw new UnsupportedOperationException("Método no implementado aún");	    
    }

    public boolean excedeCupo(String materia, String carrera){
        throw new UnsupportedOperationException("Método no implementado aún");	    
    }

    public String[] carreras(){
        throw new UnsupportedOperationException("Método no implementado aún");	    
    }

    public String[] materias(String carrera){
        throw new UnsupportedOperationException("Método no implementado aún");	    
    }

    public int materiasInscriptas(String estudiante){
        throw new UnsupportedOperationException("Método no implementado aún");	    
    }
}
