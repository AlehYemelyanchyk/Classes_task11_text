package by.epam.ayem.module4;

/*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.*/

import java.util.Arrays;

public class TextMaker {

    private Text text;

    public TextMaker(Text text) {
        this.text = text;
    }

    public void addText(Word... word) {
        Sentence newSentence = new Sentence(word);

        text.setText(Arrays.copyOf(text.getText(), (text.getText().length + 1)));
        text.getText()[text.getText().length - 1] = newSentence;
    }

    public void printText() {
        StringBuilder text = new StringBuilder();
        System.out.println(this.text.getTitle());

        for (Sentence sentence : this.text.getText()) {
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
}
