import java.util.ArrayList;

public class Departamento {
    private int iddep;
    private String nombredep;
    private Producto producto;
    static ArrayList<Producto> productodata = new ArrayList<>();

    // Metodo contructor
    public Departamento(int iddep, String nombredep) {
        this.iddep = iddep;
        this.nombredep = nombredep;
    }

    // GET Y SET
    public void setIddep(int iddep) {
        this.iddep = iddep;
    }

    public void setNombredep(String nombredep) {
        this.nombredep = nombredep;
    }

    public static void setProductodata(ArrayList<Producto> productodata) {
        Departamento.productodata = productodata;
    }

    public int getIddep() {
        return iddep;
    }

    public String getNombredep() {
        return nombredep;
    }

    public static ArrayList<Producto> getProductodata() {
        return productodata;
    }

    public void agregarProducto(Producto Producto) {
        Departamento.productodata.add(Producto);
    }

    public void Eliminar(int idproducto) {
        productodata.removeIf(producto -> producto.getId() == idproducto);
    }

    public void Actualizar(int id, double nuevoPrecio) {
        for (Producto producto : productodata) {
            if (producto.getId() == id) {
                producto.setPrecio(nuevoPrecio);
                break;

            }

        }

    }

    public Producto consultarStock(int idstock) {
        for (Producto producto : productodata) {
            if (producto.getId() == idstock) {
                return producto;
            }
        }
        return null;

    }

    }


