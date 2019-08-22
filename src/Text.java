/*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.*/

import java.util.Arrays;

public class Text {

    private String title;
    private Sentence[] text;

    public Text(String title, Sentence... sentence) {
        this.title = title;
        this.text = sentence;
    }

    public void addText(Word... word) {
        Sentence newSentence = new Sentence(word);
        text = Arrays.copyOf(text, 3);
        text[text.length - 1] = newSentence;
    }

    public void printText() {
        StringBuilder text = new StringBuilder();
        System.out.println(title);

        for (Sentence sentence : this.text) {
            for (Word word : sentence.getSentence()) {
                text.append(word.getWord());
                text.append(" ");
            }
            text.deleteCharAt(text.length() - 1);
            text.append(". ");
        }
        String strText = new String(text);
        System.out.println(strText);
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
