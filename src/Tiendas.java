import java.util.ArrayList;

public class Tiendas {
    private String nombretienda;
    static ArrayList<Departamento> departamentodata = new ArrayList<>();

    public Tiendas(String nombretienda) {
        this.nombretienda = nombretienda;
    }

    public void setNombretienda(String nombretienda) {
        this.nombretienda = nombretienda;
    }

    public void agregardepartamento(Departamento departamento) {
        departamentodata.add(departamento);
    }

    public void setDepartamentodata(ArrayList<Departamento> departamentos) {
       this.departamentodata = departamentos;
    }

    public String getNombretienda() {
        return nombretienda;
    }

    public static ArrayList<Departamento> getDepartamentodata() {
        return departamentodata;

    }
    public Departamento buscardep(int idepartamento){
        for (Departamento departamento: departamentodata){
            if (departamento.getIddep() == idepartamento){
                return departamento;
            }

        }
        return null;

    }
    public void litardep(){
        for(Departamento departamento: departamentodata){
            System.out.println(departamento);
        }
    }

}

