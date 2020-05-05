package Exercise1;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Class called Status, it works to create a status for the purchase
 *
 * @Version 1, 5 Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class Status {

    private StatusEnum description;
    private GregorianCalendar date;

    public Status(StatusEnum description, GregorianCalendar date) {
        this.description = StatusEnum.PROCESS_WAITING;
        this.date = date;
    }

    /**
     * getDateInSimpleDateFormat method, it works to get date in the simple date
     * format
     *
     * @return dateFormatted
     */
    public String getDateInSimpleDateFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy – mm:ss:S");
        String dateFormatted = simpleDateFormat.format(date.getTime());
        return dateFormatted;
    }

    public StatusEnum getDescription() {
        return description;
    }

    public void setDescription(StatusEnum description) {
        this.description = description;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    /**
     * updateStatus method, it works to update the status of the purchase
     *
     * @return if the status has been modified
     */
    public boolean updateStatus() {
        if (description == StatusEnum.PROCESS_WAITING) {
            description = StatusEnum.PROCESSING;
            return true;
        }
        if (description == StatusEnum.PROCESSING) {
            description = StatusEnum.DISPATCH_WAITING;
            return true;
        }
        if (description == StatusEnum.DISPATCH_WAITING) {
            description = StatusEnum.IN_TRANSIT;
            return true;
        }
        if (description == StatusEnum.IN_TRANSIT) {
            description = StatusEnum.DELIVERED;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Status{" + "description=" + description + ", date=" + getDateInSimpleDateFormat() + '}';
    }
}
