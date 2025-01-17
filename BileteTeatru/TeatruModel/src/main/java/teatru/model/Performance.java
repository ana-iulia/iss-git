package teatru.model;


import java.time.LocalDate;
import java.util.Objects;

public class Performance extends Entity<String> {
    private String title;
    private LocalDate date;
    private String type;
    private String director;
    private int price;
    private String description;


    public Performance(String title,LocalDate date,String type,String director,int price,String description){
        this.title=title;
        this.date=date;
        this.type=type;
        this.director=director;
        this.price=price;
        this.description=description;
    }
    public Performance(String id,String title,LocalDate date,String type,String director,int price,String description) {
        setId(id);
        this.title = title;
        this.date = date;
        this.type = type;
        this.director = director;
        this.price = price;
        this.description = description;
    }
    public Performance(){}
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", type='" + type + '\'' +
                ", director='" + director + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Performance that = (Performance) o;
        return price == that.price &&
                Objects.equals(title, that.title) &&
                Objects.equals(date, that.date) &&
                Objects.equals(type, that.type) &&
                Objects.equals(director, that.director) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, date, type, director, price, description);
    }
}