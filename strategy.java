interface SortingStrategy {
    void sort(int[] numbers);
}

class BubbleSortStrategy implements SortingStrategy {
    public void sort(int[] numbers) {
        // Bubble sort implementation
    }
}

class QuickSortStrategy implements SortingStrategy {
    public void sort(int[] numbers) {
        // Quick sort implementation
    }
}

class SortingContext {
    private SortingStrategy strategy;

    void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    void executeStrategy(int[] numbers) {
        strategy.sort(numbers);
    }
}

/* 
 * Usage:
 * SortingContext context = new SortingContext();
 * context.setStrategy(new BubbleSortStrategy());
 * context.executeStrategy(numbers);
 */