package by.epam.ayem.module4;

/*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.*/

import by.epam.ayem.module4.model.Sentence;
import by.epam.ayem.module4.model.Text;
import by.epam.ayem.module4.model.Word;
import by.epam.ayem.module4.service.TextService;

public class TextMain {

    public static void main(String[] args) {
        Word word1 = new Word("This");
        Word word2 = new Word("is");
        Word word3 = new Word("it");
        Word word4 = new Word("I");
        Word word5 = new Word("wrote");
        Word word6 = new Word("the");
        Word word7 = new Word("sentence");
        Sentence sentence1 = new Sentence(word4, word5, word6, word7);
        Sentence sentence2 = new Sentence(word1, word2, word3);
        TextService textService = new TextService();
        Text myText = textService.createText("My text");
        textService.addSentence(myText, sentence1);
        textService.addSentence(myText, sentence2);
        textService.printText(myText);

    }
}
