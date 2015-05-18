
import by.gudyna.classloading.plugin.Plugin;

public class PluginImpl implements Plugin
{
    @Override
    public void doWork() {
        System.out.println("Hello, world!");
    }
}
