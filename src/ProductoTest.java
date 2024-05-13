import org.junit.*;
import static org.junit.Assert.*;


public class ProductoTest {
    static Producto producto1;

    @BeforeClass
    public static void init() {
        System.out.println("beforeClass()");
        producto1 = new Producto("Samsung", 300, "Version 6", 100);
    }

    @Before
    public void setUp() {
        // Este código se ejecuta antes de cada prueba
        System.out.println("before");
    }

    @Test
    public void testEsMasCaro() {
        Producto producto2 = new Producto("Iphone", 500, "Version x", 80);
        assertTrue(producto2.esMasCaro(producto1));
    }

    @Test
    public void testAgregarCantidadEnAlmacen() {
        Producto producto = new Producto("Laptop", 99.99, "Laptop HP", 30);
        System.out.println("Cantidad antes de aumentar: " + producto.getCantidadEnAlmacen());
        producto.agregarCantidad(20);
        System.out.println("Cantidad después de aumentar: " + producto.getCantidadEnAlmacen());
        assertEquals("La cantidad en almacén debería aumentar a 50", 50, producto.getCantidadEnAlmacen());
    }
    @Test
    public void testDisminuirCantidadEnAlmacen() {
        Producto producto = new Producto("Teclado", 29.99, "Teclado GAMER", 100);
        System.out.println("Cantidad antes de disminuir: " + producto.getCantidadEnAlmacen());
        producto.disminuirCantidad(30);
        System.out.println("Cantidad después de disminuir: " + producto.getCantidadEnAlmacen());
        assertEquals("La cantidad en almacén debería disminuir a 70", 70, producto.getCantidadEnAlmacen());
    }

    @Test
    public void testActualizarDescripcionProducto() {
        Producto producto = new Producto("Altavoz", 50.00, "Altavoz Bluetooth chico", 75);
        System.out.println("Descripción actual: " + producto.getDescripcion());
        producto.setDescripcion("Altavoz Bluetooth 5 velocidades");
        System.out.println("Descripción actualizada: " + producto.getDescripcion());
        assertEquals("La descripción del producto debería actualizarse", "Altavoz Bluetooth 5 velocidades", producto.getDescripcion());
    }
    
    @Test
    public void testActualizarPrecioProducto() {
        Producto producto = new Producto("Mouse", 19.99, "Mouse inalámbrico", 50);
        producto.setPrecio(24.99);
        System.out.println("Precio actualizado: " + producto.getPrecio());
        assertEquals("El precio del producto debería actualizarse a 24.99", 24.99, producto.getPrecio(), 0.001);
    }
    


    @After
    public void tearDown() {
        // Este código se ejecuta después de cada prueba
        System.out.println("After tearDown");
    }

    @AfterClass
    public static void AfterClass() {
        // Este código se ejecuta una vez después de todas las pruebas
        System.out.println("afterClass");
    }
}
