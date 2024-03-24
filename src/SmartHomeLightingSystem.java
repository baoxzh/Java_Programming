public class SmartHomeLightingSystem {
    public static void main(String[] args) {
        String timeOfDay = "evening"; // "morning", "evening", "night"
        String weather = "cloudy";    // "sunny", "cloudy", "rainy"
        String roomStatus = "occupied"; // "empty", "occupied", "rest"
        // 根据时间和天气调节照明
        if ("morning".equals(timeOfDay) || "evening".equals(timeOfDay)) {
            if ("sunny".equals(weather)) {
                System.out.println("开窗帘，调低照明亮度");
            } else if ("cloudy".equals(weather) || "rainy".equals(weather)) {
                System.out.println("关窗帘，调高照明亮度");
            }
        } else if ("night".equals(timeOfDay)) {
            System.out.println("关闭窗帘，开启夜灯");
        }
        // 使用 switch 语句处理不同天气情况
        switch (weather) {
            case "sunny":
                System.out.println("保持窗帘开启");
                break;
            case "cloudy":
                System.out.println("半遮窗帘");
                break;
            case "rainy":
                System.out.println("关闭窗帘");
                break;
            default:
                System.out.println("保持默认窗帘状态");
                break;
        }
        // 使用条件运算符判断房间状态
        String lightStatus = "empty".equals(roomStatus) ? "关闭灯光" :
                "occupied".equals(roomStatus) ? "开启灯光" : "开启夜灯";
        System.out.println(lightStatus);
    }
}