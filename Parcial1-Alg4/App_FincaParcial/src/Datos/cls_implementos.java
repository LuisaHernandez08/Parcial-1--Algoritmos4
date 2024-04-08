package Datos;
import java.util.LinkedList;
//LUISA FERNANDA HERNANDEZ URREGO
public class cls_implementos {
    
    private String codigo;
    private String nombre;
    private String descripcion;
    private String tipo;

    public cls_implementos(String codigo, String nombre, String descripcion, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }
}
