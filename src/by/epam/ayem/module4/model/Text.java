package by.epam.ayem.module4.model;

/*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.*/

import java.util.ArrayList;
import java.util.List;

public class Text {

    private String title;
    private final List<Sentence> sentences;

    public Text(String title) {
        this.title = title;
        sentences = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }
}
