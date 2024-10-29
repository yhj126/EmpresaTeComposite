// Clase Caja de Té
class CajaTe implements Caja {
    private String tipo;
    private int cantidadSobres;

    public CajaTe(String tipo, int sobres) {
        this.tipo = tipo;
        this.cantidadSobres = sobres;
    }

    @Override
    public int getContenido() {
        return cantidadSobres;
    }

    @Override
    public void add(Caja caja) {
    }

    @Override
    public void remove(Caja caja) {
    }

    @Override
    public void imprimir() {
        System.out.println("Añado una caja de " + tipo);
    }
}
