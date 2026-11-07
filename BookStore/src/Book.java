public class Book {
    public String title;
    public short releaseYear;
    public Author author;
    public short pages;

    public Book(String title, short pages, short releaseYear, String name, String surname, byte rating) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.author = new Author(name, surname, rating);
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return title.contains(word) || author.name.contains(word) || author.surname.contains(word);
    }

    public int estimatePrice() {
        return Math.max(pages * 3 * (int) Math.floor(Math.sqrt(author.rating)), 250);
    }

    @Override
    public String toString() {
        return "Сводка.\n" +
                "Автор: " + author.name + " " + author.surname + ". С рейтингом " + author.rating + ".\n" +
                "Название: " + title + ".\n" +
                "Дата выхода: " + releaseYear + "г.\n" +
                "Количество страниц: " + pages + "стр.\n" +
                "Книга большая: " + isBig() + ".\n" +
                "Оценочная стоимость: " + estimatePrice() + "руб.";
    }
}
