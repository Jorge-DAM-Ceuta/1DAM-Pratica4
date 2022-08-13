package Practica5;

/**
 * @author Jorge.
 * Esta es la subclase Mago que hereda de Personaje e inicializa los atributos de un Personaje además de su Magia.
 * @version 1.0.
 */

public class Mago extends Personaje{
    
    private int Magia;
   
/**
 * Este es un constructor por defecto de un Mago. Inicializa todos sus atributos a su valor base excepto el Nombre y la Raza.
 */
    public Mago(){
        setNombre("");
        setRaza("");
        setNivel(1);
        setVida((int)(100*0.9));
        setAtaque((int)(10*0.7));
        setAgilidad((int)(10*1.15));
        setArmadura((int)(30*0.9));
        setResistenciaMagica((int)(30*1.6));
        Magia=10;
    }
    
/**
 * Este es un constructor con parámetros, los cuales, inicializan solo: El Nombre, Raza y Nivel. Ya que el resto de sus atributos siempre deben partir de su valor base.
 * @param no Recibe un atributo de tipo String que inicializará el Nombre si lo verifica el Setter diseñado para ello.
 * @param ra Recibe un atributo de tipo String que inicializará la Raza si lo verifica el Setter diseñado para ello.
 * @param ni Recibe un atributo de tipo int que inicializará el Nivel usando el Setter diseñado para ello.
 */
    public Mago(String no, String ra, int ni){
        setNombre(no);
        setRaza(ra);
        setNivel(ni);
        setVida((int)(100*0.9));
        setAtaque((int)(10*0.7));
        setAgilidad((int)(10*1.15));
        setArmadura((int)(30*0.9));
        setResistenciaMagica((int)(30*1.6));
        setMagia(10);
        for(int i=0; i<ni; i++){
            subeNivel();
        }
    }
    
/**
 * Este método es un Setter que inicializará la Magia del Mago.
 * @param ma Recibe un atributo de tipo int que contendrá los puntos de Magia.
 */
    public void setMagia(int ma){
        Magia=ma;
    }
    
/**
 * Este método es un Getter que devuelve un atributo de tipo int.
 * @return Devuelve los puntos de Magia del Mago. Al ser Final nunca podrá ser usado en otra clase si ha sido modificado.
 */
    public final int getMagia(){
        return Magia;
    }
    
/**
 * Este método imprime por pantalla el nombre de un conjuro a lanzar, dependiendo de cuál se seleccione en el Switch.
 * @param con Recibe el atributo de tipo int con el que se selecciona el conjuro.
 */
    public void lanzarConjuro(int con){
        
        switch(con){
            case 1:
                System.out.println("Bola de fuego");
            break;
            
            case 2:
                System.out.println("Lanza de hielo");
            break;
            
            case 3:
                System.out.println("Cefiro");
            break;
        }
    }
    
/**
 * Este método imprime por pantalla un String que determina un Ataque usando los Getters del Nombre y Ataque del Mago.
 */
    public void luchar(){
        System.out.println("El Mago " + getNombre() + " ataca con " + getAtaque() + " puntos de daÃ±o.");        
    }
    
/**
 * Esta versión del método sobrecargado imprime por pantalla un String que determina un Ataque usando el Getter del Nombre del Mago junto con el conjuto que lanza.
 * @param con Recibe un atributo de tipo int que selecciona el hechizo a lanzar.
 */
    public void luchar(int con){
        System.out.println("El Mago " + getNombre() + " lanza su hechizo:"); 
        lanzarConjuro(con);        
    }
    
/**
 * Este método implementado de la clase padre Persona, devuelve un atributo de tipo String.
 * @return Devuelve un String describiendo el estado del Mago.
 */
    public String toString(){
        return "La raza del Mago " + getNombre() + " es: " + getRaza() + ". Su Nivel es " + getNivel() + ", y tiene " + getVida() + " puntos de Vitalidad, " + getAtaque() + " puntos de Ataque, " + getAgilidad() + " puntos de Agilidad, " + getArmadura() + " puntos de Armadura, " + getResistenciaMagica() + " puntos de Resistencia Magica y " + getMagia() + " puntos de Magia.";
    }
}
