package tienda;

/**
 * Calcula precios de una tienda online.
 * @author Administrator
 * @version 1.0
 */
public class Tienda {
 
    /**
     * Le da un valor al IVA.
     * 
     */
    public static final double IVA = 0.21;
 
    /**
     * Calcula el precio de un producto con el IVA incluido.
     *
     * @param precio el precio sin IVA, en euros
     * @return precio con IVA
     */
    public static double precioConIva(double precio) {
        return precio + precio * IVA;
    }
 
    /**
     * Aplica un descuento a un precio.
     *
     * @param precio el precio original, en euros
     * @param descuento el descuento
     * @return el precio con el descuento aplicado, en euros
     */
    public static double aplicarDescuento(double precio, int descuento) {
        return precio - precio * descuento / 100;
    }
 
    /**
     * Devuelve precio >= 50.
     *
     * @param precio el importe del pedido, en euros
     * @return precio menor o igual a cincuenta
     */
    public static boolean envioGratis(double precio) {
        return precio >= 50;
    }
 
    /**
     * Muestra por pantalla una línea del ticket de compra.
     *
     * @param producto el nombre del producto
     * @param precio el precio sin IVA, en euros
     * 
     */
    public static void mostrarTicket(String producto, double precio) {
        System.out.println(producto + ": " + precioConIva(precio) + " euros");
    }
 
    /**
     * Calcula cuántas unidades se pueden comprar con un presupuesto.
     *
     * @param precio el precio de una unidad, en euros
     * @param presupuesto dinero a disposicion
     * @return unidades posibles a comprar
     */
    public static int unidadesPosibles(double precio, double presupuesto) {
        return (int) (presupuesto / precio);
    }
 
    /**
     * Prueba los métodos de la clase mostrando sus resultados.
     *
     * @param args argumentos de la línea de órdenes (no se usan)
     */
    public static void main(String[] args) {
        System.out.println("Con IVA: " + precioConIva(100));
        System.out.println("Con descuento: " + aplicarDescuento(80, 25));
        System.out.println("¿Envío gratis? " + envioGratis(60));
        mostrarTicket("Ratón", 10);
        System.out.println("Unidades: " + unidadesPosibles(7.5, 40));
    }
}