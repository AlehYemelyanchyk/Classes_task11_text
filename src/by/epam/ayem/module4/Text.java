package by.epam.ayem.module4;

/*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.*/

public class Text {

    private String title = "No title";
    private Sentence[] text;

    public Text() {
    }

    public Text(String title, Sentence... sentences) {
        this.title = title;
        this.text = sentences;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Sentence[] getText() {
        return text;
    }

    public void setText(Sentence[] text) {
        this.text = text;
    }
}
