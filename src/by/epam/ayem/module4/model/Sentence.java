package by.epam.ayem.module4.model;

/*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.*/

public class Sentence {

    private Word[] sentence;

    public Sentence(Word... word) {
        this.sentence = word;
    }

    public Word[] getSentence() {
        return sentence;
    }

    public void setSentence(Word[] sentence) {
        this.sentence = sentence;
    }
}
