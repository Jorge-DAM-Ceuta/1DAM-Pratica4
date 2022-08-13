package Practica5;

/**
 * @author Jorge.
 * Esta es la subclase Guerrero que hereda de Personaje e inicializa los atributos de un Personaje además de su Furia.
 * @version 1.0.
 */

public class Guerrero extends Personaje{
    
    private boolean Furia;
    
/**
 * Este es un constructor por defecto de un Guerrero. Inicializa todos sus atributos a su valor base excepto el Nombre y la Raza.
 */
    public Guerrero(){
        setNombre("");
        setRaza("");
        setNivel(1);
        setVida((int)(100*1.15));
        setAtaque((int)(10*1.2));
        setAgilidad(10);
        setArmadura((int)(30*1.15));
        setResistenciaMagica((int)(30*0.8));
        Furia=false;
    }
    
/**
 * Este es un constructor con parámetros, los cuales, inicializan solo: El Nombre, Raza y Nivel. Ya que el resto de sus atributos siempre deben partir de su valor base.
 * @param no Recibe un atributo de tipo String que inicializará el Nombre si lo verifica el Setter diseñado para ello.
 * @param ra Recibe un atributo de tipo String que inicializará la Raza si lo verifica el Setter diseñado para ello.
 * @param ni Recibe un atributo de tipo int que inicializará el Nivel usando el Setter diseñado para ello.
 */
    public Guerrero(String no, String ra, int ni){
        setNombre(no);
        setRaza(ra);
        setNivel(ni);
        setVida((int)(100*1.15));
        setAtaque((int)(10*1.2));
        setAgilidad(10);
        setArmadura((int)(30*1.15));
        setResistenciaMagica((int)(30*0.8));
        Furia=false;
        for(int i=0; i<ni; i++){
            subeNivel();
        }
    }

/**
 * Este método es un Setter que inicializará la Furia del Guerrero.
 * @param fu Recibe un atributo de tipo boolean para activar la Furia si es verdadero.
 */
    public void setFuria(boolean fu){
        Furia=fu;
    }
    
/**
 * Este método es un Getter que devuelve un atributo de tipo Boolean.
 * @return Devuelve la Furia del Guerrero. Al ser Final nunca podrá ser usado en otra clase si ha sido modificado.
 */
    public final boolean getFuria(){
        return Furia;
    }
    
/**
 * Este método imprime por pantalla un String que determina un Ataque usando los Getters del Nombre y Ataque del Guerrero.
 */
    public void luchar(){
        if(Furia==true){
            setAtaque(this.getAtaque()*2);
            System.out.println(getNombre() + " esta furioso! Aumenta x2 los puntos de Ataque.");
            System.out.println("El Guerrero " + getNombre() + " ataca con " + getAtaque() + " puntos de daÃ±o");
        
            setAtaque(getAtaque()/2);
        }else{
            System.out.println("El Guerrero " + getNombre() + " ataca con " + getAtaque() + " puntos de daÃ±o");
        }
    }
    
/**
 * Este método imprime por pantalla un String que determina una Defensa usando los Getters del Nombre, Armadura y Resistencia Mágica del Guerrero.
 */
    public void defender(){
        if(Furia==true){
            setArmadura(getArmadura()/2);
            setResistenciaMagica(getResistenciaMagica()/2);
            System.out.println(getNombre() + " esta furioso! Tiene la mitad de puntos de Armadura y Resistencia Magica");
            System.out.println("El Guerrero " + getNombre() + " tiene " + getArmadura() + " puntos de Armadura" + " y " + getResistenciaMagica() + " puntos de Resistencia Magica");        
            
            setArmadura(getArmadura()*2);
            setResistenciaMagica(getResistenciaMagica()*2);
        }else{
            System.out.println("El Guerrero " + getNombre() + " tiene " + getArmadura() + " puntos de Armadura" + " y " + getResistenciaMagica() + " puntos de Resistencia Magica");       
        }
    }
    
/**
 * Este método implementado de la clase padre Persona, devuelve un atributo de tipo String.
 * @return Devuelve un String describiendo el estado del Guerrero.
 */
    public String toString(){
        return "La raza del Guerrero " + getNombre() + " es: " + getRaza() + ". Su Nivel es " + getNivel() + ", y tiene " + getVida() + " puntos de Vitalidad, " + getAtaque() + " puntos de Ataque, " + getAgilidad() + " puntos de Agilidad, " + getArmadura() + " puntos de Armadura, " + getResistenciaMagica() + " puntos de Resistencia Magica y Furia activa: " + getFuria();
    }
}
