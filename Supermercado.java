// Clase padre: Producto
public class Producto {
    // Atributos
    private String nombre;
    private double precio;
    private String codigo;

    // Constructor
    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    // Métodos
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Método para mostrar información del producto
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Código: " + codigo);
    }
}

// Clase hijo: ProductoPerecedero
public class ProductoPerecedero extends Producto {
    // Atributo adicional
    private String fechaExpiracion;

    // Constructor
    public ProductoPerecedero(String nombre, double precio, String codigo, String fechaExpiracion) {
        super(nombre, precio, codigo);
        this.fechaExpiracion = fechaExpiracion;
    }

    // Métodos
    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    // Método para mostrar información del producto perecedero
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de Expiración: " + fechaExpiracion);
    }
}

// Clase principal para probar la relación de herencia
public class Supermercado {
    public static void main(String[] args) {
        // Crear un producto general
        Producto producto = new Producto("Leche", 1.20, "001");
        producto.mostrarInformacion();

        System.out.println();

        // Crear un producto perecedero
        ProductoPerecedero productoPerecedero = new ProductoPerecedero("Yogurt", 0.80, "002", "2024-06-15");
        productoPerecedero.mostrarInformacion();
    }
}
