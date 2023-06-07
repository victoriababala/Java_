import java.util.Date;

// Напишіть клас записної книжки. Поля: дата та нотатка. Продемонструйте роботу
public class Task19 {
    public static void main(String[] args) {

        Notebook entry1 = new Notebook(new Date(), "Перша нотатка");

        entry1.setDate(new Date());
        entry1.setNote("Нова нотатка");

        System.out.println("Дата: " + entry1.getDate());
        System.out.println("Нотатка: " + entry1.getNote());
    }
}
 class Notebook {
    private Date date;
    private String note;

    public Notebook(Date date, String note) {
        this.date = date;
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}