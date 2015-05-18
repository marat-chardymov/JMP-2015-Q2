package by.gudyna.classloading.core;

import by.gudyna.classloading.classloader.CustomClassLoader;
import by.gudyna.classloading.plugin.Plugin;

public class CoreModule {

    public static final void main(String... args) throws Exception
    {
        String filePathForLoader = args[0];
        String className = args[1];
        CustomClassLoader loader = new CustomClassLoader(filePathForLoader);
        Class pluginClass = loader.loadClass(className);


        Plugin plugin = (Plugin) pluginClass.newInstance();
        plugin.doWork();
    }
}
