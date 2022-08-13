package Practica5;

/**
 * @author Jorge.
 * Esta es la subclase Bardo que hereda de Personaje e inicializa los atributos de un Personaje.
 * @version 1.0.
 */

public class Bardo extends Personaje{
    
/**
 * Este es un constructor por defecto de un Bardo. Inicializa todos sus atributos a su valor base excepto el Nombre y la Raza.
 */
    public Bardo(){
        setNombre("");
        setRaza("");
        setNivel(1);
        setVida((int)(100*1.1));
        setAtaque((int)(10*0.9));
        setAgilidad((int)(10*1.5));
        setArmadura((int)(30*0.9));
        setResistenciaMagica((int)(30*0.9));
    }
    
/**
 * Este es un constructor con par�metros, los cuales, inicializan solo: El Nombre, Raza y Nivel. Ya que el resto de sus atributos siempre deben partir de su valor base.
 * @param no Recibe un atributo de tipo String que inicializar� el Nombre si lo verifica el Setter dise�ado para ello.
 * @param ra Recibe un atributo de tipo String que inicializar� la Raza si lo verifica el Setter dise�ado para ello.
 * @param ni Recibe un atributo de tipo int que inicializar� el Nivel usando el Setter dise�ado para ello.
 */
    public Bardo(String no, String ra, int ni, String mu){
        setNombre(no);
        setRaza(ra);
        setNivel(ni);
        setVida((int)(100*1.1));
        setAtaque((int)(10*0.9));
        setAgilidad((int)(10*1.5));
        setArmadura((int)(30*0.9));
        setResistenciaMagica((int)(30*0.9));
        for(int i=0; i<ni; i++){
            subeNivel();
        }
    }
    
/**
 * Este m�todo imprime por pantalla el nombre de la M�sica que tocar�, dependiendo de cu�l se seleccione en el Switch.
 * @param m Recibe el atributo int con el que se selecciona la M�sica.
 */
    private void tocarMusica(int m){
        switch(m){
            case 1:
                System.out.println("Sinfonia Lugubre");
                break;
            
            case 2: 
                System.out.println("Arenga de combate");
                break;
             
            case 3:
                System.out.println("Flamenco");
                break;
        }
    }

/**
 * Este m�todo imprime por pantalla un String que determina un Ataque usando los Getters de Nombre y Ataque del Bardo.
 */
    public void luchar(){
        System.out.println("El Bardo " + getNombre() + " ataca con " + getAtaque() + " puntos de daño");
    }
    
/**
 * Esta versi�n del m�todo sobrecargado imprime por pantalla un String que determina un Ataque con su habilidad musical, usando el Getter del Nombre del Bardo junto a la M�sica que toca.
 * @param mu Recibe un atributo de tipo int que selecciona la M�sica a tocar.
 */
    public void luchar(int mu){
        System.out.println("El Bardo " + getNombre() + " usa su habilidad musical: ");
        tocarMusica(mu);
    }
    
/**
 * Este m�todo implementado de la clase padre Persona, devuelve un atributo de tipo String.
 * @return Devuelve un String describiendo el estado del Bardo.
 */
    public String toString(){
        return "La raza del Bardo " + getNombre() + " es: " + getRaza() + ". Su Nivel es, " + getNivel() + " y tiene " + getVida() + " puntos de Vitalidad, " + getAtaque() + " puntos de Ataque, " + getAgilidad() + " puntos de Agilidad, " + getArmadura() + " puntos de Armadura, y " + getResistenciaMagica() + " puntos de Resistencia Magica";
    }
}
