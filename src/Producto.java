public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;

    //Metodo constructor
    public Producto(int id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio ;
        this.cantidad = cantidad ;
    }

    //Metodos get y set


    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("Error: La cantidad no puede ser negativa.");
        }
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }


    @Override
    public String toString() {
        return "Producto{" +
                "ID=" + id +
                ", Nombre='" + nombre + '\'' +
                ", Precio=" + precio +
                ", Cantidad=" + cantidad +
                '}';
    }

}

