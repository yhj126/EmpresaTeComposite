// Clase principal Empaquetador
public class EmpaquetadorDeTe {
    public static void main(String[] args) {
        // Crear cajas de té
        CajaTe cajaTeBlancoP1 = new CajaTe("Té Blanco", 100);
        CajaTe cajaTeBlancoP2 = new CajaTe("Té Blanco", 20);
        CajaTe cajaTeVerdeP1 = new CajaTe("Té Verde", 24);
        CajaTe cajaTeBlancoP3 = new CajaTe("Té Blanco", 100);
        CajaTe cajaTeBlancoP4 = new CajaTe("Té Blanco", 7);
        CajaTe cajaTeVerdeP2 = new CajaTe("Té Verde", 1);

        // Crear paquete 1
        Paquete paquete1 = new Paquete();
        paquete1.add(cajaTeBlancoP1);
        paquete1.add(cajaTeBlancoP2);
        paquete1.add(cajaTeVerdeP1);
        paquete1.imprimir();
        //System.out.println("Este paquete consta de " + paquete1.getContenido() + " unidades");

        // Crear paquete 2
        Paquete paquete2 = new Paquete();
        paquete2.add(cajaTeBlancoP3);
        paquete2.add(cajaTeBlancoP4);
        paquete2.add(cajaTeVerdeP2);
        paquete2.imprimir();
        //System.out.println("Este paquete consta de " + paquete2.getContenido() + " unidades");

        // Crear envío a Asia
        Paquete envioAsia = new Paquete();
        envioAsia.add(paquete1);
        envioAsia.add(paquete2);
        envioAsia.imprimir();

        //System.out.println("Este paquete consta de " + envioAsia.getContenido() + " unidades");
        //System.out.println("El envío a Asia contiene " + envioAsia.getContenido() + " unidades de té");

        System.out.println("Este paquete consta de " + paquete1.getContenido() + " unidades");
        System.out.println("Este paquete consta de " + paquete2.getContenido() + " unidades");
        System.out.println("Este paquete consta de " + envioAsia.getContenido() + " unidades");
        System.out.println("El envío a Asia contiene " + envioAsia.getContenido() + " unidades de té");
    }
}
