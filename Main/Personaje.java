package Practica5;

/**
 * @author Jorge.
 * Esta es la clase padre Personaje, que inicializa y permite modificar los atributos de un Personaje.
 * @version 1.0.
 */

public abstract class Personaje {
   
    String Nombre; 
    String Raza;
    private int Nivel, Vida, Ataque, Agilidad, Armadura, ResistenciaMagica;
    
/**
 * Este es un constructor por defecto de un Personaje. Inicializa todos sus atributos a su valor base excepto el Nombre y la Raza.
 */
    public Personaje(){
        Nombre="";
        Raza="";
        Nivel=1;
        Vida=100;
        Ataque=10;
        Agilidad=10;
        Armadura=30;
        ResistenciaMagica=30;
    }
    
/**
 * Este es un constructor con par�metros, los cuales, inicializan solo: El Nombre, Raza y Nivel. Ya que el resto de sus atributos siempre deben partir de su valor base.
 * @param no Recibe un atributo de tipo String que inicializar� el Nombre si lo verifica el Setter dise�ado para ello.
 * @param ra Recibe un atributo de tipo String que inicializar� la Raza si lo verifica el Setter dise�ado para ello.
 * @param ni Recibe un atributo de tipo int que inicializar� el Nivel usando el Setter dise�ado para ello.
 */
    public Personaje(String no, String ra, int ni){
        setNombre(no);
        setRaza(ra);
        setNivel(ni);
        Vida=100;
        Ataque=10;
        Agilidad=10;
        Armadura=30;
        ResistenciaMagica=30;
    }
    
/**
 * Este m�todo comprueba que se cumpla la condici�n para que un Nombre sea v�lido.
 * @param no Recibe un atributo de tipo String que contendr� el Nombre del Personaje.
 * @return Devuelve verdadero si se cumple su condici�n, para despu�s ser usado en un Setter.
 */
    protected boolean checkNombre(String no){
        boolean comp=false;
        
        if(no.length()>=4){
            comp=true;
        }
        
        return comp;
    }
    
/**
 * Este m�todo comprueba que se cumpla la condici�n para que una Raza sea v�lida.
 * @param ra Recibe un atributo de tipo String que contendr� la Raza del Personaje.
 * @return Devuelve verdadero si se cumple su condici�n, para despu�s ser usado en un Setter.
 */ 
    protected boolean checkRaza(String ra){
        boolean comp=false;
        
        if(!ra.equals("Angel") || !ra.equals("Demonio")){
            comp=true;
        }
        
        return comp;
    }
    
/**
 * Este m�todo hace que se aumente el atributo Nivel en 1, aplicando a todos sus atributos una bonificaci�n extra mediante sus Setters.
 */
    protected final void subeNivel(){
        Nivel++;
        setVida((int)(getVida()*1.1));
        setAtaque((int)(getAtaque()*1.1));
        setAgilidad((int)(getAgilidad()*1.1));
        setArmadura((int)(getArmadura()*1.1));
        setResistenciaMagica((int)(getResistenciaMagica()*1.1));
    }
   
/**
 * Este m�todo es un Setter que inicializar� el Nombre del Personaje.
 * @param no Recibe un atributo de tipo String que contendr� el Nombre.
 */
    public void setNombre(String no){
        if(checkNombre(no)){
            Nombre=no;
        }
    }
    
/**
 * Este m�todo es un Setter que inicializar� la Raza del Personaje.
 * @param ra Recibe un atributo de tipo String que contendr� la Raza.
 */
    public void setRaza(String ra){
        if(checkRaza(ra)){
            Raza=ra;
        }
    }
    
/**
 * Este m�todo es un Setter que inicializar� la Vida del Personaje.
 * @param vi Recibe un atributo de tipo int que contendr� los puntos de Vida.
 */
    public void setVida(int vi){
        Vida=vi;
    }
    
/**
 * Este m�todo es un Setter que inicializar� el Nivel del Personaje.
 * @param ni Recibe un atributo de tipo int que contendr� el Nivel.
 */
    public void setNivel(int ni){
        Nivel=ni;
    }
    
/**
 * Este m�todo es un Setter que inicializar� el Ataque del Personaje.
 * @param at Recibe un atributo de tipo int que contendr� los puntos de Ataque.
 */
    public void setAtaque(int at){
        Ataque=at;
    }
    
/**
 * Este m�todo es un Setter que inicializar� la Agilidad del Personaje.
 * @param ag Recibe un atributo de tipo int que contendr� los puntos de Agilidad.
 */
    public void setAgilidad(int ag){
        Agilidad=ag;
    }
    
/**
 * Este m�todo es un Setter que inicializar� la Armadura del Personaje.
 * @param ar Recibe un atributo de tipo int que contendr� los puntos de Armadura.
 */
    public void setArmadura(int ar){
        Armadura=ar;
    }
    
/**
 * Este m�todo es un Setter que inicializar� la Resistencia Magica del Personaje.
 * @param rm Recibe un atributo de tipo int que contendr� los puntos de Resistencia M�gica.
 */
    public void setResistenciaMagica(int rm){
        ResistenciaMagica=rm;
    }
    
/**
 * Este m�todo es un Getter que devuelve un atributo de tipo String.
 * @return Devuelve el Nombre del Personaje. Al ser Final nunca podr� ser usado en otra clase si ha sido modificado.
 */
    public final String getNombre(){
        return Nombre;
    }
   
/**
 * Este m�todo es un Getter que devuelve un atributo de tipo String.
 * @return Devuelve la Raza del Personaje. Al ser Final nunca podr� ser usado en otra clase si ha sido modificado.
 */
    public final String getRaza(){
        return Raza;
    }
    
/**
 * Este m�todo es un Getter que devuelve un atributo de tipo int.
 * @return Devuelve la Vida del Personaje. Al ser Final nunca podr� ser usado en otra clase si ha sido modificado.
 */
    public final int getVida(){
        return Vida;
    }
    
/**
 * Este m�todo es un Getter que devuelve un atributo de tipo int.
 * @return Devuelve los puntos de Ataque del Personaje. Al ser Final nunca podr� ser usado en otra clase si ha sido modificado.
 */
    public final int getAtaque(){
        return Ataque;
    }
    
/**
 * Este m�todo es un Getter que devuelve un atributo de tipo int.
 * @return Devuelve los puntos de Agilidad del Personaje. Al ser Final nunca podr� ser usado en otra clase si ha sido modificado.
 */
    public final int getAgilidad(){
        return Agilidad;
    }
    
/**
 * Este m�todo es un Getter que devuelve un atributo de tipo int.
 * @return Devuelve los puntos de Armadura del Personaje. Al ser Final nunca podr� ser usado en otra clase si ha sido modificado.
 */
    public final int getArmadura(){
        return Armadura;
    }
    
/**
 * Este m�todo es un Getter que devuelve un atributo de tipo int.
 * @return Devuelve los puntos de Resistencia Magica del Personaje. Al ser Final nunca podr� ser usado en otra clase si ha sido modificado.  
 */
    public final int getResistenciaMagica(){
        return ResistenciaMagica;
    }
    
/**
 * Este m�todo es un Getter que devuelve un atributo de tipo int. Al ser Final nunca podr� ser usado en otra clase si ha sido modificado.
 * @return Devuelve el Nivel del Personaje.  
 */
    public final int getNivel(){
        return Nivel;
    }
    
/**
 * Este m�todo imprime por pantalla un String que determina un Ataque usando los Getters del Nombre y Ataque del Personaje.
 */
    public void luchar(){
        System.out.println("El personaje " + getNombre() + " ataca con " + getAtaque() + " puntos de da�o.\n");
    }
    
/**
 * Este m�todo imprime por pantalla un String que determina una Defensa usando los Getters del Nombre, Armadura y Resistencia Magica del Personaje.
 */
    public void defender(){
        System.out.println(getNombre() + " tiene " + getVida() + " puntos de Vida, " + getArmadura() + " puntos de Armadura " + " y " + getResistenciaMagica() + " puntos de Resistencia Magica\n");
    }
    
/**
 * Este m�todo Abstact est� destinado a usarse en subclases de Personaje.
 * @return Devolver� un String describiendo el estado del Personaje en cuesti�n.
 */
    public abstract String toString();
}
