package Practica5;

/**
 * @author Jorge.
 * Esta es la subclase Zelote que hereda de Personaje e inicializa los atributos de un Personaje.
 * @version 1.0.
 */

public abstract class Zelote extends Personaje{
    
    private int Fe;
    
/**
 * Este es un constructor por defecto de un Zelote. Inicializa todos sus atributos a su valor base excepto el Nombre y la Raza.
 */
    public Zelote(){
        setNombre("");
        setRaza("");
        setNivel(1);
        setVida(100);
        setAtaque(10);
        setAgilidad(10);
        setArmadura(30);
        setResistenciaMagica(30);
        setFe(10);
    }
    
/**
 * Este es un constructor con parámetros, los cuales, inicializan solo: El Nombre, Raza y Nivel. Ya que el resto de sus atributos siempre deben partir de su valor base.
 * @param no Recibe un atributo de tipo String que inicializará el Nombre si lo verifica el Setter diseñado para ello.
 * @param ra Recibe un atributo de tipo String que inicializará la Raza si lo verifica el Setter diseñado para ello.
 * @param ni Recibe un atributo de tipo int que inicializará el Nivel usando el Setter diseñado para ello.
 */
    public Zelote(String no, String ra, int ni){
        setNombre(no);
        setRaza(ra);
        setNivel(ni);
        setVida(100);
        setAtaque(10);
        setAgilidad(10);
        setArmadura(30);
        setResistenciaMagica(30);
        setFe(10);
        for(int i=0; i<ni; i++){
            subeNivel();
        }
    }
    
/**
 * Este método es un Setter que inicializará la Fe del Zelote.
 * @param f Recibe un atributo de tipo int que contendrá los puntos de Fe.
 */
    public void setFe(int f){
        Fe=f;
    }
    
/**
 * Este método es un Getter que devuelve un atributo de tipo int.
 * @return Devuelve los puntos de Fe del Zelote. Al ser Final nunca podrá ser usado en otra clase si ha sido modificado.
 */
    public int getFe(){
        return Fe;
    }
    
/**
 * Este método Abstract está destinado a usarse en subclases de Zelote.
 * @param mi Recibirá el atributo de tipo int con el que se seleccionará el Milagro.
 */
    public abstract void rezarMilagro(int mi);
    
/**
 * Este método implementado de la clase padre Persona, devuelve un atributo de tipo String.
 * @return Devuelve un String describiendo el estado del Zelote.
 */
    public String toString(){
        return "La raza del Zelote " + getNombre() + " es: " + getRaza() + ". Su Nivel es " + getNivel() + ", y tiene " + getVida() + " puntos de Vitalidad, " + getAtaque() + " puntos de Ataque, " + getAgilidad() + " puntos de Agilidad, " + getArmadura() + " puntos de Armadura, " + getResistenciaMagica() + " puntos de Resistencia Magica y " + getFe() + " puntos de Fe.";
    }
}
