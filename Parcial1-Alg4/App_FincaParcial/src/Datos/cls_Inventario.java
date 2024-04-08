package Datos;
import Datos.cls_implementos;
import java.util.LinkedList;
//LUISA FERNANDA HERNANDEZ URREGO
public class cls_Inventario {
 
    private LinkedList<cls_implementos> implementos;

    public cls_Inventario() {
        implementos = new LinkedList<>();
    }

    public boolean registrarImplemento(cls_implementos implemento) {

        for (cls_implementos imp : implementos) {
            if (imp.getCodigo().equals(implemento.getCodigo())) {
                return false;
            }
        }

        implementos.add(implemento);
        return true;
    }

    /*public void registrarImplemento(cls_implementos implemento) {
        implementos.add(implemento);
    }*/

    public cls_implementos consultarImplemento(String codigo) {
        for (cls_implementos implemento : implementos) {
            if (implemento.getCodigo().equals(codigo)) {
                return implemento;
            }
        }
        return null;
    }
}