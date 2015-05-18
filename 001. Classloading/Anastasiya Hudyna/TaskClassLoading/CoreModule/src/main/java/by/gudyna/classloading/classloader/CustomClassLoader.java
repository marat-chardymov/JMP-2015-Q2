package by.gudyna.classloading.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class CustomClassLoader extends ClassLoader
{
    private String dirPath;
    private Map<String, Class> cache = new HashMap<String, Class>();

    public CustomClassLoader(String dirPath)
    {
        super(CustomClassLoader.class.getClassLoader());
        this.dirPath = dirPath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException
    {
        // find class among loaded before classes
        Class result = cache.get(name);

        // load class from file
        if (result == null)
        {
            try
            {
                byte[] classByte = loadClassData(name);
                result = defineClass(name, classByte, 0, classByte.length, null);
                cache.put(name, result);
            }
            catch (IOException ex)
            {
                throw new ClassNotFoundException(ex.getMessage());
            }
        }

        return result;
    }

    private byte[] loadClassData(String className) throws IOException
    {
        String fileClassName = prepareClassFileName(className);
        File fileClass = new File(fileClassName);
        InputStream is = new FileInputStream(fileClass);
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        int nextValue = is.read();
        while (nextValue != -1)
        {
            byteStream.write(nextValue);
            nextValue = is.read();
        }

        return byteStream.toByteArray();
    }

    private String prepareClassFileName(String className)
    {
        StringBuilder builder = new StringBuilder(dirPath);
        builder.append("/");
        builder.append(className);
        builder.append(".class");

        return builder.toString();
    }

}
