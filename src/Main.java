import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tiendas tienda = new Tiendas("Tienda de Ropa");
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Agregar un Departamento");
            System.out.println("2. Listar Departamentos");
            System.out.println("3. Agregar Producto a un Departamento");
            System.out.println("4. Listar Productos de un Departamento");
            System.out.println("5. Actualizar Precio de un Producto");
            System.out.println("6. Eliminar Producto de un Departamento");
            System.out.println("7. Consultar Stock de un Producto");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del Departamento: ");
                    int idDep = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del Departamento: ");
                    String nombreDep = scanner.nextLine();
                    tienda.agregardepartamento(new Departamento(idDep, nombreDep));
                    System.out.println("Departamento agregado exitosamente.");
                    break;

                case 2:
                    System.out.println("Departamentos en la tienda:");
                    tienda.litardep();
                    break;

                case 3:
                    System.out.print("Ingrese el ID del Departamento al que desea agregar un producto: ");
                    idDep = scanner.nextInt();
                    Departamento departamento = tienda.buscardep(idDep);
                    if (departamento != null) {
                        System.out.print("Ingrese el ID del Producto: ");
                        int idProducto = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Ingrese el nombre del Producto: ");
                        String nombreProducto = scanner.nextLine();
                        System.out.print("Ingrese el precio del Producto: ");
                        double precioProducto = scanner.nextDouble();
                        System.out.print("Ingrese la cantidad en stock del Producto: ");
                        int cantidadProducto = scanner.nextInt();
                        departamento.agregarProducto(new Producto(idProducto, nombreProducto, precioProducto, cantidadProducto));
                        System.out.println("Producto agregado exitosamente al Departamento.");
                    } else {
                        System.out.println("Departamento no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el ID del Departamento para listar sus productos: ");
                    idDep = scanner.nextInt();
                    departamento = tienda.buscardep(idDep);
                    if (departamento != null) {
                        System.out.println("Productos en el Departamento " + departamento.getNombredep() + ":");
                        for (Producto producto : departamento.getProductodata()) {
                            System.out.println(producto);
                        }
                    } else {
                        System.out.println("Departamento no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese el ID del Departamento: ");
                    idDep = scanner.nextInt();
                    departamento = tienda.buscardep(idDep);
                    if (departamento != null) {
                        System.out.print("Ingrese el ID del Producto a actualizar: ");
                        int idProducto = scanner.nextInt();
                        Producto producto = departamento.consultarStock(idProducto);
                        if (producto != null) {
                            System.out.print("Ingrese el nuevo precio: ");
                            double nuevoPrecio = scanner.nextDouble();
                            producto.setPrecio(nuevoPrecio);
                            System.out.println("Precio actualizado exitosamente.");
                        } else {
                            System.out.println("Producto no encontrado.");
                        }
                    } else {
                        System.out.println("Departamento no encontrado.");
                    }
                    break;

                case 6:
                    System.out.print("Ingrese el ID del Departamento: ");
                    idDep = scanner.nextInt();
                    departamento = tienda.buscardep(idDep);
                    if (departamento != null) {
                        System.out.print("Ingrese el ID del Producto a eliminar: ");
                        int idProducto = scanner.nextInt();
                        departamento.Eliminar(idProducto);
                        System.out.println("Producto eliminado exitosamente.");
                    } else {
                        System.out.println("Departamento no encontrado.");
                    }
                    break;

                case 7:
                    System.out.print("Ingrese el ID del Departamento: ");
                    idDep = scanner.nextInt();
                    departamento = tienda.buscardep(idDep);
                    if (departamento != null) {
                        System.out.print("Ingrese el ID del Producto para consultar su stock: ");
                        int idProducto = scanner.nextInt();
                        Producto producto = departamento.consultarStock(idProducto);
                        if (producto != null) {
                            System.out.println("Stock actual del producto: " + producto.getCantidad());
                        } else {
                            System.out.println("Producto no encontrado.");
                        }
                    } else {
                        System.out.println("Departamento no encontrado.");
                    }
                    break;

                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 8);

        scanner.close();
    }
}
