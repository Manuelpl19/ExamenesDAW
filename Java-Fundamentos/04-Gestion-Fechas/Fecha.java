public class Fecha {

    
    private int dia;
    private int mes;
    private int ano;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    /**
     * Constructor parametrizado.
     * Valida la fecha. Si es incorrecta, asigna 01/01/1970.
     */
    public Fecha(int dia, int mes, int ano) {
        if (validarFecha(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            // Fecha por defecto según enunciado
            this.dia = 1;
            this.mes = 1;
            this.ano = 1970;
            System.err.println("⚠️ Fecha inicial incorrecta (" + dia + "/" + mes + "/" + ano + "). Se ha establecido 01/01/1970.");
        }
    }

    // MÉTODOS 
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAno() { return ano; }


    public void setDia(int dia) {
        if (validarFecha(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            System.err.println("❌ Error: Día " + dia + " no válido para el mes actual.");
        }
    }

    public void setMes(int mes) {
        if (validarFecha(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            System.err.println("❌ Error: Mes " + mes + " inválido o incompatible con el día actual.");
        }
    }

    public void setAno(int ano) {
        if (validarFecha(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            System.err.println("❌ Error: Año " + ano + " inválido (posible conflicto con bisiestos).");
        }
    }

    

    
    // Comprueba si un año es bisiesto.
    // Regla: Divisible entre 400 O (Divisible entre 4 Y NO divisible entre 100)
     
    public boolean esBisiesto(int ano) {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }

    
    // Devuelve el número máximo de días de un mes concreto.

    public int diaMaximoMes(int mes, int ano) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return esBisiesto(ano) ? 29 : 28;
            default:
                return 0; // Mes incorrecto
        }
    }

    
    //Valida si una combinación de día, mes y año es correcta.
    
    public boolean validarFecha(int dia, int mes, int ano) {
        // 1. Validar rango del mes (1-12)
        if (mes < 1 || mes > 12) {
            return false;
        }
        
        // 2. Validar rango del día según el mes
        int maxDias = diaMaximoMes(mes, ano);
        if (dia < 1 || dia > maxDias) {
            return false;
        }
        
        // 3. Validar año (asumimos que debe ser positivo)
        if (ano < 0) {
            return false;
        }

        return true;
    }

    public String toString() {
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }
}