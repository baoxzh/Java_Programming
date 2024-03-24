public class StockTradeAnalyzer {
    public static void main(String[] args) {
        // 1. 定义股票购买和卖出价格
        double purchasePrice = 100.0; // 购买价格
        double sellingPrice = 150.0;  // 卖出价格
        // 这段代码定义了两个双精度浮点数变量purchasePrice和sellingPrice，分别代表股票的购买价格和卖出价格。
        // 2. 计算收益或亏损
        double profitOrLoss = sellingPrice - purchasePrice;
        // 使用卖出价格减去购买价格，得到的结果存储在profitOrLoss变量中，这个变量就是我们的利润或者亏损。如果结果为正，那么就是盈利，否则就是亏损。
        // 3. 判断是否盈利
        double certainValue = 10.0; //特定值
        boolean isProfit = sellingPrice > purchasePrice && profitOrLoss > certainValue;
        // 首先定义了一个特定值certainValue，然后使用了逻辑与运算符&&来判断是否盈利。如果卖出价格大于购买价格且利润大于特定值，那么isProfit就将被设置为true，否则为false。
        // 4. 使用条件运算符来输出结果
        String result = isProfit ? "盈利" : "亏损";
        System.out.println("交易结果：" + result);
    }
}