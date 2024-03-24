public class TrafficLightController {
    public static void main(String[] args) {
        int hour = 20; // 当前时间，24小时制
        boolean isTrafficCongested = true; // 道路是否拥堵
        // 判断是白天还是夜晚
        boolean isDaytime = hour >= 6 && hour < 18;
        // 定义信号灯状态
        String lightStatus;
        // 控制信号灯状态
        if (isDaytime) {
            lightStatus = isTrafficCongested ? "红灯" : "绿灯";
        } else {
            // 模拟夜晚黄灯闪烁
            int blinkingInterval = 5; // 闪烁间隔（秒）
            int currentTime = (int) (System.currentTimeMillis() / 1000) % blinkingInterval;
            lightStatus = currentTime < blinkingInterval / 2 ? "黄灯" : "关闭";
        }
        // 输出信号灯状态
        System.out.println("当前信号灯状态： " + lightStatus);
        // 使用 Lambda 表达式简化判断逻辑
        SignalStatusCalculator statusCalculator = (time, congested) ->
                (time >= 6 && time < 18) ? (congested ? "红灯" : "绿灯") : "黄灯";
        System.out.println("Lambda信号灯状态： " + statusCalculator.calculateStatus(hour, isTrafficCongested));
    }
    @FunctionalInterface
    interface SignalStatusCalculator {
        String calculateStatus(int hour, boolean isTrafficCongested);
    }
}