import java.util.ArrayList;

/**
 * Esta clase representa el Game Manager del juego. Se encarga de almacenar los datos del juego y asegurar su correcto funcionamiento.
 *
 * El personaje principal del juego tiene los siguientes atributos: nombre, vida, ataque, velocidad, defensa, inventario y nivel de relación con otros personajes del juego.
 *
 * El inventario almacena objetos de interés en el juego, y el nivel de relación se ve afectado por las acciones del jugador y define su trato con los demás personajes.
 *
 * Otra entidad relacionada con el Game Manager es el mapa, que se genera de forma procedural a partir de una variedad de mapas proporcionados por el Game Manager. El mapa almacena sus propias texturas y puntos de nodos donde se generan enemigos según su ubicación en el Game Manager.
 *
 * Los personajes secundarios reciben del Game Manager descripciones, texturas y nombres.
 */
public class GameManager {

    private String nombreProtagonista;
    private int vidaProtagonista;
    private int ataqueProtagonista;
    private int velocidadProtagonista;
    private int defensaProtagonista;
    private ArrayList<String> inventarioProtagonista;
    private int nivelRelacionProtagonista;
    private Mapa mapa;
    private ArrayList<Personaje> personajesSecundarios;

    // Métodos y atributos adicionales del Game Manager
    // ...
}

/**
 * Esta clase representa un personaje del juego. Puede ser un personaje amigable o un personaje enemigo dependiendo de la situación.
 *
 * Los personajes secundarios reciben descripciones, texturas y nombres del Game Manager.
 *
 * @see PersonajeAmigable
 * @see PersonajeEnemigo
 * @see GameManager
 */
abstract class Personaje {
    protected String nombre;
    protected String descripcion;
    protected String textura;

    // Métodos y atributos adicionales del personaje
    // ...
}

