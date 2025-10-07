public class TestChain {
    public static void main(String[] args) {
        Chain<Integer> ChainOfIntegers = new Chain<>(5);
        Chain<String> ChainOfWords = new Chain<>(5);

        int[] numbers = { 10, 20, 30, 40, 50 };
        String[] words = { "Alpha", "Bravo", "Charlie", "Delta", "Echo" };

        for (int elem : numbers)
            ChainOfIntegers.add(elem);

        for (String elem : words)
            ChainOfWords.add(elem);

        System.out.println(ChainOfIntegers.get(4));
        System.out.println(ChainOfWords.get(4));

    }
}
