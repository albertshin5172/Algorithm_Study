class Pair {
    int price;
    int span;

    // Stores stock price and its calculated span
    Pair(int price, int span) {
        this.price = price;
        this.span = span;
    }
}

class StockSpanner {
    private Stack<Pair> stack;

    // Initialize an empty monotonic decreasing stack
    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1; // Each day counts as at least 1

        // Merge all previous prices that are less than or equal to current price
        while (!stack.isEmpty() && stack.peek().price <= price) {
            span += stack.pop().span;
        }

        // Push current price with its accumulated span
        stack.push(new Pair(price, span));

        // Return the span for today's price
        return span;
    }
}
/*
class StockSpanner {
    private Stack<int[]> stack;

    // Each element stores {price, span}
    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        // Accumulate spans of all previous prices less than or equal to current price
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }

        // Store current price with its computed span
        stack.push(new int[]{price, span});

        return span;
    }
}
*/
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */