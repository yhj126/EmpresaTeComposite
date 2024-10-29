import java.util.ArrayList;
import java.util.List;

// Clase Paquete que contiene otras cajas o son paquetes de tées
class Paquete implements Caja {
    private List<Caja> cajas = new ArrayList<>();

    @Override
    public int getContenido() {
        int cantidad = 0;
        for (Caja c :
                cajas) {
            cantidad += c.getContenido();
        }
        return cantidad;
    }

    @Override
    public void add(Caja caja) {
        cajas.add(caja);

    }

    @Override
    public void remove(Caja caja) {
        cajas.remove(caja);
    }

    @Override
    public void imprimir() {
        for (Caja c : cajas
        ) {
            c.imprimir();
        }
    }
}
