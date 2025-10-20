package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
                            int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    // ✅ Getter que el test necesita
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    // ✅ Método que el test busca: devuelve la fecha formateada como String
    public String getFormattedDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    @Override
    public String getSpecificData() {
        String formattedDate = getFormattedDate(this.expirationDate);

        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del producto: ").append(this.name).append("\n");
        sb.append("ID único: ").append(this.uniqueId).append("\n");
        sb.append("Responsable: ").append(this.responsibleId).append("\n");
        sb.append("Ubicación: ").append(getLocation()).append("\n");
        sb.append("Cantidad: ").append(this.quantity).append("\n");
        sb.append("Fecha de caducidad: ").append(formattedDate);

        return sb.toString();
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }
}
