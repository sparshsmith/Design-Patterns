public class Main {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logger.log(LogProcessor.INFO,"This is info");
        logger.log(LogProcessor.ERROR,"This is error");
        logger.log(LogProcessor.DEBUG,"This is debug");
    }
}