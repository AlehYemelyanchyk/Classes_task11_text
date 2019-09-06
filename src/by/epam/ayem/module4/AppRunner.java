package by.epam.ayem.module4;

/*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.*/

public class AppRunner {

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
        Text text = new Text("My title", sentence1, sentence2);
        TextMaker textMaker = new TextMaker(text);
        textMaker.addText(new Word("Or"), new Word("maybe"), new Word("not"));
        textMaker.printText();

    }
}
