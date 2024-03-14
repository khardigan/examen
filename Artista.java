package evf.javadoc.original;

public class Artista {
    // constante de la clase
    String nombreArtista;
    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }
   //toString
    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }
   //metodo que retorna nombreArtista
    public String getNombreArtista() {
        return nombreArtista;
	//Esto es un comentario
    }
	//comentario de jose 
   //metodo que devuelve el nombre
    public String cadenaArtista(){
	return "el nombre es :"+nombreArtista;
    }
    
}


