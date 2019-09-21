package by.epam.ayem.module4.service;

/*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.*/

import by.epam.ayem.module4.model.Sentence;
import by.epam.ayem.module4.model.Text;
import by.epam.ayem.module4.model.Word;

public class TextService {

    public Text createText(String title) {
        return new Text(title);
    }

    public void addSentence(Text text, Sentence sentence) {
        text.getSentences().add(sentence);
    }

    public void printText(Text text) {
        StringBuilder sbText = new StringBuilder();
        System.out.println(text.getTitle());

        for (Sentence sentence : text.getSentences()) {
            for (Word word : sentence.getSentence()) {
                sbText.append(word.getWord());
                sbText.append(" ");
            }
            sbText.deleteCharAt(sbText.length() - 1);
            sbText.append(". ");
        }
        String strText = new String(sbText);
        System.out.println(strText);
    }
}
