public class Producto {
    private String nombre;
    private double precio;
    private String descripcion;
    private int cantidadEnAlmacen;

    public Producto(String nombre, double precio, String descripcion, int cantidadEnAlmacen) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidadEnAlmacen = cantidadEnAlmacen;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadEnAlmacen() {
        return cantidadEnAlmacen;
    }

    public void setCantidadEnAlmacen(int cantidadEnAlmacen) {
        this.cantidadEnAlmacen = cantidadEnAlmacen;
    }
    public boolean esMasCaro(Producto otroProducto) {
        return this.precio > otroProducto.getPrecio();
    }
    public void agregarCantidad(int cantidad) {
        this.cantidadEnAlmacen += cantidad;
    }
    public void disminuirCantidad(int cantidad) {
        this.cantidadEnAlmacen -= cantidad;
    }
}
